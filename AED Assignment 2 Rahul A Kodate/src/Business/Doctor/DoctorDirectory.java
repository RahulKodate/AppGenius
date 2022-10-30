/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import java.util.ArrayList;

/**
 *
 * @author Saad Ghojaria
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorList;

    public DoctorDirectory() {
        this.doctorList = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
    public void addDoctor(Doctor d){
        d.setDoctorId(
                d.getHospital().getCommunity().getCommunityId()
                        + d.getHospital().getHospitalId()
                      );
                
        doctorList.add(d);
    }
    
   
}
