package model;

import java.util.ArrayList;

/**
 *
 * @author rahulkodate
 */
public class PersonDirectory {

    private ArrayList<Person> personDirectory;

    public PersonDirectory() {
        this.personDirectory = new ArrayList<>();
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }

    // create & add
    public Person AddPerson() {
        Person p = new Person();
        personDirectory.add(p);
        return p;
    }
    // delete

    public void deletePerson(Person p) {
        personDirectory.remove(p);
    }
    // search - person

    public ArrayList<Person> searchPerson(String s) {
        ArrayList<Person> searchPersonDirectory = new ArrayList<>();
        for (Person p : personDirectory) {
            if (p.getFirstName().toLowerCase().equals(s.toLowerCase()) || p.getLastName().toLowerCase().equals(s.toLowerCase())) {
                searchPersonDirectory.add(p);
            }
        }
        return searchPersonDirectory;
    }
    // search - patient

    public ArrayList<Person> searchPatient(String s) {
        ArrayList<Person> searchPatientDirectory = new ArrayList<>();
        for (Person p : personDirectory) {
            if (p.getCommunity().getCommunityName().toLowerCase().equals(s.toLowerCase()) && p.getPatient() != null) {
                searchPatientDirectory.add(p);
            }
        }
        return searchPatientDirectory;
    }

    // search - personbydoctor
    public ArrayList<Person> searchPersonDoctor(String s) {
        ArrayList<Person> searchPatientDirectory = new ArrayList<>();
        for (Person p : personDirectory) {
            if (p.getPatient().getDoctor().getFirstName().equals(s.toLowerCase()) & p.getPatient() != null) {
                searchPatientDirectory.add(p);
            }
        }
        return searchPatientDirectory;
    }
}
