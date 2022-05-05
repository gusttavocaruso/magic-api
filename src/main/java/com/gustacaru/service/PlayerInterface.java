package com.gustacaru.service;

import java.util.List;

import com.gustacaru.model.Player;

public interface PlayerInterface {

  public List<Player> findPlayers();

  public Player findPlayerById(String playerId);

  public Player registerPlayer(Player player);

}
