/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author shrutikasalian
 */
public abstract class HealthCarePortal {
    
    private String name;
    private UserAccountDirectory userAccountDirectory;
    
    public HealthCarePortal(){
    }
    
    public HealthCarePortal(String name) {
        this.name = name;
        userAccountDirectory = new UserAccountDirectory();
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
