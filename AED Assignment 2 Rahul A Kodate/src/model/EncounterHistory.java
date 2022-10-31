package model;

import java.util.ArrayList;

/**
 *
 * @author rahulkodate
 */
public class EncounterHistory {

    private ArrayList<Encounter> encounterHistory;

    public EncounterHistory() {
        encounterHistory = new ArrayList<>();
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public void addEncounter(Encounter encounter) {
        this.encounterHistory.add(encounter);
    }

    public void deleteEncounter(Encounter encounter) {
        this.encounterHistory.remove(encounter);
    }
}
