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
    "id",
    "trophies",
    "bestTrophies"
})
@Generated("jsonschema2pojo")
public class PreviousSeason {

    @JsonProperty("id")
    private String id;
    @JsonProperty("trophies")
    private Integer trophies;
    @JsonProperty("bestTrophies")
    private Integer bestTrophies;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("trophies")
    public Integer getTrophies() {
        return trophies;
    }

    @JsonProperty("trophies")
    public void setTrophies(Integer trophies) {
        this.trophies = trophies;
    }

    @JsonProperty("bestTrophies")
    public Integer getBestTrophies() {
        return bestTrophies;
    }

    @JsonProperty("bestTrophies")
    public void setBestTrophies(Integer bestTrophies) {
        this.bestTrophies = bestTrophies;
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
        sb.append(PreviousSeason.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("trophies");
        sb.append('=');
        sb.append(((this.trophies == null)?"<null>":this.trophies));
        sb.append(',');
        sb.append("bestTrophies");
        sb.append('=');
        sb.append(((this.bestTrophies == null)?"<null>":this.bestTrophies));
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
        result = ((result* 31)+((this.bestTrophies == null)? 0 :this.bestTrophies.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.trophies == null)? 0 :this.trophies.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PreviousSeason) == false) {
            return false;
        }
        PreviousSeason rhs = ((PreviousSeason) other);
        return (((((this.bestTrophies == rhs.bestTrophies)||((this.bestTrophies!= null)&&this.bestTrophies.equals(rhs.bestTrophies)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.trophies == rhs.trophies)||((this.trophies!= null)&&this.trophies.equals(rhs.trophies))));
    }

}
