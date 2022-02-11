package com.aajdev.springminerstats.dto.app;

import com.aajdev.springminerstats.dto.clashroyale.card.CardsResponse;
import com.aajdev.springminerstats.dto.clashroyale.clan.currentriver.ClanTagCurrentRiverResponse;
import com.aajdev.springminerstats.dto.clashroyale.clan.members.ClanTagMembersResponse;
import com.aajdev.springminerstats.dto.clashroyale.clan.name.ClanNameResponse;
import com.aajdev.springminerstats.dto.clashroyale.clan.river.ClanTagRiverResponse;
import com.aajdev.springminerstats.dto.clashroyale.clan.tag.ClanTagResponse;
import com.aajdev.springminerstats.dto.clashroyale.location.global.list.LocationsGlobalSeasonsQuery;
import com.aajdev.springminerstats.dto.clashroyale.location.global.playerranking.LocationsGlobalSeasonsIDRankingPlayers;
import com.aajdev.springminerstats.dto.clashroyale.location.id.LocationsIdResponse;
import com.aajdev.springminerstats.dto.clashroyale.location.list.LocationsResponse;
import com.aajdev.springminerstats.dto.clashroyale.location.ranking.clan.LocationsIdRankingClansResponse;
import com.aajdev.springminerstats.dto.clashroyale.location.ranking.clanwar.LocationsIdRankingClanWarsResponse;
import com.aajdev.springminerstats.dto.clashroyale.location.ranking.player.LocationsIdRankingPlayersResponse;
import com.aajdev.springminerstats.dto.clashroyale.player.battle.PlayerBattleLogResponse;
import com.aajdev.springminerstats.dto.clashroyale.player.tag.PlayerTagResponse;
import com.aajdev.springminerstats.dto.clashroyale.player.upcomingchest.PlayerTagUpcomingChestsResponse;
import com.aajdev.springminerstats.dto.clashroyale.tournament.name.TournamentNameResponse;
import com.aajdev.springminerstats.dto.clashroyale.tournament.tag.TournamentTagResponse;

public class TestResponse {
  private String status;
  private String message;
  private String testMessage;
  private ClanNameResponse clanNameResponse;
  private ClanTagResponse clanTagResponse;
  private ClanTagMembersResponse clanTagMembersResponse;
  private ClanTagRiverResponse clanTagRiverResponse;
  private ClanTagCurrentRiverResponse clanTagCurrentRiverResponse;
  private PlayerTagResponse playerTagResponse;
  private PlayerBattleLogResponse playerTagBattleLogResponse;
  private PlayerTagUpcomingChestsResponse playerTagUpcomingChestsResponse;
  private CardsResponse cardsResponse;
  private TournamentNameResponse tournamentNameResponse;
  private TournamentTagResponse tournamentTagResponse;
  private LocationsResponse locationsResponse;
  private LocationsIdResponse locationsIdResponse;
  private LocationsIdRankingClansResponse locationsIdRankingClansResponse;
  private LocationsIdRankingPlayersResponse locationsIdRankingPlayersResponse;
  private LocationsIdRankingClanWarsResponse locationsIdRankingClanWarsResponse;
  private LocationsGlobalSeasonsQuery globalSeasonsQuery;
  private LocationsGlobalSeasonsIDRankingPlayers globalSeasonsIDRankingPlayers;

  public ClanNameResponse getClanNameResponse() {
    return clanNameResponse;
  }

  public void setClanNameResponse(ClanNameResponse clanNameResponse) {
    this.clanNameResponse = clanNameResponse;
  }

  public ClanTagResponse getClanTagResponse() {
    return clanTagResponse;
  }

  public void setClanTagResponse(ClanTagResponse clanTagResponse) {
    this.clanTagResponse = clanTagResponse;
  }

  public ClanTagMembersResponse getClanTagMembersResponse() {
    return clanTagMembersResponse;
  }

  public void setClanTagMembersResponse(ClanTagMembersResponse clanTagMembersResponse) {
    this.clanTagMembersResponse = clanTagMembersResponse;
  }

  public ClanTagRiverResponse getClanTagRiverResponse() {
    return clanTagRiverResponse;
  }

  public void setClanTagRiverResponse(ClanTagRiverResponse clanTagRiverResponse) {
    this.clanTagRiverResponse = clanTagRiverResponse;
  }

  public ClanTagCurrentRiverResponse getClanTagCurrentRiverResponse() {
    return clanTagCurrentRiverResponse;
  }

  public void setClanTagCurrentRiverResponse(ClanTagCurrentRiverResponse clanTagCurrentRiverResponse) {
    this.clanTagCurrentRiverResponse = clanTagCurrentRiverResponse;
  }

  public PlayerTagResponse getPlayerTagResponse() {
    return playerTagResponse;
  }

  public void setPlayerTagResponse(PlayerTagResponse playerTagResponse) {
    this.playerTagResponse = playerTagResponse;
  }

  public PlayerBattleLogResponse getPlayerTagBattleLogResponse() {
    return playerTagBattleLogResponse;
  }

  public void setPlayerTagBattleLogResponse(PlayerBattleLogResponse playerTagBattleLogResponse) {
    this.playerTagBattleLogResponse = playerTagBattleLogResponse;
  }

  public PlayerTagUpcomingChestsResponse getPlayerTagUpcomingChestsResponse() {
    return playerTagUpcomingChestsResponse;
  }

  public void setPlayerTagUpcomingChestsResponse(PlayerTagUpcomingChestsResponse playerTagUpcomingChestsResponse) {
    this.playerTagUpcomingChestsResponse = playerTagUpcomingChestsResponse;
  }

  public CardsResponse getCardsResponse() {
    return cardsResponse;
  }

  public void setCardsResponse(CardsResponse cardsResponse) {
    this.cardsResponse = cardsResponse;
  }

  public TournamentNameResponse getTournamentNameResponse() {
    return tournamentNameResponse;
  }

  public void setTournamentNameResponse(TournamentNameResponse tournamentNameResponse) {
    this.tournamentNameResponse = tournamentNameResponse;
  }

  public TournamentTagResponse getTournamentTagResponse() {
    return tournamentTagResponse;
  }

  public void setTournamentTagResponse(TournamentTagResponse tournamentTagResponse) {
    this.tournamentTagResponse = tournamentTagResponse;
  }

  public LocationsResponse getLocationsResponse() {
    return locationsResponse;
  }

  public void setLocationsResponse(LocationsResponse locationsResponse) {
    this.locationsResponse = locationsResponse;
  }

  public LocationsIdResponse getLocationsIdResponse() {
    return locationsIdResponse;
  }

  public void setLocationsIdResponse(LocationsIdResponse locationsIdResponse) {
    this.locationsIdResponse = locationsIdResponse;
  }

  public LocationsIdRankingClansResponse getLocationsIdRankingClansResponse() {
    return locationsIdRankingClansResponse;
  }

  public void setLocationsIdRankingClansResponse(LocationsIdRankingClansResponse locationsIdRankingClansResponse) {
    this.locationsIdRankingClansResponse = locationsIdRankingClansResponse;
  }

  public LocationsIdRankingPlayersResponse getLocationsIdRankingPlayersResponse() {
    return locationsIdRankingPlayersResponse;
  }

  public void setLocationsIdRankingPlayersResponse(LocationsIdRankingPlayersResponse locationsIdRankingPlayersResponse) {
    this.locationsIdRankingPlayersResponse = locationsIdRankingPlayersResponse;
  }

  public LocationsIdRankingClanWarsResponse getLocationsIdRankingClanWarsResponse() {
    return locationsIdRankingClanWarsResponse;
  }

  public void setLocationsIdRankingClanWarsResponse(LocationsIdRankingClanWarsResponse locationsIdRankingClanWarsResponse) {
    this.locationsIdRankingClanWarsResponse = locationsIdRankingClanWarsResponse;
  }

  public LocationsGlobalSeasonsQuery getGlobalSeasonsQuery() {
    return globalSeasonsQuery;
  }

  public void setGlobalSeasonsQuery(LocationsGlobalSeasonsQuery globalSeasonsQuery) {
    this.globalSeasonsQuery = globalSeasonsQuery;
  }

  public LocationsGlobalSeasonsIDRankingPlayers getGlobalSeasonsIDRankingPlayers() {
    return globalSeasonsIDRankingPlayers;
  }

  public void setGlobalSeasonsIDRankingPlayers(LocationsGlobalSeasonsIDRankingPlayers globalSeasonsIDRankingPlayers) {
    this.globalSeasonsIDRankingPlayers = globalSeasonsIDRankingPlayers;
  }

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

  public String getTestMessage() {
    return testMessage;
  }

  public void setTestMessage(String testMessage) {
    this.testMessage = testMessage;
  }
}
