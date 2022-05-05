package com.gustacaru.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Card {

  @Id
  private String cardId;

  private String cardName;
  private String edition;
  private String language;
  private boolean itsFoil;
  private double priceBRL;

}
