/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.Tools.Model;

/**
 *
 * @author Machete
 */
public class PublicationTable extends Table{
    
    private String id;
    private String userId;
    private String text;
    private String likes;
    private String dislikes;
    private String timestamp;
    private String typeXCategoryXTopicId;
    private String title;
    private String views;
    private String photo;
    private String description;
    private String contentId;
    private String table;
    private String isActive;
    private String streamerName;
    private String sql;
    
    
    public PublicationTable(){
        this.id = "id";
        this.isActive = "isActive";
        this.userId = "userId";
        this.text = "text";
        this.likes = "likes";
        this.dislikes = "dislikes";
        this.timestamp = "timestamp";
        this.typeXCategoryXTopicId = "typeXCategoryXTopicId";
        this.title = "title";
        this.views = "views";
        this.photo = "photo";
        this.streamerName = "streamerName";
        this.description = "description";
        this.contentId = "contentId";
        this.table = "publication";
    }
    
     @Override
    public String generateSQLString() {
       sql = "CREATE TABLE `publication` (\n"
                    + "`"+this.id+"` VARCHAR(36) NOT NULL,\n"
                    + "`"+this.isActive+"` BOOLEAN NOT NULL DEFAULT '1',\n"
                    + "`"+this.userId+"` VARCHAR(36) NOT NULL,\n"
                    + "`"+this.text+"` VARCHAR(1500) NOT NULL,\n"
                    + "`"+this.likes+"` INTEGER(20) NOT NULL,\n"
                    + "`"+this.dislikes+"` INTEGER(20) NOT NULL,\n"
                    + "`"+this.timestamp+"` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                    + "`"+this.typeXCategoryXTopicId+"` VARCHAR(36) NOT NULL,\n"
                    + "`"+this.title+"` VARCHAR(100) NOT NULL,\n"
                    + "`"+this.views+"` INTEGER(20) NOT NULL,\n"
                    + "`"+this.photo+"` VARCHAR(50) NOT NULL,\n"
                    + "`"+this.description+"` VARCHAR(140) NOT NULL,\n"
                    + "`"+this.contentId+"` VARCHAR(36) NOT NULL,\n"
                    + "`"+this.streamerName+"` VARCHAR(20) NOT NULL,\n"
                    + "PRIMARY KEY (`"+this.id+"`),\n"
                    + "FOREIGN KEY (`"+this.userId+"`) REFERENCES user(`id`),\n"
                    + "FOREIGN KEY (`"+this.typeXCategoryXTopicId+"`) REFERENCES typeXCategoryXTopic(`id`),\n"
                    + "FOREIGN KEY (`"+this.contentId+"`) REFERENCES content(`id`)\n"
                    + ") ENGINE=InnoDB;";
		return sql;
    }
}
