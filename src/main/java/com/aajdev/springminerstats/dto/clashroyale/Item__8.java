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
    "expLevel",
    "trophies",
    "rank",
    "previousRank",
    "clan",
    "arena"
})
@Generated("jsonschema2pojo")
public class Item__8 {

    @JsonProperty("tag")
    private String tag;
    @JsonProperty("name")
    private String name;
    @JsonProperty("expLevel")
    private Integer expLevel;
    @JsonProperty("trophies")
    private Integer trophies;
    @JsonProperty("rank")
    private Integer rank;
    @JsonProperty("previousRank")
    private Integer previousRank;
    @JsonProperty("clan")
    private Clan__4 clan;
    @JsonProperty("arena")
    private Arena__3 arena;
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

    @JsonProperty("clan")
    public Clan__4 getClan() {
        return clan;
    }

    @JsonProperty("clan")
    public void setClan(Clan__4 clan) {
        this.clan = clan;
    }

    @JsonProperty("arena")
    public Arena__3 getArena() {
        return arena;
    }

    @JsonProperty("arena")
    public void setArena(Arena__3 arena) {
        this.arena = arena;
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
        sb.append(Item__8 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("expLevel");
        sb.append('=');
        sb.append(((this.expLevel == null)?"<null>":this.expLevel));
        sb.append(',');
        sb.append("trophies");
        sb.append('=');
        sb.append(((this.trophies == null)?"<null>":this.trophies));
        sb.append(',');
        sb.append("rank");
        sb.append('=');
        sb.append(((this.rank == null)?"<null>":this.rank));
        sb.append(',');
        sb.append("previousRank");
        sb.append('=');
        sb.append(((this.previousRank == null)?"<null>":this.previousRank));
        sb.append(',');
        sb.append("clan");
        sb.append('=');
        sb.append(((this.clan == null)?"<null>":this.clan));
        sb.append(',');
        sb.append("arena");
        sb.append('=');
        sb.append(((this.arena == null)?"<null>":this.arena));
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
        result = ((result* 31)+((this.previousRank == null)? 0 :this.previousRank.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.expLevel == null)? 0 :this.expLevel.hashCode()));
        result = ((result* 31)+((this.clan == null)? 0 :this.clan.hashCode()));
        result = ((result* 31)+((this.rank == null)? 0 :this.rank.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.arena == null)? 0 :this.arena.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.trophies == null)? 0 :this.trophies.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item__8) == false) {
            return false;
        }
        Item__8 rhs = ((Item__8) other);
        return ((((((((((this.previousRank == rhs.previousRank)||((this.previousRank!= null)&&this.previousRank.equals(rhs.previousRank)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.expLevel == rhs.expLevel)||((this.expLevel!= null)&&this.expLevel.equals(rhs.expLevel))))&&((this.clan == rhs.clan)||((this.clan!= null)&&this.clan.equals(rhs.clan))))&&((this.rank == rhs.rank)||((this.rank!= null)&&this.rank.equals(rhs.rank))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.arena == rhs.arena)||((this.arena!= null)&&this.arena.equals(rhs.arena))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.trophies == rhs.trophies)||((this.trophies!= null)&&this.trophies.equals(rhs.trophies))));
    }

}
