package com.aajdev.springminerstats.dto.clashroyale.clan.tag;

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
    "tag",
    "name",
    "role",
    "lastSeen",
    "expLevel",
    "trophies",
    "arena",
    "clanRank",
    "previousClanRank",
    "donations",
    "donationsReceived",
    "clanChestPoints"
})
@Generated("jsonschema2pojo")
public class Member {

    @JsonProperty("tag")
    private String tag;
    @JsonProperty("name")
    private String name;
    @JsonProperty("role")
    private String role;
    @JsonProperty("lastSeen")
    private String lastSeen;
    @JsonProperty("expLevel")
    private Integer expLevel;
    @JsonProperty("trophies")
    private Integer trophies;
    @JsonProperty("arena")
    private Arena arena;
    @JsonProperty("clanRank")
    private Integer clanRank;
    @JsonProperty("previousClanRank")
    private Integer previousClanRank;
    @JsonProperty("donations")
    private Integer donations;
    @JsonProperty("donationsReceived")
    private Integer donationsReceived;
    @JsonProperty("clanChestPoints")
    private Integer clanChestPoints;
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

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("lastSeen")
    public String getLastSeen() {
        return lastSeen;
    }

    @JsonProperty("lastSeen")
    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    @JsonProperty("expLevel")
    public Integer getExpLevel() {
        return expLevel;
    }

    @JsonProperty("expLevel")
    public void setExpLevel(Integer expLevel) {
        this.expLevel = expLevel;
    }

    @JsonProperty("trophies")
    public Integer getTrophies() {
        return trophies;
    }

    @JsonProperty("trophies")
    public void setTrophies(Integer trophies) {
        this.trophies = trophies;
    }

    @JsonProperty("arena")
    public Arena getArena() {
        return arena;
    }

    @JsonProperty("arena")
    public void setArena(Arena arena) {
        this.arena = arena;
    }

    @JsonProperty("clanRank")
    public Integer getClanRank() {
        return clanRank;
    }

    @JsonProperty("clanRank")
    public void setClanRank(Integer clanRank) {
        this.clanRank = clanRank;
    }

    @JsonProperty("previousClanRank")
    public Integer getPreviousClanRank() {
        return previousClanRank;
    }

    @JsonProperty("previousClanRank")
    public void setPreviousClanRank(Integer previousClanRank) {
        this.previousClanRank = previousClanRank;
    }

    @JsonProperty("donations")
    public Integer getDonations() {
        return donations;
    }

    @JsonProperty("donations")
    public void setDonations(Integer donations) {
        this.donations = donations;
    }

    @JsonProperty("donationsReceived")
    public Integer getDonationsReceived() {
        return donationsReceived;
    }

    @JsonProperty("donationsReceived")
    public void setDonationsReceived(Integer donationsReceived) {
        this.donationsReceived = donationsReceived;
    }

    @JsonProperty("clanChestPoints")
    public Integer getClanChestPoints() {
        return clanChestPoints;
    }

    @JsonProperty("clanChestPoints")
    public void setClanChestPoints(Integer clanChestPoints) {
        this.clanChestPoints = clanChestPoints;
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
        sb.append(Member.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
        sb.append(',');
        sb.append("lastSeen");
        sb.append('=');
        sb.append(((this.lastSeen == null)?"<null>":this.lastSeen));
        sb.append(',');
        sb.append("expLevel");
        sb.append('=');
        sb.append(((this.expLevel == null)?"<null>":this.expLevel));
        sb.append(',');
        sb.append("trophies");
        sb.append('=');
        sb.append(((this.trophies == null)?"<null>":this.trophies));
        sb.append(',');
        sb.append("arena");
        sb.append('=');
        sb.append(((this.arena == null)?"<null>":this.arena));
        sb.append(',');
        sb.append("clanRank");
        sb.append('=');
        sb.append(((this.clanRank == null)?"<null>":this.clanRank));
        sb.append(',');
        sb.append("previousClanRank");
        sb.append('=');
        sb.append(((this.previousClanRank == null)?"<null>":this.previousClanRank));
        sb.append(',');
        sb.append("donations");
        sb.append('=');
        sb.append(((this.donations == null)?"<null>":this.donations));
        sb.append(',');
        sb.append("donationsReceived");
        sb.append('=');
        sb.append(((this.donationsReceived == null)?"<null>":this.donationsReceived));
        sb.append(',');
        sb.append("clanChestPoints");
        sb.append('=');
        sb.append(((this.clanChestPoints == null)?"<null>":this.clanChestPoints));
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
        result = ((result* 31)+((this.donationsReceived == null)? 0 :this.donationsReceived.hashCode()));
        result = ((result* 31)+((this.role == null)? 0 :this.role.hashCode()));
        result = ((result* 31)+((this.donations == null)? 0 :this.donations.hashCode()));
        result = ((result* 31)+((this.arena == null)? 0 :this.arena.hashCode()));
        result = ((result* 31)+((this.clanChestPoints == null)? 0 :this.clanChestPoints.hashCode()));
        result = ((result* 31)+((this.clanRank == null)? 0 :this.clanRank.hashCode()));
        result = ((result* 31)+((this.previousClanRank == null)? 0 :this.previousClanRank.hashCode()));
        result = ((result* 31)+((this.lastSeen == null)? 0 :this.lastSeen.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.expLevel == null)? 0 :this.expLevel.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.trophies == null)? 0 :this.trophies.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Member) == false) {
            return false;
        }
        Member rhs = ((Member) other);
        return ((((((((((((((this.donationsReceived == rhs.donationsReceived)||((this.donationsReceived!= null)&&this.donationsReceived.equals(rhs.donationsReceived)))&&((this.role == rhs.role)||((this.role!= null)&&this.role.equals(rhs.role))))&&((this.donations == rhs.donations)||((this.donations!= null)&&this.donations.equals(rhs.donations))))&&((this.arena == rhs.arena)||((this.arena!= null)&&this.arena.equals(rhs.arena))))&&((this.clanChestPoints == rhs.clanChestPoints)||((this.clanChestPoints!= null)&&this.clanChestPoints.equals(rhs.clanChestPoints))))&&((this.clanRank == rhs.clanRank)||((this.clanRank!= null)&&this.clanRank.equals(rhs.clanRank))))&&((this.previousClanRank == rhs.previousClanRank)||((this.previousClanRank!= null)&&this.previousClanRank.equals(rhs.previousClanRank))))&&((this.lastSeen == rhs.lastSeen)||((this.lastSeen!= null)&&this.lastSeen.equals(rhs.lastSeen))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.expLevel == rhs.expLevel)||((this.expLevel!= null)&&this.expLevel.equals(rhs.expLevel))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.trophies == rhs.trophies)||((this.trophies!= null)&&this.trophies.equals(rhs.trophies))));
    }

}
