package model;

import java.text.SimpleDateFormat;

/**
 *
 * @author rahulkodate
 */
public class Encounter {

    Patient patient;
    VitalSigns vitalSigns;
    private String encounterDate;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public String getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(String encounterDate) {
        this.encounterDate = encounterDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
        return sdft.format(encounterDate);
    }
}
