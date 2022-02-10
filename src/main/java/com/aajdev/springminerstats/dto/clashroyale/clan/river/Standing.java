package com.aajdev.springminerstats.dto.clashroyale.clan.river;

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
    "rank",
    "trophyChange",
    "clan"
})
@Generated("jsonschema2pojo")
public class Standing {

    @JsonProperty("rank")
    private Integer rank;
    @JsonProperty("trophyChange")
    private Integer trophyChange;
    @JsonProperty("clan")
    private Clan clan;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rank")
    public Integer getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @JsonProperty("trophyChange")
    public Integer getTrophyChange() {
        return trophyChange;
    }

    @JsonProperty("trophyChange")
    public void setTrophyChange(Integer trophyChange) {
        this.trophyChange = trophyChange;
    }

    @JsonProperty("clan")
    public Clan getClan() {
        return clan;
    }

    @JsonProperty("clan")
    public void setClan(Clan clan) {
        this.clan = clan;
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
        sb.append(Standing.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rank");
        sb.append('=');
        sb.append(((this.rank == null)?"<null>":this.rank));
        sb.append(',');
        sb.append("trophyChange");
        sb.append('=');
        sb.append(((this.trophyChange == null)?"<null>":this.trophyChange));
        sb.append(',');
        sb.append("clan");
        sb.append('=');
        sb.append(((this.clan == null)?"<null>":this.clan));
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
        result = ((result* 31)+((this.clan == null)? 0 :this.clan.hashCode()));
        result = ((result* 31)+((this.rank == null)? 0 :this.rank.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.trophyChange == null)? 0 :this.trophyChange.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Standing) == false) {
            return false;
        }
        Standing rhs = ((Standing) other);
        return (((((this.clan == rhs.clan)||((this.clan!= null)&&this.clan.equals(rhs.clan)))&&((this.rank == rhs.rank)||((this.rank!= null)&&this.rank.equals(rhs.rank))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.trophyChange == rhs.trophyChange)||((this.trophyChange!= null)&&this.trophyChange.equals(rhs.trophyChange))));
    }

}
