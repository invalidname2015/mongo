package com.sbmongo.poc.bootstrap;

import com.sbmongo.poc.repository.GameRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = GameRepository.class)
public class MongoDBConfig {
}
