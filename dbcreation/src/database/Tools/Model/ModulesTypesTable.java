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
public class ModulesTypesTable extends Table{
    
    private String id;
    private String name;
    private String reference;
    private String table;
    private String sql;
    
    
    public ModulesTypesTable(){
        this.id = "id";
        this.name = "name";
        this.reference = "reference";
        this.table = "modulesTypes";
    }
    
     @Override
    public String generateSQLString() {
       sql = "CREATE TABLE `modulesTypes` (\n"
                    + "`"+this.id+"` VARCHAR(36) NOT NULL,\n"
                    + "`"+this.name+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.reference+"` VARCHAR(3) NOT NULL UNIQUE,\n"
                    + "PRIMARY KEY (`"+this.id+"`)\n"
                    + ") ENGINE=InnoDB;";
		return sql;
    }
}
