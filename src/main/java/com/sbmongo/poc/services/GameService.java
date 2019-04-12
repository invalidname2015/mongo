package com.sbmongo.poc.services;

import com.sbmongo.poc.domains.Game;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Game Service interface
 */
public interface GameService extends MongoRepository<Game, String> {

    /**
     * Find games from criterias
     *
     * @return Game item list
     **/
    List<Game> findGames(
            String firstname,
            String lastname,
            String sortCriteria
    );

    /**
     * Add a new game to the game's library
     *
     * @return Game item created
     */
    Game newGame(Game gameToAdd);

    /**
     * Update an existing game
     *
     * @return Game item updated
     */
    Game updateGame(Game gameToUpdate);

    /**
     * Delete a game from the game's library
     *
     * @return true if deleted, false otherwise
     */
    boolean deleteGame(Game gameToDelete);
}
