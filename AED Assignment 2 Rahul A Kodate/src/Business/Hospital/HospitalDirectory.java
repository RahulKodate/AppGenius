/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Ecosystem;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author rahulkodate
 */
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospitalList;
    

    public HospitalDirectory(){
        hospitalList = new ArrayList<Hospital>();
       
    }
    
    public ArrayList<Hospital> getHospitalList() {
        return this.hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalList = hospitalDirectory;
    }
    
    public Hospital addHospital(Hospital h){
       
        h.setHospitalId("H"+(hospitalList.size()+1));
        hospitalList.add(h);
        return h;
    }

    public void deleteHospital(String hospitalId,Ecosystem system){
        
        // Remove all doctors, departments and this hospital
        for(Hospital h: hospitalList) {
            if(h.getHospitalId().equals(hospitalId)){
           //     h.removeAllDepartments(system);
                hospitalList.remove(h);
            }
        }
  
        // Remove hospital from userAccountList
        for(UserAccount account: system.getUserAccountDirectory().getUserAccountList()) {
            if(account.getId().equals(hospitalId)) {
                system.getUserAccountDirectory().getUserAccountList().remove(account);
            }
        }
    
    }
    
    public Hospital getHospitalId(int index){
        return hospitalList.get(index);
    }
    
    public boolean isUniqueLicenseNo(String licenseNo){
        for(Hospital hospital: hospitalList){
            if(hospital.getLicenseNo().equalsIgnoreCase(licenseNo)){
                return false;
            }
        }
        return true;
    }

    public String getHospitalName(String hospitalId) {
        for(Hospital hospital: hospitalList){
            if(hospital.getHospitalId().equalsIgnoreCase(hospitalId)){
                return hospital.getName();
            }
        }
        return "";
    }
    
    public Hospital getHospital(String id){
        for(Hospital hospital: hospitalList){
            if(hospital.getHospitalId().equalsIgnoreCase(id)){
                return hospital;
            }
        }
        return null;
    }
    
    public boolean isPhoneUnique(String phone){
        for(Hospital hospital: hospitalList){
            if(hospital.getPhoneNo().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }

    
    
    
}
