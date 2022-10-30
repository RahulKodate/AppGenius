/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Administration;
import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
/**
 *
 * @author Saad Ghojaria
 */
public class AdminDirectory {
    private ArrayList<Admin> adminDirectory;
    public AdminDirectory()
    {
        adminDirectory=new ArrayList<Admin>();
    }
    public ArrayList<Admin> getAdminDirectory() {
        return adminDirectory;
    }
    public void setAdminDirectory(ArrayList<Admin>adminDirectory)
    {
                this.adminDirectory = adminDirectory;

    }
    public Admin add(Admin admin) {
        admin.setAdminId("Admin" + (adminDirectory.size() + 1));
        adminDirectory.add(admin);
        return admin;
    }
        public void deleteAdmin(String adminId, Ecosystem system){
            for (Admin a : adminDirectory) {
                if (a.getAdminId().equals(adminId)) {
                    adminDirectory.remove(a);
                }
            }
        }

}
