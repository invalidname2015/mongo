package com.sbmongo.poc.services.impl;

import com.sbmongo.poc.domains.Game;
import com.sbmongo.poc.repository.GameRepository;
import com.sbmongo.poc.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Game Service Implementation
 */
@Service
public class GameServiceImpl{

    @Autowired
    private final GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> findGames(
            String firstname,
            String lastname,
            String sortCriteria
    ){
        return gameRepository.findAll();
    };
    public Game newGame(Game gameToAdd){
        return new Game();
    };
    public Game updateGame(Game gameToUpdate){
        return new Game();
    };
    public boolean deleteGame(Game gameToDelete){
        return true;
    };
}
