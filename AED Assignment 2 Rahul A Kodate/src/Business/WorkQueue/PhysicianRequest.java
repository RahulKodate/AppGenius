/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author Saad Ghojaria
 */
public class PhysicianRequest extends WorkRequest {
    
    private String timeDate;
    private Date appointmentDate;

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getTime() {
        return timeDate;
    }

    public void setTime(String time) {
        this.timeDate = time;
    }
    
}
