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
    "fame",
    "repairPoints",
    "boatAttacks",
    "decksUsed",
    "decksUsedToday"
})
@Generated("jsonschema2pojo")
public class Participant__2 {

    @JsonProperty("tag")
    private String tag;
    @JsonProperty("name")
    private String name;
    @JsonProperty("fame")
    private Integer fame;
    @JsonProperty("repairPoints")
    private Integer repairPoints;
    @JsonProperty("boatAttacks")
    private Integer boatAttacks;
    @JsonProperty("decksUsed")
    private Integer decksUsed;
    @JsonProperty("decksUsedToday")
    private Integer decksUsedToday;
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

    @JsonProperty("boatAttacks")
    public Integer getBoatAttacks() {
        return boatAttacks;
    }

    @JsonProperty("boatAttacks")
    public void setBoatAttacks(Integer boatAttacks) {
        this.boatAttacks = boatAttacks;
    }

    @JsonProperty("decksUsed")
    public Integer getDecksUsed() {
        return decksUsed;
    }

    @JsonProperty("decksUsed")
    public void setDecksUsed(Integer decksUsed) {
        this.decksUsed = decksUsed;
    }

    @JsonProperty("decksUsedToday")
    public Integer getDecksUsedToday() {
        return decksUsedToday;
    }

    @JsonProperty("decksUsedToday")
    public void setDecksUsedToday(Integer decksUsedToday) {
        this.decksUsedToday = decksUsedToday;
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
        sb.append(Participant__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("fame");
        sb.append('=');
        sb.append(((this.fame == null)?"<null>":this.fame));
        sb.append(',');
        sb.append("repairPoints");
        sb.append('=');
        sb.append(((this.repairPoints == null)?"<null>":this.repairPoints));
        sb.append(',');
        sb.append("boatAttacks");
        sb.append('=');
        sb.append(((this.boatAttacks == null)?"<null>":this.boatAttacks));
        sb.append(',');
        sb.append("decksUsed");
        sb.append('=');
        sb.append(((this.decksUsed == null)?"<null>":this.decksUsed));
        sb.append(',');
        sb.append("decksUsedToday");
        sb.append('=');
        sb.append(((this.decksUsedToday == null)?"<null>":this.decksUsedToday));
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
        result = ((result* 31)+((this.decksUsedToday == null)? 0 :this.decksUsedToday.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.repairPoints == null)? 0 :this.repairPoints.hashCode()));
        result = ((result* 31)+((this.boatAttacks == null)? 0 :this.boatAttacks.hashCode()));
        result = ((result* 31)+((this.decksUsed == null)? 0 :this.decksUsed.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fame == null)? 0 :this.fame.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Participant__2) == false) {
            return false;
        }
        Participant__2 rhs = ((Participant__2) other);
        return (((((((((this.decksUsedToday == rhs.decksUsedToday)||((this.decksUsedToday!= null)&&this.decksUsedToday.equals(rhs.decksUsedToday)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.repairPoints == rhs.repairPoints)||((this.repairPoints!= null)&&this.repairPoints.equals(rhs.repairPoints))))&&((this.boatAttacks == rhs.boatAttacks)||((this.boatAttacks!= null)&&this.boatAttacks.equals(rhs.boatAttacks))))&&((this.decksUsed == rhs.decksUsed)||((this.decksUsed!= null)&&this.decksUsed.equals(rhs.decksUsed))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fame == rhs.fame)||((this.fame!= null)&&this.fame.equals(rhs.fame))));
    }

}
