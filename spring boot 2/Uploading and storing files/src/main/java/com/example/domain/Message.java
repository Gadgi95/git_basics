package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String text;
  private String tag;

  private String filename;

  public String getText() {
    return text;
  }

  public String getTag() {
    return tag;
  }

  public String getFilename() {
    return filename;
  }
}
