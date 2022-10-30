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
    private String pulse;
    private String temperature;
    private String bloodPressure;

     public PatientDetails(Doctor doctor, Date date, String notes, String pulse, String temperature, String bloodPressure) {
        this.doctor = doctor;
        this.date = date;
        this.notes = notes;
        this.pulse=pulse;
        this.temperature=temperature;
        this.bloodPressure=bloodPressure;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
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
