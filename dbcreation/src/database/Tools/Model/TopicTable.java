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
public class TopicTable extends Table{

   private String id;
    private String name;
    private String table;
    private String sql;
    
    
    public TopicTable(){
        this.id = "id";
        this.name = "name";
        this.table = "topic";
    }
    
     @Override
    public String generateSQLString() {
       sql = "CREATE TABLE `topic` (\n"
                    + "`"+this.id+"` VARCHAR(36) NOT NULL,\n"
                    + "`"+this.name+"` VARCHAR(20) NOT NULL,\n"
                    + "PRIMARY KEY (`"+this.id+"`)\n"
                    + ") ENGINE=InnoDB;";
		return sql;
    }
    
}
