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
public class PointsValueTable extends Table{
    
    private String id;
    private String createPublicationValue;
    private String publicationTypeId;
    private String dislikeValue;
    private String likeValue;
    private String table;
    private String sql;
    
    
    public PointsValueTable(){
        this.id = "id";
        this.createPublicationValue = "createPublicationValue";
        this.publicationTypeId = "publicationTypeId";
        this.dislikeValue = "dislikeValue";
        this.likeValue = "likeValue";
        this.table = "pointsValue";
    }

    @Override
    public String generateSQLString() {
         sql = "CREATE TABLE `pointsValue` (\n"
                    + "`"+this.id+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.createPublicationValue+"` INTEGER(20) NOT NULL,\n"
                    + "`"+this.publicationTypeId+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.dislikeValue+"` INTEGER(20) NOT NULL,\n"
                    + "`"+this.likeValue+"` INTEGER(20) NOT NULL,\n"
                    + "PRIMARY KEY (`"+this.id+"`)\n"
                    + ") ENGINE=InnoDB;";
		return sql;
    }
    
}
