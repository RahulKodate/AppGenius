package model;

import java.util.ArrayList;

/**
 *
 * @author rahulkodate
 */
public class DoctorDirectory {

    private ArrayList<Doctor> doctorDirectory;

    public DoctorDirectory() {
        this.doctorDirectory = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    // create & add
    public Doctor AddDoctor() {
        Doctor p = new Doctor();
        doctorDirectory.add(p);
        return p;
    }
    // delete

    public void deleteDoctor(Doctor p) {
        doctorDirectory.remove(p);
    }
    // search - doctor

    public ArrayList<Doctor> searchDoctor(String s) {
        ArrayList<Doctor> searchDoctorDirectory = new ArrayList<>();
        for (Doctor p : doctorDirectory) {
            if (p.getFirstName().toLowerCase().startsWith(s.toLowerCase()) || p.getLastName().toLowerCase().startsWith(s.toLowerCase())) {
                searchDoctorDirectory.add(p);
            }
        }
        return searchDoctorDirectory;
    }

    // search - doctor by hospital
    public ArrayList<Doctor> getHospitalDoctorDirectory(String s) {
        ArrayList<Doctor> searchDoctorDirectory = new ArrayList<>();
        for (Doctor p : doctorDirectory) {
            System.out.println(p.getHospital());
            if (p.getHospital().getName().toLowerCase().startsWith(s.toLowerCase())) {
                System.out.println("inside if");
                searchDoctorDirectory.add(p);
            }
        }
        return searchDoctorDirectory;
    }

    public void printDoctors(DoctorDirectory dd) {
        ArrayList<Doctor> dc = dd.getDoctorDirectory();
        for (Doctor p : dc) {
            System.out.println(p.getHospital());

        }
    }
}
