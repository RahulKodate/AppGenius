/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import UserInterface.CommunityAdmin.CommunityAdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author moins
 */
public class CommunityAdminRole extends Role {
     @Override
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem business) {
        return new CommunityAdminJPanel(userProcessContainer,account, business);
    }
}

