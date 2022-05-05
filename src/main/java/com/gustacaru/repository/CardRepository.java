package com.gustacaru.repository;

import com.gustacaru.model.Card;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardRepository extends MongoRepository<Card, String> {
  
}
