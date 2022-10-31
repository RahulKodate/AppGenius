package model;

import java.util.ArrayList;

/**
 *
 * @author rahulkodate
 */
public class HouseDirectory {

    private ArrayList<House> houseDirectory;

    public HouseDirectory() {
        this.houseDirectory = new ArrayList<>();
    }

    public ArrayList<House> getHouseDirectory() {
        return houseDirectory;
    }

    public void setHouseDirectory(ArrayList<House> houseDirectory) {
        this.houseDirectory = houseDirectory;
    }

    // create & add
    public House AddHouse() {
        House p = new House();
        houseDirectory.add(p);
        return p;
    }
    // delete

    public void deleteHouse(House p) {
        houseDirectory.remove(p);
    }
    // search - house

    public ArrayList<House> searchHouse(String s) {
        ArrayList<House> searchHouseDirectory = new ArrayList<>();
        for (House p : houseDirectory) {
            if (p.getName().toLowerCase().startsWith(s.toLowerCase())) {
                searchHouseDirectory.add(p);
            }
        }
        return searchHouseDirectory;
    }

    // search - house by hospital
    public ArrayList<House> getHouseHouseDirectory(String s) {
        ArrayList<House> searchHouseDirectory = new ArrayList<>();
        for (House p : houseDirectory) {
            System.out.println(p.getName());
            if (p.getName().toLowerCase().startsWith(s.toLowerCase())) {
                System.out.println("inside if");
                searchHouseDirectory.add(p);
            }
        }
        return searchHouseDirectory;
    }

    public void printHouse(HouseDirectory dd) {
        ArrayList<House> dc = dd.getHouseDirectory();
        for (House p : dc) {
            System.out.println(p.getName());

        }
    }
}
