package com.gustacaru.service;

import java.util.List;

import com.gustacaru.model.Card;
import com.gustacaru.repository.CardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

  @Autowired
  private CardRepository cardRepository;

  public List<Card> findCards() {
    return this.cardRepository.findAll();
  }

  public Card findCardById(String cardId) {
    return this.cardRepository
        .findById(cardId)
        .orElseThrow(() -> new IllegalArgumentException("Card not found"));
  }

  public Card cardRegister(Card card) {
    return this.cardRepository.save(card);
  }

  public void removeCards() {
    this.cardRepository.deleteAll();
  }

  public void removeCardById(String cardId) {
    this.cardRepository.deleteById(cardId);
  }

}
