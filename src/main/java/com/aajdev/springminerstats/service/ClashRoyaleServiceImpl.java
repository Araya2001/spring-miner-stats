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
import com.aajdev.springminerstats.dto.clashroyale.player.battle.PlayerTagBattleLogResponse;
import com.aajdev.springminerstats.dto.clashroyale.player.tag.PlayerTagResponse;
import com.aajdev.springminerstats.dto.clashroyale.player.upcomingchest.PlayerTagUpcomingChestsResponse;
import com.aajdev.springminerstats.dto.clashroyale.tournament.name.TournamentNameResponse;
import com.aajdev.springminerstats.dto.clashroyale.tournament.tag.TournamentTagResponse;
import org.springframework.stereotype.Service;

@Service
public class ClashRoyaleServiceImpl implements ClashRoyaleService {
  @Override
  public ClanNameResponse getClansWithName(String name) {
    return null;
  }

  @Override
  public ClanTagResponse getClanWithTag(String tag) {
    return null;
  }

  @Override
  public ClanTagMembersResponse getClanMembers(String tag) {
    return null;
  }

  @Override
  public ClanTagRiverResponse getClanRiverRaceLogs(String tag) {
    return null;
  }

  @Override
  public ClanTagCurrentRiverResponse getClanCurrentRiverRaceLogs(String tag) {
    return null;
  }

  @Override
  public PlayerTagResponse getPlayerWithTag(String tag) {
    return null;
  }

  @Override
  public PlayerTagBattleLogResponse getPlayerBattleLog(String tag) {
    return null;
  }

  @Override
  public PlayerTagUpcomingChestsResponse getPlayerUpcomingChests(String tag) {
    return null;
  }

  @Override
  public CardsResponse getCards() {
    return null;
  }

  @Override
  public TournamentNameResponse getTournamentsWithName(String name) {
    return null;
  }

  @Override
  public TournamentTagResponse getTournamentWithTag(String tag) {
    return null;
  }

  @Override
  public LocationsResponse getLocations() {
    return null;
  }

  @Override
  public LocationsIdResponse getLocationWithId(String id) {
    return null;
  }

  @Override
  public LocationsIdRankingClansResponse getLocationClanRankingWithId(String id) {
    return null;
  }

  @Override
  public LocationsIdRankingPlayersResponse getLocationPlayerRankingWithId(String id) {
    return null;
  }

  @Override
  public LocationsIdRankingClanWarsResponse getLocationClanWarRankingWithId(String id) {
    return null;
  }

  @Override
  public LocationsGlobalSeasonsQuery getGlobalSeasons() {
    return null;
  }

  @Override
  public LocationsGlobalSeasonsIDRankingPlayers getGlobalRankingPlayerWithSeasonId(String id) {
    return null;
  }
}
