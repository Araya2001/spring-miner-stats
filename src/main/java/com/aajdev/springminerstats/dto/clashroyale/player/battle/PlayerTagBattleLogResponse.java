package com.aajdev.springminerstats.dto.clashroyale.player.battle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "battleTime",
    "isLadderTournament",
    "arena",
    "gameMode",
    "deckSelection",
    "team",
    "opponent",
    "isHostedMatch",
    "boatBattleSide",
    "boatBattleWon",
    "newTowersDestroyed",
    "prevTowersDestroyed",
    "remainingTowers"
})
@Generated("jsonschema2pojo")
public class PlayerTagBattleLogResponse {

    @JsonProperty("type")
    private String type;
    @JsonProperty("battleTime")
    private String battleTime;
    @JsonProperty("isLadderTournament")
    private Boolean isLadderTournament;
    @JsonProperty("arena")
    private Arena arena;
    @JsonProperty("gameMode")
    private GameMode gameMode;
    @JsonProperty("deckSelection")
    private String deckSelection;
    @JsonProperty("team")
    private List<Team> team = new ArrayList<Team>();
    @JsonProperty("opponent")
    private List<Opponent> opponent = new ArrayList<Opponent>();
    @JsonProperty("isHostedMatch")
    private Boolean isHostedMatch;
    @JsonProperty("boatBattleSide")
    private String boatBattleSide;
    @JsonProperty("boatBattleWon")
    private Boolean boatBattleWon;
    @JsonProperty("newTowersDestroyed")
    private Integer newTowersDestroyed;
    @JsonProperty("prevTowersDestroyed")
    private Integer prevTowersDestroyed;
    @JsonProperty("remainingTowers")
    private Integer remainingTowers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("battleTime")
    public String getBattleTime() {
        return battleTime;
    }

    @JsonProperty("battleTime")
    public void setBattleTime(String battleTime) {
        this.battleTime = battleTime;
    }

    @JsonProperty("isLadderTournament")
    public Boolean getIsLadderTournament() {
        return isLadderTournament;
    }

    @JsonProperty("isLadderTournament")
    public void setIsLadderTournament(Boolean isLadderTournament) {
        this.isLadderTournament = isLadderTournament;
    }

    @JsonProperty("arena")
    public Arena getArena() {
        return arena;
    }

    @JsonProperty("arena")
    public void setArena(Arena arena) {
        this.arena = arena;
    }

    @JsonProperty("gameMode")
    public GameMode getGameMode() {
        return gameMode;
    }

    @JsonProperty("gameMode")
    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    @JsonProperty("deckSelection")
    public String getDeckSelection() {
        return deckSelection;
    }

    @JsonProperty("deckSelection")
    public void setDeckSelection(String deckSelection) {
        this.deckSelection = deckSelection;
    }

    @JsonProperty("team")
    public List<Team> getTeam() {
        return team;
    }

    @JsonProperty("team")
    public void setTeam(List<Team> team) {
        this.team = team;
    }

    @JsonProperty("opponent")
    public List<Opponent> getOpponent() {
        return opponent;
    }

    @JsonProperty("opponent")
    public void setOpponent(List<Opponent> opponent) {
        this.opponent = opponent;
    }

    @JsonProperty("isHostedMatch")
    public Boolean getIsHostedMatch() {
        return isHostedMatch;
    }

    @JsonProperty("isHostedMatch")
    public void setIsHostedMatch(Boolean isHostedMatch) {
        this.isHostedMatch = isHostedMatch;
    }

    @JsonProperty("boatBattleSide")
    public String getBoatBattleSide() {
        return boatBattleSide;
    }

    @JsonProperty("boatBattleSide")
    public void setBoatBattleSide(String boatBattleSide) {
        this.boatBattleSide = boatBattleSide;
    }

    @JsonProperty("boatBattleWon")
    public Boolean getBoatBattleWon() {
        return boatBattleWon;
    }

    @JsonProperty("boatBattleWon")
    public void setBoatBattleWon(Boolean boatBattleWon) {
        this.boatBattleWon = boatBattleWon;
    }

    @JsonProperty("newTowersDestroyed")
    public Integer getNewTowersDestroyed() {
        return newTowersDestroyed;
    }

    @JsonProperty("newTowersDestroyed")
    public void setNewTowersDestroyed(Integer newTowersDestroyed) {
        this.newTowersDestroyed = newTowersDestroyed;
    }

    @JsonProperty("prevTowersDestroyed")
    public Integer getPrevTowersDestroyed() {
        return prevTowersDestroyed;
    }

    @JsonProperty("prevTowersDestroyed")
    public void setPrevTowersDestroyed(Integer prevTowersDestroyed) {
        this.prevTowersDestroyed = prevTowersDestroyed;
    }

    @JsonProperty("remainingTowers")
    public Integer getRemainingTowers() {
        return remainingTowers;
    }

    @JsonProperty("remainingTowers")
    public void setRemainingTowers(Integer remainingTowers) {
        this.remainingTowers = remainingTowers;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PlayerTagBattleLogResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("battleTime");
        sb.append('=');
        sb.append(((this.battleTime == null)?"<null>":this.battleTime));
        sb.append(',');
        sb.append("isLadderTournament");
        sb.append('=');
        sb.append(((this.isLadderTournament == null)?"<null>":this.isLadderTournament));
        sb.append(',');
        sb.append("arena");
        sb.append('=');
        sb.append(((this.arena == null)?"<null>":this.arena));
        sb.append(',');
        sb.append("gameMode");
        sb.append('=');
        sb.append(((this.gameMode == null)?"<null>":this.gameMode));
        sb.append(',');
        sb.append("deckSelection");
        sb.append('=');
        sb.append(((this.deckSelection == null)?"<null>":this.deckSelection));
        sb.append(',');
        sb.append("team");
        sb.append('=');
        sb.append(((this.team == null)?"<null>":this.team));
        sb.append(',');
        sb.append("opponent");
        sb.append('=');
        sb.append(((this.opponent == null)?"<null>":this.opponent));
        sb.append(',');
        sb.append("isHostedMatch");
        sb.append('=');
        sb.append(((this.isHostedMatch == null)?"<null>":this.isHostedMatch));
        sb.append(',');
        sb.append("boatBattleSide");
        sb.append('=');
        sb.append(((this.boatBattleSide == null)?"<null>":this.boatBattleSide));
        sb.append(',');
        sb.append("boatBattleWon");
        sb.append('=');
        sb.append(((this.boatBattleWon == null)?"<null>":this.boatBattleWon));
        sb.append(',');
        sb.append("newTowersDestroyed");
        sb.append('=');
        sb.append(((this.newTowersDestroyed == null)?"<null>":this.newTowersDestroyed));
        sb.append(',');
        sb.append("prevTowersDestroyed");
        sb.append('=');
        sb.append(((this.prevTowersDestroyed == null)?"<null>":this.prevTowersDestroyed));
        sb.append(',');
        sb.append("remainingTowers");
        sb.append('=');
        sb.append(((this.remainingTowers == null)?"<null>":this.remainingTowers));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.prevTowersDestroyed == null)? 0 :this.prevTowersDestroyed.hashCode()));
        result = ((result* 31)+((this.boatBattleWon == null)? 0 :this.boatBattleWon.hashCode()));
        result = ((result* 31)+((this.remainingTowers == null)? 0 :this.remainingTowers.hashCode()));
        result = ((result* 31)+((this.arena == null)? 0 :this.arena.hashCode()));
        result = ((result* 31)+((this.team == null)? 0 :this.team.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.battleTime == null)? 0 :this.battleTime.hashCode()));
        result = ((result* 31)+((this.boatBattleSide == null)? 0 :this.boatBattleSide.hashCode()));
        result = ((result* 31)+((this.deckSelection == null)? 0 :this.deckSelection.hashCode()));
        result = ((result* 31)+((this.newTowersDestroyed == null)? 0 :this.newTowersDestroyed.hashCode()));
        result = ((result* 31)+((this.isHostedMatch == null)? 0 :this.isHostedMatch.hashCode()));
        result = ((result* 31)+((this.opponent == null)? 0 :this.opponent.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.gameMode == null)? 0 :this.gameMode.hashCode()));
        result = ((result* 31)+((this.isLadderTournament == null)? 0 :this.isLadderTournament.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlayerTagBattleLogResponse) == false) {
            return false;
        }
        PlayerTagBattleLogResponse rhs = ((PlayerTagBattleLogResponse) other);
        return ((((((((((((((((this.prevTowersDestroyed == rhs.prevTowersDestroyed)||((this.prevTowersDestroyed!= null)&&this.prevTowersDestroyed.equals(rhs.prevTowersDestroyed)))&&((this.boatBattleWon == rhs.boatBattleWon)||((this.boatBattleWon!= null)&&this.boatBattleWon.equals(rhs.boatBattleWon))))&&((this.remainingTowers == rhs.remainingTowers)||((this.remainingTowers!= null)&&this.remainingTowers.equals(rhs.remainingTowers))))&&((this.arena == rhs.arena)||((this.arena!= null)&&this.arena.equals(rhs.arena))))&&((this.team == rhs.team)||((this.team!= null)&&this.team.equals(rhs.team))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.battleTime == rhs.battleTime)||((this.battleTime!= null)&&this.battleTime.equals(rhs.battleTime))))&&((this.boatBattleSide == rhs.boatBattleSide)||((this.boatBattleSide!= null)&&this.boatBattleSide.equals(rhs.boatBattleSide))))&&((this.deckSelection == rhs.deckSelection)||((this.deckSelection!= null)&&this.deckSelection.equals(rhs.deckSelection))))&&((this.newTowersDestroyed == rhs.newTowersDestroyed)||((this.newTowersDestroyed!= null)&&this.newTowersDestroyed.equals(rhs.newTowersDestroyed))))&&((this.isHostedMatch == rhs.isHostedMatch)||((this.isHostedMatch!= null)&&this.isHostedMatch.equals(rhs.isHostedMatch))))&&((this.opponent == rhs.opponent)||((this.opponent!= null)&&this.opponent.equals(rhs.opponent))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.gameMode == rhs.gameMode)||((this.gameMode!= null)&&this.gameMode.equals(rhs.gameMode))))&&((this.isLadderTournament == rhs.isLadderTournament)||((this.isLadderTournament!= null)&&this.isLadderTournament.equals(rhs.isLadderTournament))));
    }

}
