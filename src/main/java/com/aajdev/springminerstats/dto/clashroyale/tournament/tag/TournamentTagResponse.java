package com.aajdev.springminerstats.dto.clashroyale.tournament.tag;

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
    "tag",
    "type",
    "status",
    "creatorTag",
    "name",
    "levelCap",
    "firstPlaceCardPrize",
    "capacity",
    "maxCapacity",
    "preparationDuration",
    "duration",
    "createdTime",
    "startedTime",
    "membersList",
    "gameMode"
})
@Generated("jsonschema2pojo")
public class TournamentTagResponse {

    @JsonProperty("tag")
    private String tag;
    @JsonProperty("type")
    private String type;
    @JsonProperty("status")
    private String status;
    @JsonProperty("creatorTag")
    private String creatorTag;
    @JsonProperty("name")
    private String name;
    @JsonProperty("levelCap")
    private Integer levelCap;
    @JsonProperty("firstPlaceCardPrize")
    private Integer firstPlaceCardPrize;
    @JsonProperty("capacity")
    private Integer capacity;
    @JsonProperty("maxCapacity")
    private Integer maxCapacity;
    @JsonProperty("preparationDuration")
    private Integer preparationDuration;
    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("createdTime")
    private String createdTime;
    @JsonProperty("startedTime")
    private String startedTime;
    @JsonProperty("membersList")
    private List<Members> membersList = new ArrayList<Members>();
    @JsonProperty("gameMode")
    private GameMode gameMode;
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

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("creatorTag")
    public String getCreatorTag() {
        return creatorTag;
    }

    @JsonProperty("creatorTag")
    public void setCreatorTag(String creatorTag) {
        this.creatorTag = creatorTag;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("levelCap")
    public Integer getLevelCap() {
        return levelCap;
    }

    @JsonProperty("levelCap")
    public void setLevelCap(Integer levelCap) {
        this.levelCap = levelCap;
    }

    @JsonProperty("firstPlaceCardPrize")
    public Integer getFirstPlaceCardPrize() {
        return firstPlaceCardPrize;
    }

    @JsonProperty("firstPlaceCardPrize")
    public void setFirstPlaceCardPrize(Integer firstPlaceCardPrize) {
        this.firstPlaceCardPrize = firstPlaceCardPrize;
    }

    @JsonProperty("capacity")
    public Integer getCapacity() {
        return capacity;
    }

    @JsonProperty("capacity")
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @JsonProperty("maxCapacity")
    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    @JsonProperty("maxCapacity")
    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @JsonProperty("preparationDuration")
    public Integer getPreparationDuration() {
        return preparationDuration;
    }

    @JsonProperty("preparationDuration")
    public void setPreparationDuration(Integer preparationDuration) {
        this.preparationDuration = preparationDuration;
    }

    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @JsonProperty("createdTime")
    public String getCreatedTime() {
        return createdTime;
    }

    @JsonProperty("createdTime")
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    @JsonProperty("startedTime")
    public String getStartedTime() {
        return startedTime;
    }

    @JsonProperty("startedTime")
    public void setStartedTime(String startedTime) {
        this.startedTime = startedTime;
    }

    @JsonProperty("membersList")
    public List<Members> getMembersList() {
        return membersList;
    }

    @JsonProperty("membersList")
    public void setMembersList(List<Members> membersList) {
        this.membersList = membersList;
    }

    @JsonProperty("gameMode")
    public GameMode getGameMode() {
        return gameMode;
    }

    @JsonProperty("gameMode")
    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
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
        sb.append(TournamentTagResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("creatorTag");
        sb.append('=');
        sb.append(((this.creatorTag == null)?"<null>":this.creatorTag));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("levelCap");
        sb.append('=');
        sb.append(((this.levelCap == null)?"<null>":this.levelCap));
        sb.append(',');
        sb.append("firstPlaceCardPrize");
        sb.append('=');
        sb.append(((this.firstPlaceCardPrize == null)?"<null>":this.firstPlaceCardPrize));
        sb.append(',');
        sb.append("capacity");
        sb.append('=');
        sb.append(((this.capacity == null)?"<null>":this.capacity));
        sb.append(',');
        sb.append("maxCapacity");
        sb.append('=');
        sb.append(((this.maxCapacity == null)?"<null>":this.maxCapacity));
        sb.append(',');
        sb.append("preparationDuration");
        sb.append('=');
        sb.append(((this.preparationDuration == null)?"<null>":this.preparationDuration));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("createdTime");
        sb.append('=');
        sb.append(((this.createdTime == null)?"<null>":this.createdTime));
        sb.append(',');
        sb.append("startedTime");
        sb.append('=');
        sb.append(((this.startedTime == null)?"<null>":this.startedTime));
        sb.append(',');
        sb.append("membersList");
        sb.append('=');
        sb.append(((this.membersList == null)?"<null>":this.membersList));
        sb.append(',');
        sb.append("gameMode");
        sb.append('=');
        sb.append(((this.gameMode == null)?"<null>":this.gameMode));
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
        result = ((result* 31)+((this.startedTime == null)? 0 :this.startedTime.hashCode()));
        result = ((result* 31)+((this.preparationDuration == null)? 0 :this.preparationDuration.hashCode()));
        result = ((result* 31)+((this.firstPlaceCardPrize == null)? 0 :this.firstPlaceCardPrize.hashCode()));
        result = ((result* 31)+((this.maxCapacity == null)? 0 :this.maxCapacity.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.capacity == null)? 0 :this.capacity.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.membersList == null)? 0 :this.membersList.hashCode()));
        result = ((result* 31)+((this.creatorTag == null)? 0 :this.creatorTag.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.createdTime == null)? 0 :this.createdTime.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.gameMode == null)? 0 :this.gameMode.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.levelCap == null)? 0 :this.levelCap.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TournamentTagResponse) == false) {
            return false;
        }
        TournamentTagResponse rhs = ((TournamentTagResponse) other);
        return (((((((((((((((((this.startedTime == rhs.startedTime)||((this.startedTime!= null)&&this.startedTime.equals(rhs.startedTime)))&&((this.preparationDuration == rhs.preparationDuration)||((this.preparationDuration!= null)&&this.preparationDuration.equals(rhs.preparationDuration))))&&((this.firstPlaceCardPrize == rhs.firstPlaceCardPrize)||((this.firstPlaceCardPrize!= null)&&this.firstPlaceCardPrize.equals(rhs.firstPlaceCardPrize))))&&((this.maxCapacity == rhs.maxCapacity)||((this.maxCapacity!= null)&&this.maxCapacity.equals(rhs.maxCapacity))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.capacity == rhs.capacity)||((this.capacity!= null)&&this.capacity.equals(rhs.capacity))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.membersList == rhs.membersList)||((this.membersList!= null)&&this.membersList.equals(rhs.membersList))))&&((this.creatorTag == rhs.creatorTag)||((this.creatorTag!= null)&&this.creatorTag.equals(rhs.creatorTag))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.createdTime == rhs.createdTime)||((this.createdTime!= null)&&this.createdTime.equals(rhs.createdTime))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.gameMode == rhs.gameMode)||((this.gameMode!= null)&&this.gameMode.equals(rhs.gameMode))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.levelCap == rhs.levelCap)||((this.levelCap!= null)&&this.levelCap.equals(rhs.levelCap))));
    }

}
