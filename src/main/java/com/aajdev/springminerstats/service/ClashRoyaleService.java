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

public interface ClashRoyaleService {
  ClanNameResponse getClansWithName(String name);

  ClanTagResponse getClanWithTag(String tag);

  ClanTagMembersResponse getClanMembers(String tag);

  ClanTagRiverResponse getClanRiverRaceLogs(String tag);

  ClanTagCurrentRiverResponse getClanCurrentRiverRaceLogs(String tag);

  PlayerTagResponse getPlayerWithTag(String tag);

  PlayerTagBattleLogResponse getPlayerBattleLog(String tag);

  PlayerTagUpcomingChestsResponse getPlayerUpcomingChests(String tag);

  CardsResponse getCards();

  TournamentNameResponse getTournamentsWithName(String name);

  TournamentTagResponse getTournamentWithTag(String tag);

  LocationsResponse getLocations();

  LocationsIdResponse getLocationWithId(String id);

  LocationsIdRankingClansResponse getLocationClanRankingWithId(String id);

  LocationsIdRankingPlayersResponse getLocationPlayerRankingWithId(String id);

  LocationsIdRankingClanWarsResponse getLocationClanWarRankingWithId(String id);

  LocationsGlobalSeasonsQuery getGlobalSeasons();

  LocationsGlobalSeasonsIDRankingPlayers getGlobalRankingPlayerWithSeasonId(String id);
}
