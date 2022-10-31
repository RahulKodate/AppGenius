package model;

import java.util.ArrayList;

/**
 *
 * @author rahulkodate
 */
public class CityDirectory {

    private ArrayList<City> cityDirectory;

    public CityDirectory() {
        this.cityDirectory = new ArrayList<>();
    }

    public ArrayList<City> getCityDirectory() {
        return cityDirectory;
    }

    public void setCityDirectory(ArrayList<City> cityDirectory) {
        this.cityDirectory = cityDirectory;
    }

    // create & add
    public City AddCity() {
        City p = new City();
        cityDirectory.add(p);
        return p;
    }
    // delete

    public void deleteCity(City p) {
        cityDirectory.remove(p);
    }
    // search - city

    public ArrayList<City> searchCity(String s) {
        ArrayList<City> searchCityDirectory = new ArrayList<>();
        for (City p : cityDirectory) {
            if (p.getCityName().toLowerCase().startsWith(s.toLowerCase())) {
                searchCityDirectory.add(p);
            }
        }
        return searchCityDirectory;
    }

    // search - city by hospital
    public ArrayList<City> getCityCityDirectory(String s) {
        ArrayList<City> searchCityDirectory = new ArrayList<>();
        for (City p : cityDirectory) {
            System.out.println(p.getCityName());
            if (p.getCityName().toLowerCase().startsWith(s.toLowerCase())) {
                System.out.println("inside if");
                searchCityDirectory.add(p);
            }
        }
        return searchCityDirectory;
    }

    public void printCity(CityDirectory dd) {
        ArrayList<City> dc = dd.getCityDirectory();
        for (City p : dc) {
            System.out.println(p.getCityName());

        }
    }
}
