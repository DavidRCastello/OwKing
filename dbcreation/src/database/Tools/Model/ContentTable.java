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
public class ContentTable extends Table{
    
    private String id;
    private String structure;
    private String typeId;
    private String table;
    private String sql;
    
    
    public ContentTable(){
        this.id = "id";
        this.structure = "structure";
        this.typeId = "typeId";
        this.table = "content";
    }
    
     @Override
    public String generateSQLString() {
       sql = "CREATE TABLE `content` (\n"
                    + "`"+this.id+"` VARCHAR(36) NOT NULL,\n"
                    + "`"+this.structure+"` VARCHAR(3) NOT NULL,\n"
                    + "`"+this.typeId+"` VARCHAR(36) NOT NULL,\n"
                    + "PRIMARY KEY (`"+this.id+"`),\n"
                    + "FOREIGN KEY (`"+this.structure+"`) REFERENCES modulesTypes(`reference`)\n"
                    + ") ENGINE=InnoDB;";
		return sql;
    }
    
}
