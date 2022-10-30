/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author shrutikasalian
 */
public class Patient {
    
   private String username;
   private String password;
   private String patientID;
   private String name;
   private String phoneNo;
   private String address;
   private String emailId;
   private String age;
   private String gender;
   private String bloodGroup;
   private ArrayList<PatientDetails> patientDetails = new ArrayList();
 
    public Patient() {
       this.patientDetails = new ArrayList();
    }
    
    public void setPatientDetails(ArrayList<PatientDetails> patientDetails) {
        this.patientDetails = patientDetails;
    }
    
    public ArrayList<PatientDetails> getPatientDetails() {
        return patientDetails;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
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
    
    
    @Override()
    public String toString() {
        return this.name;
    }
    
}
