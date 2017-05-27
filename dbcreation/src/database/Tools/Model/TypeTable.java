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
public class TypeTable extends Table{
    
    private String id;
    private String name;
    private String table;
    private String sql;
    
    
    public TypeTable(){
        this.id = "id";
        this.name = "name";
        this.table = "type";
    }
    
     @Override
    public String generateSQLString() {
       sql = "CREATE TABLE `type` (\n"
                    + "`"+this.id+"` VARCHAR(36) NOT NULL,\n"
                    + "`"+this.name+"` VARCHAR(20) NOT NULL,\n"
                    + "PRIMARY KEY (`"+this.id+"`)\n"
                    + ") ENGINE=InnoDB;";
		return sql;
    }
    
}
