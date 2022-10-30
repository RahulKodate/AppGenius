/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Community;

import Business.Doctor.Doctor;
import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author rahulkodate
 */
public class Community {
 
    private String name;
    private String communityId;
    private String city;
    private String house;

    private ArrayList<Hospital> hospitalDirectory;

  
    
    public Community(){

        this.hospitalDirectory = new ArrayList();
   }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
    
      public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    @Override
    public String toString() {
        return this.name;
    }

    
    
    public Hospital getHospital(String id){
        for(Hospital hospital: hospitalDirectory){
            if(hospital.getHospitalId().equalsIgnoreCase(id)){
                return hospital;
            }
        }
        return null;
    }
    
    
    
    
     public Hospital addHospital(Hospital h){
        h.setHospitalId(
                h.getCommunity().getCommunityId()
                        + "-"
                       
                        +"Hos"+(hospitalDirectory.size()+1));
                
        hospitalDirectory.add(h);
        return h;
    }
    
    //Delete Doctor
    public void deleteHospital(String hospitalId, Ecosystem system){
        // Remove the doctor from doctorList
        for(Hospital h: hospitalDirectory) { 
            if(h.getHospitalId().equals(hospitalId)){
                hospitalDirectory.remove(h);
            }
        }
        // Remove doctor from userAccountList
        for(UserAccount account: system.getUserAccountDirectory().getUserAccountList()) {
            if(account.getId().equals(hospitalId)) {
                system.getUserAccountDirectory().getUserAccountList().remove(account);
            }
        }
    }
    
    public void removeAllHospitals(Ecosystem system){
        // Remove all the doctors from doctorList
        for(Hospital h: hospitalDirectory) {
            deleteHospital(h.getHospitalId(), system);
        }
        this.hospitalDirectory = new ArrayList();
        
    }
    
    
    
}
