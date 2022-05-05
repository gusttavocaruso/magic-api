package com.gustacaru.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Player {

  @Id
  private String playerId;

  private String playerName;
  private String playerUsername;
  private String playerPassword;

  private ArrayList<Card> deck;

}
