package model;

import java.util.ArrayList;

/**
 *
 * @author rahulkodate
 */
public class PatientDirectory {

    private ArrayList<Patient> patientDirectory;

    public PatientDirectory() {
        this.patientDirectory = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    // create & add
    public Patient AddPatient() {
        Patient h = new Patient();
        patientDirectory.add(h);
        return h;
    }
    // delete

    public void deletePatient(Patient h) {
        patientDirectory.remove(h);
    }

    // create
    // add
    // delete
    // search
}
