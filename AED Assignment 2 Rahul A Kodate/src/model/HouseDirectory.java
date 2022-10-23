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
public class HouseDirectory {
    
    private ArrayList<House> houses;
    
    public HouseDirectory(){
        
        this.houses = new ArrayList<House>();
    }
    
    public ArrayList<House> getHouses() {
        return houses;
    }
    
    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }
    
    public House addHouse(House newHouse)
    {
     
        houses.add(newHouse);
        return newHouse;  
    }
    
    public void removeHouse(House house)
    {
        houses.remove(house);
    }
}
