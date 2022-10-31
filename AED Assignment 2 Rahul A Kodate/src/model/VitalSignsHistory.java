package model;

import java.util.ArrayList;

/**
 *
 * @author rahulkodate
 */
public class VitalSignsHistory {

    private ArrayList<VitalSigns> vitalSignsHistory;

    public VitalSignsHistory() {
        vitalSignsHistory = new ArrayList<>();
    }

    public ArrayList<VitalSigns> getVitalsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalsHistory(ArrayList<VitalSigns> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }

    public VitalSigns addVitalSigns() {
        VitalSigns vs = new VitalSigns();
        vitalSignsHistory.add(vs);
        return vs;
    }

    public void deleteVitalSigns(VitalSigns vs) {
        vitalSignsHistory.remove(vs);
    }
}
