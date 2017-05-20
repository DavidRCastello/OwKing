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
public class RightsTable extends Table{
    
    private String id;
    private String canClosePost;
    private String logo;
    private String name;
    private String isBanned;
    private String canEditOther;
    private String canDeleteOther;
    private String canCreate;
    private String canMakePost;
    private String canDeleteAccount;
    private String table;
    private String sql;
    
    public RightsTable(){
        this.id = "id";
        this.canClosePost = "canClosePost";
        this.logo = "logo";
        this.name = "name";
        this.isBanned = "isBanned";
        this.canEditOther = "canEditOther";
        this.canDeleteOther = "canDeleteOther";
        this.canCreate = "canCreate";
        this.canMakePost = "canMakePost";
        this.canDeleteAccount = "canDeleteAccount";
        this.table = "table";
    }

    @Override
    public String generateSQLString() {
       sql = "CREATE TABLE `rights` (\n"
                    + "`"+this.id+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.canClosePost+"` BOOLEAN NOT NULL,\n"
                    + "`"+this.name+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.logo+"` VARCHAR(20) NOT NULL,\n"
                    + "`"+this.isBanned+"` BOOLEAN NOT NULL,\n"
                    + "`"+this.canEditOther+"` BOOLEAN NOT NULL,\n"
                    + "`"+this.canDeleteOther+"` BOOLEAN NOT NULL,\n"
                    + "`"+this.canCreate+"` BOOLEAN NOT NULL,\n"
                    + "`"+this.canMakePost+"` BOOLEAN NOT NULL,\n"
                    + "`"+this.canDeleteAccount+"` BOOLEAN NOT NULL,\n"
                    + "PRIMARY KEY (`"+this.id+"`)\n"
                    + ") ENGINE=InnoDB;";
		return sql;
    }
    
}
