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
    "seasonId",
    "sectionIndex",
    "createdDate",
    "standings"
})
@Generated("jsonschema2pojo")
public class Item__3 {

    @JsonProperty("seasonId")
    private Integer seasonId;
    @JsonProperty("sectionIndex")
    private Integer sectionIndex;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("standings")
    private List<Standing> standings = new ArrayList<Standing>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("seasonId")
    public Integer getSeasonId() {
        return seasonId;
    }

    @JsonProperty("seasonId")
    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    @JsonProperty("sectionIndex")
    public Integer getSectionIndex() {
        return sectionIndex;
    }

    @JsonProperty("sectionIndex")
    public void setSectionIndex(Integer sectionIndex) {
        this.sectionIndex = sectionIndex;
    }

    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("standings")
    public List<Standing> getStandings() {
        return standings;
    }

    @JsonProperty("standings")
    public void setStandings(List<Standing> standings) {
        this.standings = standings;
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
        sb.append(Item__3 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seasonId");
        sb.append('=');
        sb.append(((this.seasonId == null)?"<null>":this.seasonId));
        sb.append(',');
        sb.append("sectionIndex");
        sb.append('=');
        sb.append(((this.sectionIndex == null)?"<null>":this.sectionIndex));
        sb.append(',');
        sb.append("createdDate");
        sb.append('=');
        sb.append(((this.createdDate == null)?"<null>":this.createdDate));
        sb.append(',');
        sb.append("standings");
        sb.append('=');
        sb.append(((this.standings == null)?"<null>":this.standings));
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
        result = ((result* 31)+((this.createdDate == null)? 0 :this.createdDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.seasonId == null)? 0 :this.seasonId.hashCode()));
        result = ((result* 31)+((this.standings == null)? 0 :this.standings.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item__3) == false) {
            return false;
        }
        Item__3 rhs = ((Item__3) other);
        return ((((((this.sectionIndex == rhs.sectionIndex)||((this.sectionIndex!= null)&&this.sectionIndex.equals(rhs.sectionIndex)))&&((this.createdDate == rhs.createdDate)||((this.createdDate!= null)&&this.createdDate.equals(rhs.createdDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.seasonId == rhs.seasonId)||((this.seasonId!= null)&&this.seasonId.equals(rhs.seasonId))))&&((this.standings == rhs.standings)||((this.standings!= null)&&this.standings.equals(rhs.standings))));
    }

}
