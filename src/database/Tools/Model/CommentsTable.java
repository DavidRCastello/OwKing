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
    private String commentType; 
    private String text; 
    private String userID; 
    private String timestamp; 
    private String likes; 
    private String dislikes; 
    private String parentId;
    private String table; 
    private String sql; 
    
    public CommentsTable(){
        this.id = "id";
        this.position = "position";
        this.commentType = "commentType";
        this.text = "text";
        this.userID = "userID";
        this.timestamp = "timestamp";
        this.likes = "likes";
        this.dislikes = "dislikes";
        this.parentId = "parentId";
        this.table = "comments";
    }
    

    @Override
    public String generateSQLString() {
        sql = "CREATE TABLE `comments` (\n"
                    + "`"+this.id+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.position+"` INTEGER(20) NOT NULL,\n"
                    + "`"+this.commentType+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.text+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.userID+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.timestamp+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.likes+"` INTEGER(20) NOT NULL,\n"
                    + "`"+this.dislikes+"` INTEGER(20) NOT NULL,\n"
                    + "`"+this.parentId+"` VARCHAR(20) NOT NULL,\n"
                    + "PRIMARY KEY (`"+this.id+"`),\n"
                    +"FOREIGN KEY (`userID`) REFERENCES user(`id`),\n"
                    +"FOREIGN KEY (`parentId`) REFERENCES comments(`id`)\n"
                    + ") ENGINE=InnoDB;";
                   
		return sql;
    }
    
}
