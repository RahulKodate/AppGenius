/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;
import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import UserInterface.Patient.PatientSideNavWorkAreaJpanel;

import javax.swing.JPanel;

/**
 *
 * @author Saad Ghojaria
 */
public class PatientRole extends Role {
    
    public JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account, Ecosystem business) {
        return new PatientSideNavWorkAreaJpanel(userProcessContainer, account, business);
    }

}
