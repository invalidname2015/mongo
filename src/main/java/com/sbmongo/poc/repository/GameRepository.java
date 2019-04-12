package com.sbmongo.poc.repository;

import com.sbmongo.poc.domains.Game;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GameRepository extends MongoRepository<Game,String> {
}
