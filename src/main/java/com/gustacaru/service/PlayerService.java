package com.gustacaru.service;

import java.util.List;

import com.gustacaru.model.Card;
import com.gustacaru.model.Player;
import com.gustacaru.repository.PlayerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

  @Autowired
  private PlayerRepository playerRepository;

  @Autowired
  private CardService cardService;

  public List<Player> findPlayers() {
    return this.playerRepository.findAll();
  }

  public Player findPlayerById(String playerId) {
    return this.playerRepository
        .findById(playerId)
        .orElseThrow(() -> new IllegalArgumentException("Player not found"));
  }

  public Player registerPlayer(Player player) {
    return this.playerRepository.save(player);
  }

  public void addCardsToDeck(String playerId) {

    Player thisPlayer = findPlayerById(playerId);
    List<Card> cards = cardService.findCards();

    thisPlayer.setDeck(cards);
    this.playerRepository.save(thisPlayer);

    cardService.removeCards();

  }

  public void removeCardToDeck(String playerId, String cardId) {

    Player thisPlayer = findPlayerById(playerId);
    List <Card> deck = thisPlayer.getDeck();

    // System.out.println(deck);

    for (Card card : deck) {
      if (!card.getCardId().equals(cardId)) {
        System.out.println(card);
      }
    }

  }

}
