package owking.entities;

import java.sql.Timestamp;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserClass {
    private String id;
    private int totalPoints;
    private String name;	
    private String battleName;
    private String battleTag;
    private String logo;
    private String finalStatisticsId;
    private String gradeId;
    private String email;
    private String password;
    private String twitter;
    private String twitch;
    private String rightsId;
    private String description;
    private Timestamp registerDate;
    private Timestamp lastConnectionDate;
    private Boolean isActive;

    public UserClass() 
    {
    }

    public UserClass(String id, int totalPoints, String name, String battleName, String battleTag, String logo, String finalStatisticsId, String gradeId, String email, String password, String twitter, String twitch, String rightsId, String description, Timestamp registerDate, Timestamp lastConnectionDate, Boolean isActive) {
        this.id = id;
        this.totalPoints = totalPoints;
        this.name = name;
        this.battleName = battleName;
        this.battleTag = battleTag;
        this.logo = logo;
        this.finalStatisticsId = finalStatisticsId;
        this.gradeId = gradeId;
        this.email = email;
        this.password = password;
        this.twitter = twitter;
        this.twitch = twitch;
        this.rightsId = rightsId;
        this.description = description;
        this.registerDate = registerDate;
        this.lastConnectionDate = lastConnectionDate;
        this.isActive = isActive;
    }

    public UserClass(String name, String battleTag, String email, String password) {
        this.name = name;
        this.battleTag = battleTag;
        this.email = email;
        this.password = password;
    }
    
    
    /**GETTERS**/
    public String getId() {
        return id;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public String getName() {
        return name;
    }

    public String getBattleName() {
        return battleName;
    }

    public String getBattleTag() {
        return battleTag;
    }

    public String getLogo() {
        return logo;
    }

    public String getFinalStatisticsId() {
        return finalStatisticsId;
    }

    public String getGradeId() {
        return gradeId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getTwitter() {
        return twitter;
    }

    public String getTwitch() {
        return twitch;
    }

    public String getRightsId() {
        return rightsId;
    }

    public String getDescription() {
        return description;
    }

    public Timestamp getRegisterDate() {
        return registerDate;
    }

    public Timestamp getLastConnectionDate() {
        return lastConnectionDate;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    /**SETTERS**/
    public void setId(String id) {
        this.id = id;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBattleName(String battleName) {
        this.battleName = battleName;
    }

    public void setBattleTag(String battleTag) {
        this.battleTag = battleTag;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setFinalStatisticsId(String finalStatisticsId) {
        this.finalStatisticsId = finalStatisticsId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public void setTwitch(String twitch) {
        this.twitch = twitch;
    }

    public void setRightsId(String rightsId) {
        this.rightsId = rightsId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRegisterDate(Timestamp registerDate) {
        this.registerDate = registerDate;
    }

    public void setLastConnectionDate(Timestamp lastConnectionDate) {
        this.lastConnectionDate = lastConnectionDate;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "UserClass{" + "id=" + id + ", totalPoints=" + totalPoints + ", name=" + name + ", battleName=" + battleName + ", battleTag=" + battleTag + ", logo=" + logo + ", finalStatisticsId=" + finalStatisticsId + ", gradeId=" + gradeId + ", email=" + email + ", password=" + password + ", twitter=" + twitter + ", twitch=" + twitch + ", rightsId=" + rightsId + ", description=" + description + ", registerDate=" + registerDate + ", lastConnectionDate=" + lastConnectionDate + ", isActive=" + isActive + '}';
    }

    
    
  

  
    
    
    
    
}

