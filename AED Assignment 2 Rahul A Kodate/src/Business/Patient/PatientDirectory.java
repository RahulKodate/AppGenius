/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Doctor.Doctor;
import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author shrutikasalian
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;
    
    public PatientDirectory(){
        patientList = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientDirectory) {
        this.patientList = patientDirectory;
    }
    
    public Patient addPatient(Patient p){
        p.setPatientID("P"+(patientList.size()+1));
                
        patientList.add(p);
        return p; 
    }
    public boolean isPhoneUnique(String phone){
        for(Patient patient: patientList){
            if(patient.getPhoneNo().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
     public Patient getPatient(String id){
        for(Patient patient: patientList){
            if(patient.getPatientID().equalsIgnoreCase(id)){
                return patient;
            }
        }
        return null;
    }
     
    public void deletePatient(String patientId, Ecosystem system){
        // Remove the patient from patientList
        for(Patient p: patientList) {
            if(p.getPatientID().equals(patientId)){
                patientList.remove(p);
            }
        }
        
        // Remove patient from userAccountList
        for(UserAccount account: system.getUserAccountDirectory().getUserAccountList()) {
            if(account.getId().equals(patientId)) {
                system.getUserAccountDirectory().getUserAccountList().remove(account);
            }
        }
        
    }
    
}
