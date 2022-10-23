/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author rahulkodate
 */
public class CityDirectory {
    
    private ArrayList<City> cities;
    
    public CityDirectory(){
        
        this.cities = new ArrayList<City>();
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }
    
    public City addCity(City newCity)
    {
     
        cities.add(newCity);
        return newCity;
        
    
    }
    
    public void removeCity(City city)
    {
        cities.remove(city);
    }
    
    
}
