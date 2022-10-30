/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.city;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rahulkodate
 */
public class CityDirectory {

    private List<City> cities;

    public CityDirectory() {
        cities = new ArrayList<City>();
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        cities = cities;
    }

    public City addCity(City newCity) {
        if (!cities.stream().anyMatch(o -> o.getCityName().equals(newCity.getCityName()))) {
            cities.add(newCity);
            return newCity;
        }
        return null;
    }

    public void removeSupplier(City city) {
        cities.remove(city);
    }
}
