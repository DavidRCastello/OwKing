package database.Tools.Model;

import java.sql.Timestamp;

public class UserTable extends Table{

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
        private String isActive;
	private String sql;
	private String table;
	
	
	public UserTable() {
                this.isActive = "isActive";
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
	
	public String generateSQLString(){
		
//		sql = "CREATE TABLE "+this.table+" ("
//				+ "USER_ID NUMBER(5) NOT NULL, "
//				+ "USERNAME VARCHAR(20) NOT NULL, "
//				+ "CREATED_BY VARCHAR(20) NOT NULL, "
//				+ "CREATED_DATE DATE NOT NULL, " + "PRIMARY KEY (USER_ID) "
//				+ ")";
//		
		sql = "CREATE TABLE `user` (\n"
                    + "`"+this.id+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.totalPoints+"` INTEGER(20) NOT NULL,\n"
                    + "`"+this.name+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.battleName+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.battleTag+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.logo+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.finalStatisticsId+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.gradeId+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.email+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.password+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.twitter+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.twitch+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.rightsId+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.description+"` VARCHAR(140) NOT NULL,\n"
                    + "`"+this.registerDate+"` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                    + "`"+this.lastConnectionDate+"` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                    + "`"+this.isActive+"` BOOLEAN NOT NULL DEFAULT '1',\n"
                    + "PRIMARY KEY (`"+this.id+"`)\n"
                    //+ "FOREIGN KEY (`"+this.gradeId+"`) REFERENCES grade(`id`)\n"
                    + ") ENGINE=InnoDB;";
		return sql;
	}
}
