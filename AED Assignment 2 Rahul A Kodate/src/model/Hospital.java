package model;

/**
 *
 * @author rahulkodate
 */
public class Hospital {

    private String name;
    private String address;
    private Community community;
    private DoctorDirectory doctorDirectory;

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
