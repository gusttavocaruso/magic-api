package com.gustacaru.service;

import java.util.List;

import com.gustacaru.model.Card;

public interface CardInterface {

  public List<Card> findCards();

  public Card findCardById(String cardId);

  public Card cardRegister(Card card);

}
