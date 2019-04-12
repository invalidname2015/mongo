package com.sbmongo.poc.controllers;

import com.sbmongo.poc.domains.Game;
import com.sbmongo.poc.services.GameService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api("Game resources")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    /**
     * Game search feature from criterias
     * @return an Game's array
     **/
    @ApiOperation(value = "Return an array of games from criterias")
    @RequestMapping(value = "/game/list", method = RequestMethod.GET)
    public List<Game> getGameList(
            @RequestParam("title") String firstname,
            @RequestParam("editor") String lastname,
            @RequestParam("sort") String sortCriteria
    ) {
        return this.gameService.findGames(firstname,lastname,sortCriteria);
    }

    /**
     * Add a new Game into the library
     * @return the Game created
     */
    @ApiOperation(value = "Return the game item created")
    @RequestMapping(value="/game", method = RequestMethod.POST)
    public Game addGame(@RequestBody Game gameToAdd){
        return this.gameService.newGame(gameToAdd);
    }

    /**
     * Update an existing Game
     * @return the updated Game
     */
    @ApiOperation(value = "Return the game item updated")
    @RequestMapping(value="/game", method = RequestMethod.PUT)
    public Game updateGame(@RequestBody Game gameToUpdate){
        return this.gameService.updateGame(gameToUpdate);
    }

    /**
     * Delete a Game from the library
     * @return true if success, false otherwise
     */
    @ApiOperation(value = "Return true if succeed")
    @RequestMapping(value="/game", method=RequestMethod.DELETE)
    public boolean deleteGame(@RequestBody Game gameToDelete){
        return this.gameService.deleteGame(gameToDelete);
    }
}
