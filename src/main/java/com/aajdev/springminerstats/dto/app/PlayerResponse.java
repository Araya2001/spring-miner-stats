package com.aajdev.springminerstats.dto.app;

import com.aajdev.springminerstats.dto.clashroyale.player.tag.PlayerTagResponse;

public class PlayerResponse {
  String status;
  String message;
  PlayerTagResponse playerInformation;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public PlayerTagResponse getPlayerInformation() {
    return playerInformation;
  }

  public void setPlayerInformation(PlayerTagResponse playerInformation) {
    this.playerInformation = playerInformation;
  }
}
