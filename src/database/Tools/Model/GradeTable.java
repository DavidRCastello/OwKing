/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.Tools.Model;

/**
 *
 * @author Jordi
 */
public class GradeTable extends Table{
    
    private String id;
    private String name;
    private String logo;
    private String minRange;
    private String maxRange;
    private String sql;
    private String table;
    
    public GradeTable(){
        this.id = "id";
        this.name = "name";
        this.logo = "logo";
        this.minRange = "minRange";
        this.maxRange = "maxRange";
        this.table = "grade";
    }
    
    @Override    
    public String generateSQLString() {
        
        sql = "CREATE TABLE `grade` (\n"
                    + "`"+this.id+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.name+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.logo+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.minRange+"` INTEGER(20) NOT NULL,\n"
                    + "`"+this.maxRange+"` INTEGER(20) NOT NULL,\n"
                    + "PRIMARY KEY (`"+this.id+"`)\n"
                    + ") ENGINE=InnoDB;";
		return sql;
    }
    
    
    
}
