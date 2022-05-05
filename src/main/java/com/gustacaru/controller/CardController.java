package com.gustacaru.controller;

import java.util.List;

import com.gustacaru.model.Card;
import com.gustacaru.service.CardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cards")
public class CardController {

  @Autowired
  private CardService cardService;

  @GetMapping
  public List<Card> findCards() {
    return this.cardService.findCards();
  }

  @GetMapping("/{cardId}")
  public Card findPlayerById(@PathVariable String cardId) {
    return this.cardService.findCardById(cardId);
  }

  @PostMapping
  public Card cardRegister(@RequestBody Card card) {
    return this.cardService.cardRegister(card);
  }

}
