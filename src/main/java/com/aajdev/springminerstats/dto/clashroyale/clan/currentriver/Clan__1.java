package com.aajdev.springminerstats.dto.clashroyale.clan.currentriver;

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
    "badgeId",
    "fame",
    "repairPoints",
    "participants",
    "periodPoints",
    "clanScore"
})
@Generated("jsonschema2pojo")
public class Clan__1 {

    @JsonProperty("tag")
    private String tag;
    @JsonProperty("name")
    private String name;
    @JsonProperty("badgeId")
    private Integer badgeId;
    @JsonProperty("fame")
    private Integer fame;
    @JsonProperty("repairPoints")
    private Integer repairPoints;
    @JsonProperty("participants")
    private List<Participant__1> participants = new ArrayList<Participant__1>();
    @JsonProperty("periodPoints")
    private Integer periodPoints;
    @JsonProperty("clanScore")
    private Integer clanScore;
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

    @JsonProperty("badgeId")
    public Integer getBadgeId() {
        return badgeId;
    }

    @JsonProperty("badgeId")
    public void setBadgeId(Integer badgeId) {
        this.badgeId = badgeId;
    }

    @JsonProperty("fame")
    public Integer getFame() {
        return fame;
    }

    @JsonProperty("fame")
    public void setFame(Integer fame) {
        this.fame = fame;
    }

    @JsonProperty("repairPoints")
    public Integer getRepairPoints() {
        return repairPoints;
    }

    @JsonProperty("repairPoints")
    public void setRepairPoints(Integer repairPoints) {
        this.repairPoints = repairPoints;
    }

    @JsonProperty("participants")
    public List<Participant__1> getParticipants() {
        return participants;
    }

    @JsonProperty("participants")
    public void setParticipants(List<Participant__1> participants) {
        this.participants = participants;
    }

    @JsonProperty("periodPoints")
    public Integer getPeriodPoints() {
        return periodPoints;
    }

    @JsonProperty("periodPoints")
    public void setPeriodPoints(Integer periodPoints) {
        this.periodPoints = periodPoints;
    }

    @JsonProperty("clanScore")
    public Integer getClanScore() {
        return clanScore;
    }

    @JsonProperty("clanScore")
    public void setClanScore(Integer clanScore) {
        this.clanScore = clanScore;
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
        sb.append(Clan__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("badgeId");
        sb.append('=');
        sb.append(((this.badgeId == null)?"<null>":this.badgeId));
        sb.append(',');
        sb.append("fame");
        sb.append('=');
        sb.append(((this.fame == null)?"<null>":this.fame));
        sb.append(',');
        sb.append("repairPoints");
        sb.append('=');
        sb.append(((this.repairPoints == null)?"<null>":this.repairPoints));
        sb.append(',');
        sb.append("participants");
        sb.append('=');
        sb.append(((this.participants == null)?"<null>":this.participants));
        sb.append(',');
        sb.append("periodPoints");
        sb.append('=');
        sb.append(((this.periodPoints == null)?"<null>":this.periodPoints));
        sb.append(',');
        sb.append("clanScore");
        sb.append('=');
        sb.append(((this.clanScore == null)?"<null>":this.clanScore));
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
        result = ((result* 31)+((this.badgeId == null)? 0 :this.badgeId.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.repairPoints == null)? 0 :this.repairPoints.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.clanScore == null)? 0 :this.clanScore.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fame == null)? 0 :this.fame.hashCode()));
        result = ((result* 31)+((this.participants == null)? 0 :this.participants.hashCode()));
        result = ((result* 31)+((this.periodPoints == null)? 0 :this.periodPoints.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Clan__1) == false) {
            return false;
        }
        Clan__1 rhs = ((Clan__1) other);
        return ((((((((((this.badgeId == rhs.badgeId)||((this.badgeId!= null)&&this.badgeId.equals(rhs.badgeId)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.repairPoints == rhs.repairPoints)||((this.repairPoints!= null)&&this.repairPoints.equals(rhs.repairPoints))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.clanScore == rhs.clanScore)||((this.clanScore!= null)&&this.clanScore.equals(rhs.clanScore))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fame == rhs.fame)||((this.fame!= null)&&this.fame.equals(rhs.fame))))&&((this.participants == rhs.participants)||((this.participants!= null)&&this.participants.equals(rhs.participants))))&&((this.periodPoints == rhs.periodPoints)||((this.periodPoints!= null)&&this.periodPoints.equals(rhs.periodPoints))));
    }

}
