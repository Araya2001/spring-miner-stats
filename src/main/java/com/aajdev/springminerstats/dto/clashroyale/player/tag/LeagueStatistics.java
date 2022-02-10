package com.aajdev.springminerstats.dto.clashroyale.player.tag;

import java.util.HashMap;
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
    "currentSeason",
    "previousSeason",
    "bestSeason"
})
@Generated("jsonschema2pojo")
public class LeagueStatistics {

    @JsonProperty("currentSeason")
    private CurrentSeason currentSeason;
    @JsonProperty("previousSeason")
    private PreviousSeason previousSeason;
    @JsonProperty("bestSeason")
    private BestSeason bestSeason;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("currentSeason")
    public CurrentSeason getCurrentSeason() {
        return currentSeason;
    }

    @JsonProperty("currentSeason")
    public void setCurrentSeason(CurrentSeason currentSeason) {
        this.currentSeason = currentSeason;
    }

    @JsonProperty("previousSeason")
    public PreviousSeason getPreviousSeason() {
        return previousSeason;
    }

    @JsonProperty("previousSeason")
    public void setPreviousSeason(PreviousSeason previousSeason) {
        this.previousSeason = previousSeason;
    }

    @JsonProperty("bestSeason")
    public BestSeason getBestSeason() {
        return bestSeason;
    }

    @JsonProperty("bestSeason")
    public void setBestSeason(BestSeason bestSeason) {
        this.bestSeason = bestSeason;
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
        sb.append(LeagueStatistics.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("currentSeason");
        sb.append('=');
        sb.append(((this.currentSeason == null)?"<null>":this.currentSeason));
        sb.append(',');
        sb.append("previousSeason");
        sb.append('=');
        sb.append(((this.previousSeason == null)?"<null>":this.previousSeason));
        sb.append(',');
        sb.append("bestSeason");
        sb.append('=');
        sb.append(((this.bestSeason == null)?"<null>":this.bestSeason));
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
        result = ((result* 31)+((this.previousSeason == null)? 0 :this.previousSeason.hashCode()));
        result = ((result* 31)+((this.bestSeason == null)? 0 :this.bestSeason.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.currentSeason == null)? 0 :this.currentSeason.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LeagueStatistics) == false) {
            return false;
        }
        LeagueStatistics rhs = ((LeagueStatistics) other);
        return (((((this.previousSeason == rhs.previousSeason)||((this.previousSeason!= null)&&this.previousSeason.equals(rhs.previousSeason)))&&((this.bestSeason == rhs.bestSeason)||((this.bestSeason!= null)&&this.bestSeason.equals(rhs.bestSeason))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.currentSeason == rhs.currentSeason)||((this.currentSeason!= null)&&this.currentSeason.equals(rhs.currentSeason))));
    }

}
