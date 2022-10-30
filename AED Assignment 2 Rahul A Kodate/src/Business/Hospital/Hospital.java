/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Community.Community;
//import Business.Department.Department;
import Business.Doctor.Doctor;
import Business.Ecosystem;
import Business.Rooms.Rooms;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author shrutikasalian
 */
public class Hospital {
   
    // Member variables
    private String username;
    private String password;
    private String hospitalId;
    private String name;
    private String phoneNo;
    private String address;
    private String adminName;
    private String licenseNo;
    private Community community;
    

    private ArrayList<Doctor> doctorDirectory;
   
    

     
    // Constructor
    public Hospital() {
        this.doctorDirectory=new ArrayList();
       
    }

    // Getters and Setters
//    public ArrayList<Department> getDepartmentDirectory() {
//        return departmentDirectory;
//    }

//    public Community getCommunity() {
//        return community;
//    }
//
//    public void setCommunity(Community community) {
//        this.community = community;
//    }
//
//    
//    
//    public ArrayList<Community> getCommunityDirectory() {
//        return communityDirectory;
//    }
//
//    public void setCommunityDirectory(ArrayList<Community> communityDirectory) {
//        this.communityDirectory = communityDirectory;
//    }
//   
//    
//    public ArrayList<Rooms> getRoomDirectory() {
//        return RoomDirectory;
//    }
//    public void setRoomDirectory(ArrayList<Rooms> roomDirectory) {
//        this.RoomDirectory = roomDirectory;
//    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    
    
    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    // Overriding methods
    @Override()
    public String toString() {
        return this.name;
    }
    
    
    public Doctor addDoctor(Doctor d){
        d.setDoctorId(
                d.getHospital().getCommunity().getCommunityId()
                        + "-"
                        + d.getHospital().getHospitalId()
                        + "-"
                        +"Doc"+(doctorDirectory.size()+1));
                
        doctorDirectory.add(d);
        return d;
    }

    public void deleteDoctor(String doctorId, Ecosystem system){
        // Remove the doctor from doctorList
        for(Doctor d: doctorDirectory) {
            if(d.getDoctorId().equals(doctorId)){
                doctorDirectory.remove(d);
            }
        }
    
    for(UserAccount account: system.getUserAccountDirectory().getUserAccountList()) {
            if(account.getId().equals(doctorId)) {
                system.getUserAccountDirectory().getUserAccountList().remove(account);
            }
        }
    }
     
    public void removeAllDoctors(Ecosystem system){
        // Remove all the doctors from doctorList
        for(Doctor d: doctorDirectory) {
            deleteDoctor(d.getDoctorId(), system);
        }
        this.doctorDirectory = new ArrayList();
        
    }
}
