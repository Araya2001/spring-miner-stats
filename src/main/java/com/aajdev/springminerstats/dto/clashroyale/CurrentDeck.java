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
    "name",
    "id",
    "level",
    "starLevel",
    "maxLevel",
    "count",
    "iconUrls"
})
@Generated("jsonschema2pojo")
public class CurrentDeck {

    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("level")
    private Integer level;
    @JsonProperty("starLevel")
    private Integer starLevel;
    @JsonProperty("maxLevel")
    private Integer maxLevel;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("iconUrls")
    private IconUrls__4 iconUrls;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("level")
    public Integer getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(Integer level) {
        this.level = level;
    }

    @JsonProperty("starLevel")
    public Integer getStarLevel() {
        return starLevel;
    }

    @JsonProperty("starLevel")
    public void setStarLevel(Integer starLevel) {
        this.starLevel = starLevel;
    }

    @JsonProperty("maxLevel")
    public Integer getMaxLevel() {
        return maxLevel;
    }

    @JsonProperty("maxLevel")
    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("iconUrls")
    public IconUrls__4 getIconUrls() {
        return iconUrls;
    }

    @JsonProperty("iconUrls")
    public void setIconUrls(IconUrls__4 iconUrls) {
        this.iconUrls = iconUrls;
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
        sb.append(CurrentDeck.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
        sb.append(',');
        sb.append("starLevel");
        sb.append('=');
        sb.append(((this.starLevel == null)?"<null>":this.starLevel));
        sb.append(',');
        sb.append("maxLevel");
        sb.append('=');
        sb.append(((this.maxLevel == null)?"<null>":this.maxLevel));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("iconUrls");
        sb.append('=');
        sb.append(((this.iconUrls == null)?"<null>":this.iconUrls));
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
        result = ((result* 31)+((this.maxLevel == null)? 0 :this.maxLevel.hashCode()));
        result = ((result* 31)+((this.level == null)? 0 :this.level.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this.iconUrls == null)? 0 :this.iconUrls.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.starLevel == null)? 0 :this.starLevel.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurrentDeck) == false) {
            return false;
        }
        CurrentDeck rhs = ((CurrentDeck) other);
        return (((((((((this.maxLevel == rhs.maxLevel)||((this.maxLevel!= null)&&this.maxLevel.equals(rhs.maxLevel)))&&((this.level == rhs.level)||((this.level!= null)&&this.level.equals(rhs.level))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count))))&&((this.iconUrls == rhs.iconUrls)||((this.iconUrls!= null)&&this.iconUrls.equals(rhs.iconUrls))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.starLevel == rhs.starLevel)||((this.starLevel!= null)&&this.starLevel.equals(rhs.starLevel))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
