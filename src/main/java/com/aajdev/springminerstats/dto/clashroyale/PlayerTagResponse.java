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
    "name",
    "expLevel",
    "trophies",
    "bestTrophies",
    "wins",
    "losses",
    "battleCount",
    "threeCrownWins",
    "challengeCardsWon",
    "challengeMaxWins",
    "tournamentCardsWon",
    "tournamentBattleCount",
    "role",
    "donations",
    "donationsReceived",
    "totalDonations",
    "warDayWins",
    "clanCardsCollected",
    "clan",
    "arena",
    "leagueStatistics",
    "badges",
    "achievements",
    "cards",
    "currentDeck",
    "currentFavouriteCard",
    "starPoints",
    "expPoints"
})
@Generated("jsonschema2pojo")
public class PlayerTagResponse {

    @JsonProperty("tag")
    private String tag;
    @JsonProperty("name")
    private String name;
    @JsonProperty("expLevel")
    private Integer expLevel;
    @JsonProperty("trophies")
    private Integer trophies;
    @JsonProperty("bestTrophies")
    private Integer bestTrophies;
    @JsonProperty("wins")
    private Integer wins;
    @JsonProperty("losses")
    private Integer losses;
    @JsonProperty("battleCount")
    private Integer battleCount;
    @JsonProperty("threeCrownWins")
    private Integer threeCrownWins;
    @JsonProperty("challengeCardsWon")
    private Integer challengeCardsWon;
    @JsonProperty("challengeMaxWins")
    private Integer challengeMaxWins;
    @JsonProperty("tournamentCardsWon")
    private Integer tournamentCardsWon;
    @JsonProperty("tournamentBattleCount")
    private Integer tournamentBattleCount;
    @JsonProperty("role")
    private String role;
    @JsonProperty("donations")
    private Integer donations;
    @JsonProperty("donationsReceived")
    private Integer donationsReceived;
    @JsonProperty("totalDonations")
    private Integer totalDonations;
    @JsonProperty("warDayWins")
    private Integer warDayWins;
    @JsonProperty("clanCardsCollected")
    private Integer clanCardsCollected;
    @JsonProperty("clan")
    private Clan__7 clan;
    @JsonProperty("arena")
    private Arena__5 arena;
    @JsonProperty("leagueStatistics")
    private LeagueStatistics leagueStatistics;
    @JsonProperty("badges")
    private List<Badge> badges = new ArrayList<Badge>();
    @JsonProperty("achievements")
    private List<Achievement> achievements = new ArrayList<Achievement>();
    @JsonProperty("cards")
    private List<Card__2> cards = new ArrayList<Card__2>();
    @JsonProperty("currentDeck")
    private List<CurrentDeck> currentDeck = new ArrayList<CurrentDeck>();
    @JsonProperty("currentFavouriteCard")
    private CurrentFavouriteCard currentFavouriteCard;
    @JsonProperty("starPoints")
    private Integer starPoints;
    @JsonProperty("expPoints")
    private Integer expPoints;
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

    @JsonProperty("bestTrophies")
    public Integer getBestTrophies() {
        return bestTrophies;
    }

    @JsonProperty("bestTrophies")
    public void setBestTrophies(Integer bestTrophies) {
        this.bestTrophies = bestTrophies;
    }

    @JsonProperty("wins")
    public Integer getWins() {
        return wins;
    }

    @JsonProperty("wins")
    public void setWins(Integer wins) {
        this.wins = wins;
    }

    @JsonProperty("losses")
    public Integer getLosses() {
        return losses;
    }

    @JsonProperty("losses")
    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    @JsonProperty("battleCount")
    public Integer getBattleCount() {
        return battleCount;
    }

    @JsonProperty("battleCount")
    public void setBattleCount(Integer battleCount) {
        this.battleCount = battleCount;
    }

    @JsonProperty("threeCrownWins")
    public Integer getThreeCrownWins() {
        return threeCrownWins;
    }

    @JsonProperty("threeCrownWins")
    public void setThreeCrownWins(Integer threeCrownWins) {
        this.threeCrownWins = threeCrownWins;
    }

    @JsonProperty("challengeCardsWon")
    public Integer getChallengeCardsWon() {
        return challengeCardsWon;
    }

    @JsonProperty("challengeCardsWon")
    public void setChallengeCardsWon(Integer challengeCardsWon) {
        this.challengeCardsWon = challengeCardsWon;
    }

    @JsonProperty("challengeMaxWins")
    public Integer getChallengeMaxWins() {
        return challengeMaxWins;
    }

    @JsonProperty("challengeMaxWins")
    public void setChallengeMaxWins(Integer challengeMaxWins) {
        this.challengeMaxWins = challengeMaxWins;
    }

    @JsonProperty("tournamentCardsWon")
    public Integer getTournamentCardsWon() {
        return tournamentCardsWon;
    }

    @JsonProperty("tournamentCardsWon")
    public void setTournamentCardsWon(Integer tournamentCardsWon) {
        this.tournamentCardsWon = tournamentCardsWon;
    }

    @JsonProperty("tournamentBattleCount")
    public Integer getTournamentBattleCount() {
        return tournamentBattleCount;
    }

    @JsonProperty("tournamentBattleCount")
    public void setTournamentBattleCount(Integer tournamentBattleCount) {
        this.tournamentBattleCount = tournamentBattleCount;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
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

    @JsonProperty("totalDonations")
    public Integer getTotalDonations() {
        return totalDonations;
    }

    @JsonProperty("totalDonations")
    public void setTotalDonations(Integer totalDonations) {
        this.totalDonations = totalDonations;
    }

    @JsonProperty("warDayWins")
    public Integer getWarDayWins() {
        return warDayWins;
    }

    @JsonProperty("warDayWins")
    public void setWarDayWins(Integer warDayWins) {
        this.warDayWins = warDayWins;
    }

    @JsonProperty("clanCardsCollected")
    public Integer getClanCardsCollected() {
        return clanCardsCollected;
    }

    @JsonProperty("clanCardsCollected")
    public void setClanCardsCollected(Integer clanCardsCollected) {
        this.clanCardsCollected = clanCardsCollected;
    }

    @JsonProperty("clan")
    public Clan__7 getClan() {
        return clan;
    }

    @JsonProperty("clan")
    public void setClan(Clan__7 clan) {
        this.clan = clan;
    }

    @JsonProperty("arena")
    public Arena__5 getArena() {
        return arena;
    }

    @JsonProperty("arena")
    public void setArena(Arena__5 arena) {
        this.arena = arena;
    }

    @JsonProperty("leagueStatistics")
    public LeagueStatistics getLeagueStatistics() {
        return leagueStatistics;
    }

    @JsonProperty("leagueStatistics")
    public void setLeagueStatistics(LeagueStatistics leagueStatistics) {
        this.leagueStatistics = leagueStatistics;
    }

    @JsonProperty("badges")
    public List<Badge> getBadges() {
        return badges;
    }

    @JsonProperty("badges")
    public void setBadges(List<Badge> badges) {
        this.badges = badges;
    }

    @JsonProperty("achievements")
    public List<Achievement> getAchievements() {
        return achievements;
    }

    @JsonProperty("achievements")
    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    @JsonProperty("cards")
    public List<Card__2> getCards() {
        return cards;
    }

    @JsonProperty("cards")
    public void setCards(List<Card__2> cards) {
        this.cards = cards;
    }

    @JsonProperty("currentDeck")
    public List<CurrentDeck> getCurrentDeck() {
        return currentDeck;
    }

    @JsonProperty("currentDeck")
    public void setCurrentDeck(List<CurrentDeck> currentDeck) {
        this.currentDeck = currentDeck;
    }

    @JsonProperty("currentFavouriteCard")
    public CurrentFavouriteCard getCurrentFavouriteCard() {
        return currentFavouriteCard;
    }

    @JsonProperty("currentFavouriteCard")
    public void setCurrentFavouriteCard(CurrentFavouriteCard currentFavouriteCard) {
        this.currentFavouriteCard = currentFavouriteCard;
    }

    @JsonProperty("starPoints")
    public Integer getStarPoints() {
        return starPoints;
    }

    @JsonProperty("starPoints")
    public void setStarPoints(Integer starPoints) {
        this.starPoints = starPoints;
    }

    @JsonProperty("expPoints")
    public Integer getExpPoints() {
        return expPoints;
    }

    @JsonProperty("expPoints")
    public void setExpPoints(Integer expPoints) {
        this.expPoints = expPoints;
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
        sb.append(PlayerTagResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("bestTrophies");
        sb.append('=');
        sb.append(((this.bestTrophies == null)?"<null>":this.bestTrophies));
        sb.append(',');
        sb.append("wins");
        sb.append('=');
        sb.append(((this.wins == null)?"<null>":this.wins));
        sb.append(',');
        sb.append("losses");
        sb.append('=');
        sb.append(((this.losses == null)?"<null>":this.losses));
        sb.append(',');
        sb.append("battleCount");
        sb.append('=');
        sb.append(((this.battleCount == null)?"<null>":this.battleCount));
        sb.append(',');
        sb.append("threeCrownWins");
        sb.append('=');
        sb.append(((this.threeCrownWins == null)?"<null>":this.threeCrownWins));
        sb.append(',');
        sb.append("challengeCardsWon");
        sb.append('=');
        sb.append(((this.challengeCardsWon == null)?"<null>":this.challengeCardsWon));
        sb.append(',');
        sb.append("challengeMaxWins");
        sb.append('=');
        sb.append(((this.challengeMaxWins == null)?"<null>":this.challengeMaxWins));
        sb.append(',');
        sb.append("tournamentCardsWon");
        sb.append('=');
        sb.append(((this.tournamentCardsWon == null)?"<null>":this.tournamentCardsWon));
        sb.append(',');
        sb.append("tournamentBattleCount");
        sb.append('=');
        sb.append(((this.tournamentBattleCount == null)?"<null>":this.tournamentBattleCount));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
        sb.append(',');
        sb.append("donations");
        sb.append('=');
        sb.append(((this.donations == null)?"<null>":this.donations));
        sb.append(',');
        sb.append("donationsReceived");
        sb.append('=');
        sb.append(((this.donationsReceived == null)?"<null>":this.donationsReceived));
        sb.append(',');
        sb.append("totalDonations");
        sb.append('=');
        sb.append(((this.totalDonations == null)?"<null>":this.totalDonations));
        sb.append(',');
        sb.append("warDayWins");
        sb.append('=');
        sb.append(((this.warDayWins == null)?"<null>":this.warDayWins));
        sb.append(',');
        sb.append("clanCardsCollected");
        sb.append('=');
        sb.append(((this.clanCardsCollected == null)?"<null>":this.clanCardsCollected));
        sb.append(',');
        sb.append("clan");
        sb.append('=');
        sb.append(((this.clan == null)?"<null>":this.clan));
        sb.append(',');
        sb.append("arena");
        sb.append('=');
        sb.append(((this.arena == null)?"<null>":this.arena));
        sb.append(',');
        sb.append("leagueStatistics");
        sb.append('=');
        sb.append(((this.leagueStatistics == null)?"<null>":this.leagueStatistics));
        sb.append(',');
        sb.append("badges");
        sb.append('=');
        sb.append(((this.badges == null)?"<null>":this.badges));
        sb.append(',');
        sb.append("achievements");
        sb.append('=');
        sb.append(((this.achievements == null)?"<null>":this.achievements));
        sb.append(',');
        sb.append("cards");
        sb.append('=');
        sb.append(((this.cards == null)?"<null>":this.cards));
        sb.append(',');
        sb.append("currentDeck");
        sb.append('=');
        sb.append(((this.currentDeck == null)?"<null>":this.currentDeck));
        sb.append(',');
        sb.append("currentFavouriteCard");
        sb.append('=');
        sb.append(((this.currentFavouriteCard == null)?"<null>":this.currentFavouriteCard));
        sb.append(',');
        sb.append("starPoints");
        sb.append('=');
        sb.append(((this.starPoints == null)?"<null>":this.starPoints));
        sb.append(',');
        sb.append("expPoints");
        sb.append('=');
        sb.append(((this.expPoints == null)?"<null>":this.expPoints));
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
        result = ((result* 31)+((this.role == null)? 0 :this.role.hashCode()));
        result = ((result* 31)+((this.achievements == null)? 0 :this.achievements.hashCode()));
        result = ((result* 31)+((this.cards == null)? 0 :this.cards.hashCode()));
        result = ((result* 31)+((this.donations == null)? 0 :this.donations.hashCode()));
        result = ((result* 31)+((this.currentFavouriteCard == null)? 0 :this.currentFavouriteCard.hashCode()));
        result = ((result* 31)+((this.leagueStatistics == null)? 0 :this.leagueStatistics.hashCode()));
        result = ((result* 31)+((this.challengeCardsWon == null)? 0 :this.challengeCardsWon.hashCode()));
        result = ((result* 31)+((this.arena == null)? 0 :this.arena.hashCode()));
        result = ((result* 31)+((this.losses == null)? 0 :this.losses.hashCode()));
        result = ((result* 31)+((this.currentDeck == null)? 0 :this.currentDeck.hashCode()));
        result = ((result* 31)+((this.tournamentCardsWon == null)? 0 :this.tournamentCardsWon.hashCode()));
        result = ((result* 31)+((this.expLevel == null)? 0 :this.expLevel.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.warDayWins == null)? 0 :this.warDayWins.hashCode()));
        result = ((result* 31)+((this.trophies == null)? 0 :this.trophies.hashCode()));
        result = ((result* 31)+((this.wins == null)? 0 :this.wins.hashCode()));
        result = ((result* 31)+((this.donationsReceived == null)? 0 :this.donationsReceived.hashCode()));
        result = ((result* 31)+((this.threeCrownWins == null)? 0 :this.threeCrownWins.hashCode()));
        result = ((result* 31)+((this.clanCardsCollected == null)? 0 :this.clanCardsCollected.hashCode()));
        result = ((result* 31)+((this.tournamentBattleCount == null)? 0 :this.tournamentBattleCount.hashCode()));
        result = ((result* 31)+((this.badges == null)? 0 :this.badges.hashCode()));
        result = ((result* 31)+((this.totalDonations == null)? 0 :this.totalDonations.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.bestTrophies == null)? 0 :this.bestTrophies.hashCode()));
        result = ((result* 31)+((this.challengeMaxWins == null)? 0 :this.challengeMaxWins.hashCode()));
        result = ((result* 31)+((this.clan == null)? 0 :this.clan.hashCode()));
        result = ((result* 31)+((this.expPoints == null)? 0 :this.expPoints.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.starPoints == null)? 0 :this.starPoints.hashCode()));
        result = ((result* 31)+((this.battleCount == null)? 0 :this.battleCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlayerTagResponse) == false) {
            return false;
        }
        PlayerTagResponse rhs = ((PlayerTagResponse) other);
        return (((((((((((((((((((((((((((((((this.role == rhs.role)||((this.role!= null)&&this.role.equals(rhs.role)))&&((this.achievements == rhs.achievements)||((this.achievements!= null)&&this.achievements.equals(rhs.achievements))))&&((this.cards == rhs.cards)||((this.cards!= null)&&this.cards.equals(rhs.cards))))&&((this.donations == rhs.donations)||((this.donations!= null)&&this.donations.equals(rhs.donations))))&&((this.currentFavouriteCard == rhs.currentFavouriteCard)||((this.currentFavouriteCard!= null)&&this.currentFavouriteCard.equals(rhs.currentFavouriteCard))))&&((this.leagueStatistics == rhs.leagueStatistics)||((this.leagueStatistics!= null)&&this.leagueStatistics.equals(rhs.leagueStatistics))))&&((this.challengeCardsWon == rhs.challengeCardsWon)||((this.challengeCardsWon!= null)&&this.challengeCardsWon.equals(rhs.challengeCardsWon))))&&((this.arena == rhs.arena)||((this.arena!= null)&&this.arena.equals(rhs.arena))))&&((this.losses == rhs.losses)||((this.losses!= null)&&this.losses.equals(rhs.losses))))&&((this.currentDeck == rhs.currentDeck)||((this.currentDeck!= null)&&this.currentDeck.equals(rhs.currentDeck))))&&((this.tournamentCardsWon == rhs.tournamentCardsWon)||((this.tournamentCardsWon!= null)&&this.tournamentCardsWon.equals(rhs.tournamentCardsWon))))&&((this.expLevel == rhs.expLevel)||((this.expLevel!= null)&&this.expLevel.equals(rhs.expLevel))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.warDayWins == rhs.warDayWins)||((this.warDayWins!= null)&&this.warDayWins.equals(rhs.warDayWins))))&&((this.trophies == rhs.trophies)||((this.trophies!= null)&&this.trophies.equals(rhs.trophies))))&&((this.wins == rhs.wins)||((this.wins!= null)&&this.wins.equals(rhs.wins))))&&((this.donationsReceived == rhs.donationsReceived)||((this.donationsReceived!= null)&&this.donationsReceived.equals(rhs.donationsReceived))))&&((this.threeCrownWins == rhs.threeCrownWins)||((this.threeCrownWins!= null)&&this.threeCrownWins.equals(rhs.threeCrownWins))))&&((this.clanCardsCollected == rhs.clanCardsCollected)||((this.clanCardsCollected!= null)&&this.clanCardsCollected.equals(rhs.clanCardsCollected))))&&((this.tournamentBattleCount == rhs.tournamentBattleCount)||((this.tournamentBattleCount!= null)&&this.tournamentBattleCount.equals(rhs.tournamentBattleCount))))&&((this.badges == rhs.badges)||((this.badges!= null)&&this.badges.equals(rhs.badges))))&&((this.totalDonations == rhs.totalDonations)||((this.totalDonations!= null)&&this.totalDonations.equals(rhs.totalDonations))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.bestTrophies == rhs.bestTrophies)||((this.bestTrophies!= null)&&this.bestTrophies.equals(rhs.bestTrophies))))&&((this.challengeMaxWins == rhs.challengeMaxWins)||((this.challengeMaxWins!= null)&&this.challengeMaxWins.equals(rhs.challengeMaxWins))))&&((this.clan == rhs.clan)||((this.clan!= null)&&this.clan.equals(rhs.clan))))&&((this.expPoints == rhs.expPoints)||((this.expPoints!= null)&&this.expPoints.equals(rhs.expPoints))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.starPoints == rhs.starPoints)||((this.starPoints!= null)&&this.starPoints.equals(rhs.starPoints))))&&((this.battleCount == rhs.battleCount)||((this.battleCount!= null)&&this.battleCount.equals(rhs.battleCount))));
    }

}
