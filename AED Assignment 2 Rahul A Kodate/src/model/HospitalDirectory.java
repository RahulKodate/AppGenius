package model;

import java.util.ArrayList;

/**
 *
 * @author rahulkodate
 */
public class HospitalDirectory {

    private ArrayList<Hospital> hospitalDirectory;

    public HospitalDirectory() {
        this.hospitalDirectory = new ArrayList<>();
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    // create & add
    public Hospital AddHospital() {
        Hospital h = new Hospital();
        hospitalDirectory.add(h);
        return h;
    }
    // delete

    public void deleteHospital(Hospital h) {
        hospitalDirectory.remove(h);
    }
    // search - hospital

    public ArrayList<Hospital> searchHospital(String s) {
        ArrayList<Hospital> searchHospitalDirectory = new ArrayList<>();
        for (Hospital p : hospitalDirectory) {
            if (p.getName().toLowerCase().startsWith(s.toLowerCase())) {
                searchHospitalDirectory.add(p);
            }
        }
        return searchHospitalDirectory;
    }

    // search - hospital
    public ArrayList<Hospital> getCommunityHospitalDirectory(String s) {
        ArrayList<Hospital> searchHospitalDirectory = new ArrayList<>();
        for (Hospital p : hospitalDirectory) {
            if (p.getCommunity().getCommunityName().toLowerCase().equals(s.toLowerCase())) {
                searchHospitalDirectory.add(p);
            }
        }
        return searchHospitalDirectory;
    }

}
