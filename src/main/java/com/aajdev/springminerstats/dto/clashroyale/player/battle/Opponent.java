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
    "tag",
    "name",
    "startingTrophies",
    "crowns",
    "kingTowerHitPoints",
    "clan",
    "cards",
    "trophyChange",
    "princessTowersHitPoints"
})
@Generated("jsonschema2pojo")
public class Opponent {

    @JsonProperty("tag")
    private String tag;
    @JsonProperty("name")
    private String name;
    @JsonProperty("startingTrophies")
    private Integer startingTrophies;
    @JsonProperty("crowns")
    private Integer crowns;
    @JsonProperty("kingTowerHitPoints")
    private Integer kingTowerHitPoints;
    @JsonProperty("clan")
    private Clan__1 clan;
    @JsonProperty("cards")
    private List<Card__1> cards = new ArrayList<Card__1>();
    @JsonProperty("trophyChange")
    private Integer trophyChange;
    @JsonProperty("princessTowersHitPoints")
    private List<Integer> princessTowersHitPoints = new ArrayList<Integer>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    @JsonProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("startingTrophies")
    public Integer getStartingTrophies() {
        return startingTrophies;
    }

    @JsonProperty("startingTrophies")
    public void setStartingTrophies(Integer startingTrophies) {
        this.startingTrophies = startingTrophies;
    }

    @JsonProperty("crowns")
    public Integer getCrowns() {
        return crowns;
    }

    @JsonProperty("crowns")
    public void setCrowns(Integer crowns) {
        this.crowns = crowns;
    }

    @JsonProperty("kingTowerHitPoints")
    public Integer getKingTowerHitPoints() {
        return kingTowerHitPoints;
    }

    @JsonProperty("kingTowerHitPoints")
    public void setKingTowerHitPoints(Integer kingTowerHitPoints) {
        this.kingTowerHitPoints = kingTowerHitPoints;
    }

    @JsonProperty("clan")
    public Clan__1 getClan() {
        return clan;
    }

    @JsonProperty("clan")
    public void setClan(Clan__1 clan) {
        this.clan = clan;
    }

    @JsonProperty("cards")
    public List<Card__1> getCards() {
        return cards;
    }

    @JsonProperty("cards")
    public void setCards(List<Card__1> cards) {
        this.cards = cards;
    }

    @JsonProperty("trophyChange")
    public Integer getTrophyChange() {
        return trophyChange;
    }

    @JsonProperty("trophyChange")
    public void setTrophyChange(Integer trophyChange) {
        this.trophyChange = trophyChange;
    }

    @JsonProperty("princessTowersHitPoints")
    public List<Integer> getPrincessTowersHitPoints() {
        return princessTowersHitPoints;
    }

    @JsonProperty("princessTowersHitPoints")
    public void setPrincessTowersHitPoints(List<Integer> princessTowersHitPoints) {
        this.princessTowersHitPoints = princessTowersHitPoints;
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
        sb.append(Opponent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("startingTrophies");
        sb.append('=');
        sb.append(((this.startingTrophies == null)?"<null>":this.startingTrophies));
        sb.append(',');
        sb.append("crowns");
        sb.append('=');
        sb.append(((this.crowns == null)?"<null>":this.crowns));
        sb.append(',');
        sb.append("kingTowerHitPoints");
        sb.append('=');
        sb.append(((this.kingTowerHitPoints == null)?"<null>":this.kingTowerHitPoints));
        sb.append(',');
        sb.append("clan");
        sb.append('=');
        sb.append(((this.clan == null)?"<null>":this.clan));
        sb.append(',');
        sb.append("cards");
        sb.append('=');
        sb.append(((this.cards == null)?"<null>":this.cards));
        sb.append(',');
        sb.append("trophyChange");
        sb.append('=');
        sb.append(((this.trophyChange == null)?"<null>":this.trophyChange));
        sb.append(',');
        sb.append("princessTowersHitPoints");
        sb.append('=');
        sb.append(((this.princessTowersHitPoints == null)?"<null>":this.princessTowersHitPoints));
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
        result = ((result* 31)+((this.cards == null)? 0 :this.cards.hashCode()));
        result = ((result* 31)+((this.crowns == null)? 0 :this.crowns.hashCode()));
        result = ((result* 31)+((this.kingTowerHitPoints == null)? 0 :this.kingTowerHitPoints.hashCode()));
        result = ((result* 31)+((this.trophyChange == null)? 0 :this.trophyChange.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.startingTrophies == null)? 0 :this.startingTrophies.hashCode()));
        result = ((result* 31)+((this.clan == null)? 0 :this.clan.hashCode()));
        result = ((result* 31)+((this.princessTowersHitPoints == null)? 0 :this.princessTowersHitPoints.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Opponent) == false) {
            return false;
        }
        Opponent rhs = ((Opponent) other);
        return (((((((((((this.cards == rhs.cards)||((this.cards!= null)&&this.cards.equals(rhs.cards)))&&((this.crowns == rhs.crowns)||((this.crowns!= null)&&this.crowns.equals(rhs.crowns))))&&((this.kingTowerHitPoints == rhs.kingTowerHitPoints)||((this.kingTowerHitPoints!= null)&&this.kingTowerHitPoints.equals(rhs.kingTowerHitPoints))))&&((this.trophyChange == rhs.trophyChange)||((this.trophyChange!= null)&&this.trophyChange.equals(rhs.trophyChange))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.startingTrophies == rhs.startingTrophies)||((this.startingTrophies!= null)&&this.startingTrophies.equals(rhs.startingTrophies))))&&((this.clan == rhs.clan)||((this.clan!= null)&&this.clan.equals(rhs.clan))))&&((this.princessTowersHitPoints == rhs.princessTowersHitPoints)||((this.princessTowersHitPoints!= null)&&this.princessTowersHitPoints.equals(rhs.princessTowersHitPoints))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
