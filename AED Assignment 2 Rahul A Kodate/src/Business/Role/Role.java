/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author srushtidesai
 */
public abstract class Role {
 
    public enum RoleType{
        HospitalAdmin("HospitalAdmin"),
        Patient("Patient"),
        Doctor("Doctor"),
        SystemAdmin("SystemAdmin"),
        CommunityAdmin("CommunityAdmin");
        
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,  Ecosystem business );
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
    
}
