package model;

/**
 *
 * @author rahulkodate
 */
public class Doctor extends Person {

    private String firstName;
    private String lastName;
    private int age;
    private String department;
    private Hospital hospital;
    private VitalSigns vitals;
    private PersonDirectory personDirectory;

    public VitalSigns getVitals() {
        return vitals;
    }

    public void setVitals(VitalSigns vitals) {
        this.vitals = vitals;
    }

    public PersonDirectory getPatientDirectory() {
        return personDirectory;
    }

    public void setPatientDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }

}
