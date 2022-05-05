package com.gustacaru.repository;

import com.gustacaru.model.Player;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<Player, String> {
  
}
