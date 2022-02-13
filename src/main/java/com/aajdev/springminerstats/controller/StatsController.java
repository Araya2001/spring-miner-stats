
package com.aajdev.springminerstats.controller;

import com.aajdev.springminerstats.dto.app.PlayerResponse;
import com.aajdev.springminerstats.dto.app.TestResponse;
import com.aajdev.springminerstats.service.ClashRoyaleService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Log4j2
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/miner-stats")
public class StatsController {
  private final ClashRoyaleService clashRoyaleService;

  @Autowired
  public StatsController(ClashRoyaleService clashRoyaleService) {
    this.clashRoyaleService = clashRoyaleService;
  }

  @GetMapping(value = "/testApiRequest", produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public ResponseEntity<TestResponse> getTest(HttpServletRequest request) {
    log.warn("NEW REQUEST - HTTP GET on resource mapping \"/testApiRequest\" - IP: " + request.getHeader("X-FORWARDED-FOR"));
    HttpStatus httpStatus;
    TestResponse response = new TestResponse();
    try {
      response.setStatus("SUCCESS");
      response.setMessage("OK");
      response.setClanNameResponse(clashRoyaleService.getClansWithName("Bonza"));
      response.setClanTagResponse(clashRoyaleService.getClanWithTag("#QCQ89Q99"));
      response.setClanTagMembersResponse(clashRoyaleService.getClanMembers("#QCQ89Q99"));
      response.setClanTagRiverResponse(clashRoyaleService.getClanRiverRaceLogs("#QCQ89Q99"));
      response.setClanTagCurrentRiverResponse(clashRoyaleService.getClanCurrentRiverRaceLogs("#QCQ89Q99"));
      response.setPlayerTagResponse(clashRoyaleService.getPlayerWithTag("#VCRVPP9R"));
      response.setPlayerTagBattleLogResponse(clashRoyaleService.getPlayerBattleLog("#VCRVPP9R"));
      response.setPlayerTagUpcomingChestsResponse(clashRoyaleService.getPlayerUpcomingChests("#VCRVPP9R"));
      response.setCardsResponse(clashRoyaleService.getCards());
      response.setTournamentNameResponse(clashRoyaleService.getTournamentsWithName("a"));
      response.setTournamentTagResponse(clashRoyaleService.getTournamentWithTag("#2PULUP00"));
      response.setLocationsResponse(clashRoyaleService.getLocations());
      response.setLocationsIdResponse(clashRoyaleService.getLocationWithId("57000064"));
      response.setLocationsIdRankingClansResponse(clashRoyaleService.getLocationClanRankingWithId("57000064"));
      response.setLocationsIdRankingPlayersResponse(clashRoyaleService.getLocationPlayerRankingWithId("57000064"));
      response.setLocationsIdRankingClanWarsResponse(clashRoyaleService.getLocationClanWarRankingWithId("57000064"));
      response.setGlobalSeasonsQuery(clashRoyaleService.getGlobalSeasons());
      response.setGlobalSeasonsIDRankingPlayers(clashRoyaleService.getGlobalRankingPlayerWithSeasonId("2016-02"));
      response.setTestMessage("TEST: SUCCESS");
      httpStatus = HttpStatus.OK;
    } catch (Exception e) {
      httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
      response.setStatus("ERROR");
      response.setMessage("INTERNAL SERVER ERROR");
      response.setTestMessage("Test is null");
    }
    return new ResponseEntity<>(response, httpStatus);
  }

  @GetMapping(value = "/getPlayer", produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public ResponseEntity<PlayerResponse> getPlayerTag(HttpServletRequest request, @RequestParam String tag) {
    log.warn("NEW REQUEST - HTTP GET on resource mapping \"/testApiRequest\" - IP: " + request.getHeader("X-FORWARDED-FOR"));
    HttpStatus httpStatus;
    PlayerResponse response = new PlayerResponse();
    try {
      response.setStatus("SUCCESS");
      response.setMessage("OK");
      response.setPlayerInformation(clashRoyaleService.getPlayerWithTag(tag));
      httpStatus = HttpStatus.OK;
    } catch (Exception e) {
      httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
      response.setStatus("ERROR");
      response.setMessage("INTERNAL SERVER ERROR");
    }
    return new ResponseEntity<>(response, httpStatus);
  }

}
