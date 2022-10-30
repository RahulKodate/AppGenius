/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Doctor.Doctor;
import java.util.Date;

/**
 *
 * @author rahulkodate
 */
public class PatientDetails {
    
    private Doctor doctor;
    private Date date;
    private String notes;

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    public PatientDetails(Doctor doctor, Date date, String notes) {
        this.doctor = doctor;
        this.date = date;
        this.notes = notes;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Date getDate() {
        return date;
    }

    public String getNotes() {
        return notes;
    }
    
    @Override()
    public String toString() {
        return this.date.toString();
    }
    
}
