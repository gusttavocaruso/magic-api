package com.gustacaru.service;

import java.util.List;

import com.gustacaru.model.Player;
import com.gustacaru.repository.PlayerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService implements PlayerInterface {

  @Autowired
  private PlayerRepository playerRepository;

  @Override
  public List<Player> findPlayers() {
    return this.playerRepository.findAll();
  }

  @Override
  public Player findPlayerById(String playerId) {
    return this.playerRepository
        .findById(playerId)
        .orElseThrow(() -> new IllegalArgumentException("Player not found"));
  }

  @Override
  public Player registerPlayer(Player player) {
    return this.playerRepository.save(player);
  }

}
