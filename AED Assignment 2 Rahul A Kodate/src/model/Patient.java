package model;

/**
 *
 * @author rahulkodate
 */
public class Patient extends Person {

    private long patientID;
    private Hospital hospital;
    private Doctor doctor;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
//    private String doctor;
    private long insuranceID;
    private String pharmacy;
    private EncounterHistory encounterHistory;

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    private VitalSignsHistory vitalSignsHistory;

    public Patient() {
        this.vitalSignsHistory = new VitalSignsHistory();
    }

    public long getPatientID() {
        return patientID;
    }

    public void setPatientID(long patientID) {
        this.patientID = patientID;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public long getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(long insuranceID) {
        this.insuranceID = insuranceID;
    }

    public String getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(String pharmacy) {
        this.pharmacy = pharmacy;
    }

    public VitalSignsHistory getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(VitalSignsHistory vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }

}
