/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.Ecosystem;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
/**
 *
 * @author srushtidesai
 */
public class ConfigureASystem {
    
    public static Ecosystem configure(){
        
        Ecosystem system = Ecosystem.getInstance();
        UserAccount ua = system.getUserAccountDirectory()
                .createUserAccount("sysadmin", "sysadmin", "RRH", new SystemAdminRole(), null);
        
        return system;
        
    
}
}
