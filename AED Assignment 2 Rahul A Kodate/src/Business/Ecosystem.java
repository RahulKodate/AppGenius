/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Community.Community;
import Business.Community.CommunityDirectory;
import Business.Doctor.DoctorDirectory;
import Business.Hospital.HospitalDirectory;

import Business.Patient.PatientDirectory;
import Business.Pharmacy.PharmacyDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;

import java.util.ArrayList;


/**
 *
 * @author rahulkodate
 */
public class Ecosystem extends HealthCarePortal {
    
    private static Ecosystem business;
    private CommunityDirectory communityDirectory = new CommunityDirectory();
    private HospitalDirectory hospitalDirectory = new HospitalDirectory();
    private PatientDirectory patientDirectory = new PatientDirectory();
    private DoctorDirectory doctorDirectory = new DoctorDirectory();
    //private Community community = new Community();
    
    
    
    

    

    // Making ecosystem singleton
    public static Ecosystem getInstance() {
        if(business == null){
            business = new Ecosystem();
        }
        return business;
    }

    public static Ecosystem getBusiness() {
        return business;
    }

    public static void setBusiness(Ecosystem business) {
        Ecosystem.business = business;
    }

//    public Community getCommunity() {
//        return community;
//    }
    
   
    
//    public Department getDepartment(String id){
//        for(Department department: departmentDirectory){
//            if(department.getDepartmentId().equalsIgnoreCase(id)){
//                return department;
//            }
//        }
//        return null;
//    }

//    public void setCommunity(Community community) {
//        this.community = community;
//    }
//     
    public CommunityDirectory getCommunityDirectory() {
        return communityDirectory;
    }

    public void setCommunityDirectory(CommunityDirectory communityDirectory) {
        this.communityDirectory = communityDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }
   
    
     
     
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    private Ecosystem(){
        super(null);
    }

    public boolean checkIfUserIsUnique(String userName){
       return false;
    }

//     public Community getCommunity(String id){
//        for(Community comm: communityDirectory){
//            if(community.getCommunityId().equalsIgnoreCase(id)){
//                return comm;
//            }
//        }
//        return null;
//    }

}
