package model;

/**
 *
 * @author rahulkodate
 */
public class City {

    private String cityName;
    private HospitalDirectory hospitalDirectory;

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

}
