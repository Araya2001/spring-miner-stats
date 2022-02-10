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
    "state",
    "clan",
    "clans",
    "sectionIndex",
    "periodIndex",
    "periodType"
})
@Generated("jsonschema2pojo")
public class ClanTagCurrentRiverResponse {

    @JsonProperty("state")
    private String state;
    @JsonProperty("clan")
    private Clan clan;
    @JsonProperty("clans")
    private List<Clan__1> clans = new ArrayList<Clan__1>();
    @JsonProperty("sectionIndex")
    private Integer sectionIndex;
    @JsonProperty("periodIndex")
    private Integer periodIndex;
    @JsonProperty("periodType")
    private String periodType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("clan")
    public Clan getClan() {
        return clan;
    }

    @JsonProperty("clan")
    public void setClan(Clan clan) {
        this.clan = clan;
    }

    @JsonProperty("clans")
    public List<Clan__1> getClans() {
        return clans;
    }

    @JsonProperty("clans")
    public void setClans(List<Clan__1> clans) {
        this.clans = clans;
    }

    @JsonProperty("sectionIndex")
    public Integer getSectionIndex() {
        return sectionIndex;
    }

    @JsonProperty("sectionIndex")
    public void setSectionIndex(Integer sectionIndex) {
        this.sectionIndex = sectionIndex;
    }

    @JsonProperty("periodIndex")
    public Integer getPeriodIndex() {
        return periodIndex;
    }

    @JsonProperty("periodIndex")
    public void setPeriodIndex(Integer periodIndex) {
        this.periodIndex = periodIndex;
    }

    @JsonProperty("periodType")
    public String getPeriodType() {
        return periodType;
    }

    @JsonProperty("periodType")
    public void setPeriodType(String periodType) {
        this.periodType = periodType;
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
        sb.append(ClanTagCurrentRiverResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("clan");
        sb.append('=');
        sb.append(((this.clan == null)?"<null>":this.clan));
        sb.append(',');
        sb.append("clans");
        sb.append('=');
        sb.append(((this.clans == null)?"<null>":this.clans));
        sb.append(',');
        sb.append("sectionIndex");
        sb.append('=');
        sb.append(((this.sectionIndex == null)?"<null>":this.sectionIndex));
        sb.append(',');
        sb.append("periodIndex");
        sb.append('=');
        sb.append(((this.periodIndex == null)?"<null>":this.periodIndex));
        sb.append(',');
        sb.append("periodType");
        sb.append('=');
        sb.append(((this.periodType == null)?"<null>":this.periodType));
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
        result = ((result* 31)+((this.sectionIndex == null)? 0 :this.sectionIndex.hashCode()));
        result = ((result* 31)+((this.periodType == null)? 0 :this.periodType.hashCode()));
        result = ((result* 31)+((this.clan == null)? 0 :this.clan.hashCode()));
        result = ((result* 31)+((this.clans == null)? 0 :this.clans.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.periodIndex == null)? 0 :this.periodIndex.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClanTagCurrentRiverResponse) == false) {
            return false;
        }
        ClanTagCurrentRiverResponse rhs = ((ClanTagCurrentRiverResponse) other);
        return ((((((((this.sectionIndex == rhs.sectionIndex)||((this.sectionIndex!= null)&&this.sectionIndex.equals(rhs.sectionIndex)))&&((this.periodType == rhs.periodType)||((this.periodType!= null)&&this.periodType.equals(rhs.periodType))))&&((this.clan == rhs.clan)||((this.clan!= null)&&this.clan.equals(rhs.clan))))&&((this.clans == rhs.clans)||((this.clans!= null)&&this.clans.equals(rhs.clans))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.periodIndex == rhs.periodIndex)||((this.periodIndex!= null)&&this.periodIndex.equals(rhs.periodIndex))));
    }

}
