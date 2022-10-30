/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.city;

import Business.Community.CommunityDirectory;

/**
 *
 * @author kapil
 */
public class City {

    private String cityName;
    private CommunityDirectory cityData;

    public City() {
        cityData = new CommunityDirectory();
    }

    public CommunityDirectory getCityData() {
        return cityData;
    }

    public static void setCityData(CommunityDirectory cityData) {
        cityData = cityData;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return cityName; //To change body of generated methods, choose Tools | Templates.
    }

}
