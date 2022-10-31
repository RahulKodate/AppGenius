package model;

/**
 *
 * @author rahulkodate
 */
public class ModelSystem {

    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;

    public ModelSystem() {
        patientDirectory = new PatientDirectory();
        personDirectory = new PersonDirectory();
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

}
