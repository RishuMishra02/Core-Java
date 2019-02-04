package com.rahul.serilization.serialVersionUID;

import java.io.Serializable;

public class Lion implements Serializable {

  private static final long serialVersionUID = 3L;
  private String sound;

  public Lion(String sound) {
	  
    this.sound = sound;
  }

  public String getSound() {
    return sound;
  }

}
