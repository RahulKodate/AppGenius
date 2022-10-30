/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import UserInterface.HospitalAdmin.HospitalSideNavWorkAreaJpanel;
import javax.swing.JPanel;

/**
 *
 * @author shrutikasalian
 */
public class HospitalRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account, Ecosystem business) {
        return new HospitalSideNavWorkAreaJpanel(userProcessContainer,account, business);

    }
    
}
