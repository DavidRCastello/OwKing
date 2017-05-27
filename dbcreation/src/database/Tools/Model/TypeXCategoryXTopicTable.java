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
public class TypeXCategoryXTopicTable extends Table{

    private String id;
    private String topicId;
    private String categoryId;
    private String typeId;
    private String table;
    private String sql;
    
    
    public TypeXCategoryXTopicTable(){
        this.id = "id";
        this.topicId = "topicId";
        this.categoryId = "categoryId";
        this.typeId = "typeId";
        this.table = "typeXCategoryXTopic";
    }
    
     @Override
    public String generateSQLString() {
       sql = "CREATE TABLE `typeXCategoryXTopic` (\n"
                    + "`"+this.id+"` VARCHAR(36) NOT NULL,\n"
                    + "`"+this.topicId+"` VARCHAR(36) NOT NULL,\n"
                    + "`"+this.categoryId+"` VARCHAR(36) NOT NULL,\n"
                    + "`"+this.typeId+"` VARCHAR(36) NOT NULL,\n"
                    + "PRIMARY KEY (`"+this.id+"`),\n"
                    + "FOREIGN KEY (`"+this.topicId+"`) REFERENCES topic(`id`),\n"
                    + "FOREIGN KEY (`"+this.categoryId+"`) REFERENCES category(`id`),\n"
                    + "FOREIGN KEY (`"+this.typeId+"`) REFERENCES type(`id`)\n"
                    + ") ENGINE=InnoDB;";
		return sql;
    }
    
}
