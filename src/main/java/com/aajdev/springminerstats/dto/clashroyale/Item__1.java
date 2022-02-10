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
    "type",
    "badgeId",
    "clanScore",
    "clanWarTrophies",
    "location",
    "requiredTrophies",
    "donationsPerWeek",
    "clanChestLevel",
    "clanChestMaxLevel",
    "members"
})
@Generated("jsonschema2pojo")
public class Item__1 {

    @JsonProperty("tag")
    private String tag;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("badgeId")
    private Integer badgeId;
    @JsonProperty("clanScore")
    private Integer clanScore;
    @JsonProperty("clanWarTrophies")
    private Integer clanWarTrophies;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("requiredTrophies")
    private Integer requiredTrophies;
    @JsonProperty("donationsPerWeek")
    private Integer donationsPerWeek;
    @JsonProperty("clanChestLevel")
    private Integer clanChestLevel;
    @JsonProperty("clanChestMaxLevel")
    private Integer clanChestMaxLevel;
    @JsonProperty("members")
    private Integer members;
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

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("badgeId")
    public Integer getBadgeId() {
        return badgeId;
    }

    @JsonProperty("badgeId")
    public void setBadgeId(Integer badgeId) {
        this.badgeId = badgeId;
    }

    @JsonProperty("clanScore")
    public Integer getClanScore() {
        return clanScore;
    }

    @JsonProperty("clanScore")
    public void setClanScore(Integer clanScore) {
        this.clanScore = clanScore;
    }

    @JsonProperty("clanWarTrophies")
    public Integer getClanWarTrophies() {
        return clanWarTrophies;
    }

    @JsonProperty("clanWarTrophies")
    public void setClanWarTrophies(Integer clanWarTrophies) {
        this.clanWarTrophies = clanWarTrophies;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("requiredTrophies")
    public Integer getRequiredTrophies() {
        return requiredTrophies;
    }

    @JsonProperty("requiredTrophies")
    public void setRequiredTrophies(Integer requiredTrophies) {
        this.requiredTrophies = requiredTrophies;
    }

    @JsonProperty("donationsPerWeek")
    public Integer getDonationsPerWeek() {
        return donationsPerWeek;
    }

    @JsonProperty("donationsPerWeek")
    public void setDonationsPerWeek(Integer donationsPerWeek) {
        this.donationsPerWeek = donationsPerWeek;
    }

    @JsonProperty("clanChestLevel")
    public Integer getClanChestLevel() {
        return clanChestLevel;
    }

    @JsonProperty("clanChestLevel")
    public void setClanChestLevel(Integer clanChestLevel) {
        this.clanChestLevel = clanChestLevel;
    }

    @JsonProperty("clanChestMaxLevel")
    public Integer getClanChestMaxLevel() {
        return clanChestMaxLevel;
    }

    @JsonProperty("clanChestMaxLevel")
    public void setClanChestMaxLevel(Integer clanChestMaxLevel) {
        this.clanChestMaxLevel = clanChestMaxLevel;
    }

    @JsonProperty("members")
    public Integer getMembers() {
        return members;
    }

    @JsonProperty("members")
    public void setMembers(Integer members) {
        this.members = members;
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
        sb.append(Item__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("badgeId");
        sb.append('=');
        sb.append(((this.badgeId == null)?"<null>":this.badgeId));
        sb.append(',');
        sb.append("clanScore");
        sb.append('=');
        sb.append(((this.clanScore == null)?"<null>":this.clanScore));
        sb.append(',');
        sb.append("clanWarTrophies");
        sb.append('=');
        sb.append(((this.clanWarTrophies == null)?"<null>":this.clanWarTrophies));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("requiredTrophies");
        sb.append('=');
        sb.append(((this.requiredTrophies == null)?"<null>":this.requiredTrophies));
        sb.append(',');
        sb.append("donationsPerWeek");
        sb.append('=');
        sb.append(((this.donationsPerWeek == null)?"<null>":this.donationsPerWeek));
        sb.append(',');
        sb.append("clanChestLevel");
        sb.append('=');
        sb.append(((this.clanChestLevel == null)?"<null>":this.clanChestLevel));
        sb.append(',');
        sb.append("clanChestMaxLevel");
        sb.append('=');
        sb.append(((this.clanChestMaxLevel == null)?"<null>":this.clanChestMaxLevel));
        sb.append(',');
        sb.append("members");
        sb.append('=');
        sb.append(((this.members == null)?"<null>":this.members));
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
        result = ((result* 31)+((this.clanChestLevel == null)? 0 :this.clanChestLevel.hashCode()));
        result = ((result* 31)+((this.badgeId == null)? 0 :this.badgeId.hashCode()));
        result = ((result* 31)+((this.requiredTrophies == null)? 0 :this.requiredTrophies.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.donationsPerWeek == null)? 0 :this.donationsPerWeek.hashCode()));
        result = ((result* 31)+((this.members == null)? 0 :this.members.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.clanWarTrophies == null)? 0 :this.clanWarTrophies.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.clanScore == null)? 0 :this.clanScore.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.clanChestMaxLevel == null)? 0 :this.clanChestMaxLevel.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item__1) == false) {
            return false;
        }
        Item__1 rhs = ((Item__1) other);
        return ((((((((((((((this.clanChestLevel == rhs.clanChestLevel)||((this.clanChestLevel!= null)&&this.clanChestLevel.equals(rhs.clanChestLevel)))&&((this.badgeId == rhs.badgeId)||((this.badgeId!= null)&&this.badgeId.equals(rhs.badgeId))))&&((this.requiredTrophies == rhs.requiredTrophies)||((this.requiredTrophies!= null)&&this.requiredTrophies.equals(rhs.requiredTrophies))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.donationsPerWeek == rhs.donationsPerWeek)||((this.donationsPerWeek!= null)&&this.donationsPerWeek.equals(rhs.donationsPerWeek))))&&((this.members == rhs.members)||((this.members!= null)&&this.members.equals(rhs.members))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.clanWarTrophies == rhs.clanWarTrophies)||((this.clanWarTrophies!= null)&&this.clanWarTrophies.equals(rhs.clanWarTrophies))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.clanScore == rhs.clanScore)||((this.clanScore!= null)&&this.clanScore.equals(rhs.clanScore))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.clanChestMaxLevel == rhs.clanChestMaxLevel)||((this.clanChestMaxLevel!= null)&&this.clanChestMaxLevel.equals(rhs.clanChestMaxLevel))));
    }

}
