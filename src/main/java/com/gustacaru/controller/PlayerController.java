package com.gustacaru.controller;

import java.util.List;

import com.gustacaru.model.Player;
import com.gustacaru.service.PlayerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class PlayerController {

  @Autowired
  private PlayerService playerService;

  @GetMapping
  public List<Player> findPlayers() {
    return this.playerService.findPlayers();
  }

  @GetMapping("/{playerId}")
  public Player findPlayerById(@PathVariable String playerId) {
    return this.playerService.findPlayerById(playerId);
  }

  @PostMapping
  public Player registerPlayer(@RequestBody Player player) {
    return this.playerService.registerPlayer(player);
  }

  @PutMapping("/add-deck/{playerId}")
  public String addCardsToDeck(@PathVariable String playerId) {
    this.playerService.addCardsToDeck(playerId);

    return "Cards add to Decks player";
  }

  @DeleteMapping("/{playerId}/{cardId}")
  public void removeACard(@PathVariable String playerId, @PathVariable String cardId) {
    this.playerService.removeCardToDeck(playerId, cardId);
  }

}
