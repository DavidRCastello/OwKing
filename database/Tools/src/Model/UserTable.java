package Model;

import java.sql.Timestamp;

public class UserTable {

	private String id;
	private String totalPoints;
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
	private String registerDate;
	private String lastConnectionDate;
	private String sql;
	private String table;
	
	
	public UserTable() {
	
		this.table = "user"; 
		this.id = "id";
		this.totalPoints = "totalPoints";
		this.name = "name";
		this.battleName = "battleName";
		this.battleTag = "battleTag";
		this.logo = "logo";
		this.finalStatisticsId = "finalStatisticsId";
		this.gradeId = "gradeId";
		this.email = "email";
		this.password = "password";
		this.twitter = "twitter";
		this.twitch = "twitch";
		this.rightsId = "rightsId";
		this.description = "description";
		this.registerDate = "registerDate";
		this.lastConnectionDate = "lastConnectionDate";
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(String totalPoints) {
		this.totalPoints = totalPoints;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBattleName() {
		return battleName;
	}
	public void setBattleName(String battleName) {
		this.battleName = battleName;
	}
	public String getBattleTag() {
		return battleTag;
	}
	public void setBattleTag(String battleTag) {
		this.battleTag = battleTag;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getFinalStatisticsId() {
		return finalStatisticsId;
	}
	public void setFinalStatisticsId(String finalStatisticsId) {
		this.finalStatisticsId = finalStatisticsId;
	}
	public String getGradeId() {
		return gradeId;
	}
	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getTwitch() {
		return twitch;
	}
	public void setTwitch(String twitch) {
		this.twitch = twitch;
	}
	public String getRightsId() {
		return rightsId;
	}
	public void setRightsId(String rightsId) {
		this.rightsId = rightsId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	public String getLastConnectionDate() {
		return lastConnectionDate;
	}
	public void setLastConnectionDate(String lastConnectionDate) {
		this.lastConnectionDate = lastConnectionDate;
	}
	
	public String generateSQLString(){
		
//		sql = "CREATE TABLE "+this.table+" ("
//				+ "USER_ID NUMBER(5) NOT NULL, "
//				+ "USERNAME VARCHAR(20) NOT NULL, "
//				+ "CREATED_BY VARCHAR(20) NOT NULL, "
//				+ "CREATED_DATE DATE NOT NULL, " + "PRIMARY KEY (USER_ID) "
//				+ ")";
//		
		sql = "CREATE TABLE Persons (  PersonID int)";
		return sql;
	}
}
