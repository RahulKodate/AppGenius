/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

import Business.Ecosystem;
import Business.Patient.Patient;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Saad Ghojaria
 */
public class PharmacyDirectory {
    
    private ArrayList<Pharmacy> pharmacyList;
    
    public PharmacyDirectory(){
        pharmacyList = new ArrayList<Pharmacy>();
    }
    
    public ArrayList<Pharmacy> getPharmacyList() {
        return pharmacyList;
    }

    public void setPharmacyList(ArrayList<Pharmacy> pharmacyDirectory) {
        this.pharmacyList = pharmacyDirectory;
    }
    
    public Pharmacy addPharmacy(Pharmacy p){
        p.setPharmacyId("PH"+(pharmacyList.size()+1));
                
        pharmacyList.add(p);
        return p;
    }
    public boolean isPhoneUnique(String phone){
        for(Pharmacy pharmacy: pharmacyList){
            if(pharmacy.getPhoneNo().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
     public Pharmacy getPharmacy(String id){
        for(Pharmacy pharmacy: pharmacyList){
            if(pharmacy.getPharmacyId().equalsIgnoreCase(id)){
                return pharmacy;
            }
        }
        return null;
    }
     
    public void deletePharmacy(String pharmacyId, Ecosystem system){
        
        // Remove the pharmacy from patientList
        for(Pharmacy p: pharmacyList) {
            if(p.getPharmacyId().equals(pharmacyId)){
                pharmacyList.remove(p);
            }
        }
        
        // Remove patient from userAccountList
        for(UserAccount account: system.getUserAccountDirectory().getUserAccountList()) {
            if(account.getId().equals(pharmacyId)) {
                system.getUserAccountDirectory().getUserAccountList().remove(account);
            }
        }
        
    }
    
    
}
