/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Slot;
//sysimport static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
//import com.toedter.calendar.JDateChooser;
import java.time.LocalDateTime;
import java.util.Date;
/**
 *
 * @author srushtidesai
 */
public class Slot {
    
    private String slotId;
    private LocalDateTime in_time;
    private int duration;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    private String hospitalId;
    private String department;
    
    public Slot (String slotId,String hospitalId,String department, LocalDateTime in_time,int duration ){
        
        this.slotId= slotId;
        this.in_time= in_time;
        this.duration = duration;
        this.hospitalId= hospitalId;
    }

    public Slot() {

    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public LocalDateTime getIn_time() {
        return in_time;
    }

    public void setIn_time(LocalDateTime in_time) {
        this.in_time = in_time;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
//
//    public void setDate(JDateChooser datechooser) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
    
}
