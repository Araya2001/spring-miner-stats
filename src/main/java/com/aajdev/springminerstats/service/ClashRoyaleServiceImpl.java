package com.aajdev.springminerstats.service;

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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@Service
@Log4j2
public class ClashRoyaleServiceImpl implements ClashRoyaleService {
  private final RestTemplate restTemplate;
  private final HttpHeaders httpHeaders;
  @Value("${clashroyale.api.token}")
  private String apiToken;
  @Value("${clashroyale.api.url}")
  private String apiUrl;

  @Autowired
  public ClashRoyaleServiceImpl(RestTemplate restTemplate, HttpHeaders httpHeaders) {
    this.restTemplate = restTemplate;
    this.httpHeaders = httpHeaders;
  }

  @Override
  public ClanNameResponse getClansWithName(String name) {
    String url = apiUrl + "/clans?name=" + URLEncoder.encode(name, StandardCharsets.UTF_8);
    httpHeaders.set("Authorization", "Bearer " + apiToken);
    HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
    try {
      log.info("RETRIEVED CLANS WITH NAME LIKE" + name);
      ResponseEntity<ClanNameResponse> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, ClanNameResponse.class);
      return response.getBody();
    } catch (Exception e) {
      log.error("ERROR: CAN'T RETRIEVE CLANS WITH NAME " + name);
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public ClanTagResponse getClanWithTag(String tag) {
    String url = apiUrl + "/clans/" + URLEncoder.encode(tag, StandardCharsets.UTF_8);
    httpHeaders.set("Authorization", "Bearer " + apiToken);
    HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
    try {
      log.info("RETRIEVED CLAN WITH TAG " + tag);
      ResponseEntity<ClanTagResponse> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, ClanTagResponse.class);
      return response.getBody();
    } catch (Exception e) {
      log.error("ERROR: CAN'T RETRIEVE CLAN WITH TAG " + tag);
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public ClanTagMembersResponse getClanMembers(String tag) {
    String url = apiUrl + "/clans/" + URLEncoder.encode(tag, StandardCharsets.UTF_8) + "/members";
    httpHeaders.set("Authorization", "Bearer " + apiToken);
    HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
    try {
      log.info("RETRIEVED CLAN MEMBERS WITH CLAN TAG " + tag);
      ResponseEntity<ClanTagMembersResponse> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, ClanTagMembersResponse.class);
      return response.getBody();
    } catch (Exception e) {
      log.error("ERROR: CAN'T RETRIEVE CLAN MEMBERS WITH CLAN TAG " + tag);
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public ClanTagRiverResponse getClanRiverRaceLogs(String tag) {
    String url = apiUrl + "/clans/" + URLEncoder.encode(tag, StandardCharsets.UTF_8) + "/riverracelog";
    httpHeaders.set("Authorization", "Bearer " + apiToken);
    HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
    try {
      log.info("RETRIEVED CLAN RIVER RACE LOGS WITH TAG " + tag);
      ResponseEntity<ClanTagRiverResponse> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, ClanTagRiverResponse.class);
      return response.getBody();
    } catch (Exception e) {
      log.error("ERROR: CAN'T RETRIEVE CLAN RIVER RACE LOGS WITH CLAN TAG" + tag);
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public ClanTagCurrentRiverResponse getClanCurrentRiverRaceLogs(String tag) {
    String url = apiUrl + "/clans/" + URLEncoder.encode(tag, StandardCharsets.UTF_8) + "/currentriverrace";
    httpHeaders.set("Authorization", "Bearer " + apiToken);
    HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
    try {
      log.info("RETRIEVED CLAN CURRENT RIVER RACE WITH TAG " + tag);
      ResponseEntity<ClanTagCurrentRiverResponse> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, ClanTagCurrentRiverResponse.class);
      return response.getBody();
    } catch (Exception e) {
      log.error("ERROR: CAN'T RETRIEVE CLAN CURRENT RIVER RACE LOG WITH TAG " + tag);
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public PlayerTagResponse getPlayerWithTag(String tag) {
    String url = apiUrl + "/players/" + URLEncoder.encode(tag, StandardCharsets.UTF_8);
    httpHeaders.set("Authorization", "Bearer " + apiToken);
    HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
    try {
      log.info("RETRIEVED PLAYER WITH TAG " + tag);
      ResponseEntity<PlayerTagResponse> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, PlayerTagResponse.class);
      return response.getBody();
    } catch (Exception e) {
      log.error("ERROR: CAN'T RETRIEVE PLAYER WITH TAG " + tag);
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public PlayerBattleLogResponse getPlayerBattleLog(String tag) {
    String url = apiUrl + "/players/" + URLEncoder.encode(tag, StandardCharsets.UTF_8) + "/battlelog";
    httpHeaders.set("Authorization", "Bearer " + apiToken);
    HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
    try {
      log.info("RETRIEVED PLAYER BATTLE LOG WITH TAG " + tag);
      ObjectMapper mapper = new ObjectMapper();
      ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
      PlayerBattleLogResponse[] playerBattleLogResponses = mapper.readValue( response.getBody(), PlayerBattleLogResponse[].class);
      return playerBattleLogResponses[0];
    } catch (Exception e) {
      log.error("ERROR: CAN'T RETRIEVE PLAYER BATTLE LOG WITH TAG" + tag);
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public PlayerTagUpcomingChestsResponse getPlayerUpcomingChests(String tag) {
    String url = apiUrl + "/players/" + URLEncoder.encode(tag, StandardCharsets.UTF_8) + "/upcomingchests";
    httpHeaders.set("Authorization", "Bearer " + apiToken);
    HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
    try {
      log.info("RETRIEVED PLAYER UPCOMING CHESTS WITH TAG " + tag);
      ResponseEntity<PlayerTagUpcomingChestsResponse> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, PlayerTagUpcomingChestsResponse.class);
      return response.getBody();
    } catch (Exception e) {
      log.error("ERROR: CAN'T RETRIEVE PLAYER UPCOMING CHESTS WITH TAG " + tag);
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public CardsResponse getCards() {
    String url = apiUrl + "/cards";
    httpHeaders.set("Authorization", "Bearer " + apiToken);
    HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
    try {
      log.info("RETRIEVED CARDS");
      ResponseEntity<CardsResponse> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, CardsResponse.class);
      return response.getBody();
    } catch (Exception e) {
      log.error("ERROR: CAN'T RETRIEVE CARDS");
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public TournamentNameResponse getTournamentsWithName(String name) {
    String url = apiUrl + "/tournaments?name=" + URLEncoder.encode(name, StandardCharsets.UTF_8);
    httpHeaders.set("Authorization", "Bearer " + apiToken);
    HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
    try {
      log.info("RETRIEVED TOURNAMENTS WITH NAME LIKE " + name);
      ResponseEntity<TournamentNameResponse> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, TournamentNameResponse.class);
      return response.getBody();
    } catch (Exception e) {
      log.error("ERROR: CAN'T RETRIEVE TOURNAMENTS WITH NAME " + name);
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public TournamentTagResponse getTournamentWithTag(String tag) {
    String url = apiUrl + "/tournaments/" + URLEncoder.encode(tag, StandardCharsets.UTF_8);
    httpHeaders.set("Authorization", "Bearer " + apiToken);
    HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
    try {
      log.info("RETRIEVED TOURNAMENT WITH TAG " + tag);
      ResponseEntity<TournamentTagResponse> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, TournamentTagResponse.class);
      return response.getBody();
    } catch (Exception e) {
      log.error("ERROR: CAN'T RETRIEVE TOURNAMENT WITH TAG " + tag);
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public LocationsResponse getLocations() {
    String url = apiUrl + "/locations";
    httpHeaders.set("Authorization", "Bearer " + apiToken);
    HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
    try {
      log.info("RETRIEVED LOCATIONS");
      ResponseEntity<LocationsResponse> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, LocationsResponse.class);
      return response.getBody();
    } catch (Exception e) {
      log.error("ERROR: CAN'T RETRIEVE LOCATIONS");
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public LocationsIdResponse getLocationWithId(String id) {
    String url = apiUrl + "/locations/" + URLEncoder.encode(id, StandardCharsets.UTF_8);
    httpHeaders.set("Authorization", "Bearer " + apiToken);
    HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
    try {
      log.info("RETRIEVED LOCATION WITH ID " + id);
      ResponseEntity<LocationsIdResponse> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, LocationsIdResponse.class);
      return response.getBody();
    } catch (Exception e) {
      log.error("ERROR: CAN'T RETRIEVE LOCATION WITH ID " + id);
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public LocationsIdRankingClansResponse getLocationClanRankingWithId(String id) {
    String url = apiUrl + "/locations/" + URLEncoder.encode(id, StandardCharsets.UTF_8) + "/rankings/clans";
    httpHeaders.set("Authorization", "Bearer " + apiToken);
    HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
    try {
      log.info("RETRIEVED LOCATION CLAN RANKING WITH ID " + id);
      ResponseEntity<LocationsIdRankingClansResponse> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, LocationsIdRankingClansResponse.class);
      return response.getBody();
    } catch (Exception e) {
      log.error("ERROR: CAN'T RETRIEVE LOCATION CLAN RANKING WITH ID" + id);
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public LocationsIdRankingPlayersResponse getLocationPlayerRankingWithId(String id) {
    String url = apiUrl + "/locations/" + URLEncoder.encode(id, StandardCharsets.UTF_8) + "/rankings/players";
    httpHeaders.set("Authorization", "Bearer " + apiToken);
    HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
    try {
      log.info("RETRIEVED LOCATION PLAYERS RANKING WITH ID " + id);
      ResponseEntity<LocationsIdRankingPlayersResponse> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, LocationsIdRankingPlayersResponse.class);
      return response.getBody();
    } catch (Exception e) {
      log.error("ERROR: CAN'T RETRIEVE LOCATION PLAYER RANKING WITH ID" + id);
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public LocationsIdRankingClanWarsResponse getLocationClanWarRankingWithId(String id) {
    String url = apiUrl + "/locations/" + URLEncoder.encode(id, StandardCharsets.UTF_8) + "/rankings/clanwars";
    httpHeaders.set("Authorization", "Bearer " + apiToken);
    HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
    try {
      log.info("RETRIEVED LOCATION CLAN WARS RANKING WITH ID " + id);
      ResponseEntity<LocationsIdRankingClanWarsResponse> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, LocationsIdRankingClanWarsResponse.class);
      return response.getBody();
    } catch (Exception e) {
      log.error("ERROR: CAN'T RETRIEVE LOCATION CLAN WARS RANKING WITH ID" + id);
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public LocationsGlobalSeasonsQuery getGlobalSeasons() {
    String url = apiUrl + "/locations/global/seasons";
    httpHeaders.set("Authorization", "Bearer " + apiToken);
    HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
    try {
      log.info("RETRIEVED GLOBAL SEASONS");
      ResponseEntity<LocationsGlobalSeasonsQuery> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, LocationsGlobalSeasonsQuery.class);
      return response.getBody();
    } catch (Exception e) {
      log.error("ERROR: CAN'T RETRIEVE GLOBAL SEASONS");
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public LocationsGlobalSeasonsIDRankingPlayers getGlobalRankingPlayerWithSeasonId(String id) {
    String url = apiUrl + "/locations/global/seasons/" + URLEncoder.encode(id, StandardCharsets.UTF_8);
    httpHeaders.set("Authorization", "Bearer " + apiToken);
    HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
    try {
      log.info("RETRIEVED GLOBAL PLAYER SEASON RANKINGS WITH ID " + id);
      ResponseEntity<LocationsGlobalSeasonsIDRankingPlayers> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, LocationsGlobalSeasonsIDRankingPlayers.class);
      return response.getBody();
    } catch (Exception e) {
      log.error("ERROR: CAN'T RETRIEVE GLOBAL PLAYER SEASON RANKINGS WITH ID " + id);
      e.printStackTrace();
      return null;
    }
  }
}
