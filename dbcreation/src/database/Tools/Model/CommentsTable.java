/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.Tools.Model;

/**
 *
 * @author jordi
 */
public class CommentsTable extends Table{
    
    private String id;
    private String position;
    private String commentTypeId; 
    private String text; 
    private String userID; 
    private String timestamp; 
    private String likes; 
    private String dislikes; 
    private String parentId;
    private String table; 
    private String isActive;
    private String sql; 
    
    public CommentsTable(){
        this.id = "id";
        this.isActive = "isActive";
        this.position = "position";
        this.commentTypeId = "commentTypeId";
        this.text = "text";
        this.userID = "userId";
        this.timestamp = "timestamp";
        this.likes = "likes";
        this.dislikes = "dislikes";
        this.parentId = "parentId";
        this.table = "comments";
    }
    

    @Override
    public String generateSQLString() {
        sql = "CREATE TABLE `comments` (\n"
                    + "`"+this.id+"` VARCHAR(36) NOT NULL,\n"
                    + "`"+this.isActive+"` BOOLEAN NOT NULL DEFAULT '1',\n"
                    + "`"+this.position+"` INTEGER(20) NOT NULL,\n"
                    + "`"+this.commentTypeId+"` VARCHAR(36) NOT NULL,\n"
                    + "`"+this.text+"` VARCHAR(500) NOT NULL,\n"
                    + "`"+this.userID+"` VARCHAR(36) NOT NULL,\n"
                    + "`"+this.timestamp+"` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                    + "`"+this.likes+"` INTEGER(20) NOT NULL,\n"
                    + "`"+this.dislikes+"` INTEGER(20) NOT NULL,\n"
                    + "`"+this.parentId+"` VARCHAR(36) NOT NULL,\n"
                    + "PRIMARY KEY (`"+this.id+"`),\n"
                    +"FOREIGN KEY (`userID`) REFERENCES user(`id`),\n"
                    +"FOREIGN KEY (`parentId`) REFERENCES comments(`id`),\n"
                    +"FOREIGN KEY (`commentTypeId`) REFERENCES commentType(`id`)\n"
                    + ") ENGINE=InnoDB;";
                   
		return sql;
    }
    
}
