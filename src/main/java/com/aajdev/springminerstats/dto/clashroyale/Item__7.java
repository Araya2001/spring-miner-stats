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
    "rank",
    "previousRank",
    "location",
    "clanScore",
    "members",
    "badgeId"
})
@Generated("jsonschema2pojo")
public class Item__7 {

    @JsonProperty("tag")
    private String tag;
    @JsonProperty("name")
    private String name;
    @JsonProperty("rank")
    private Integer rank;
    @JsonProperty("previousRank")
    private Integer previousRank;
    @JsonProperty("location")
    private Location__4 location;
    @JsonProperty("clanScore")
    private Integer clanScore;
    @JsonProperty("members")
    private Integer members;
    @JsonProperty("badgeId")
    private Integer badgeId;
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

    @JsonProperty("rank")
    public Integer getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @JsonProperty("previousRank")
    public Integer getPreviousRank() {
        return previousRank;
    }

    @JsonProperty("previousRank")
    public void setPreviousRank(Integer previousRank) {
        this.previousRank = previousRank;
    }

    @JsonProperty("location")
    public Location__4 getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location__4 location) {
        this.location = location;
    }

    @JsonProperty("clanScore")
    public Integer getClanScore() {
        return clanScore;
    }

    @JsonProperty("clanScore")
    public void setClanScore(Integer clanScore) {
        this.clanScore = clanScore;
    }

    @JsonProperty("members")
    public Integer getMembers() {
        return members;
    }

    @JsonProperty("members")
    public void setMembers(Integer members) {
        this.members = members;
    }

    @JsonProperty("badgeId")
    public Integer getBadgeId() {
        return badgeId;
    }

    @JsonProperty("badgeId")
    public void setBadgeId(Integer badgeId) {
        this.badgeId = badgeId;
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
        sb.append(Item__7 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("rank");
        sb.append('=');
        sb.append(((this.rank == null)?"<null>":this.rank));
        sb.append(',');
        sb.append("previousRank");
        sb.append('=');
        sb.append(((this.previousRank == null)?"<null>":this.previousRank));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("clanScore");
        sb.append('=');
        sb.append(((this.clanScore == null)?"<null>":this.clanScore));
        sb.append(',');
        sb.append("members");
        sb.append('=');
        sb.append(((this.members == null)?"<null>":this.members));
        sb.append(',');
        sb.append("badgeId");
        sb.append('=');
        sb.append(((this.badgeId == null)?"<null>":this.badgeId));
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
        result = ((result* 31)+((this.previousRank == null)? 0 :this.previousRank.hashCode()));
        result = ((result* 31)+((this.members == null)? 0 :this.members.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.rank == null)? 0 :this.rank.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.clanScore == null)? 0 :this.clanScore.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item__7) == false) {
            return false;
        }
        Item__7 rhs = ((Item__7) other);
        return ((((((((((this.badgeId == rhs.badgeId)||((this.badgeId!= null)&&this.badgeId.equals(rhs.badgeId)))&&((this.previousRank == rhs.previousRank)||((this.previousRank!= null)&&this.previousRank.equals(rhs.previousRank))))&&((this.members == rhs.members)||((this.members!= null)&&this.members.equals(rhs.members))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.rank == rhs.rank)||((this.rank!= null)&&this.rank.equals(rhs.rank))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.clanScore == rhs.clanScore)||((this.clanScore!= null)&&this.clanScore.equals(rhs.clanScore))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
