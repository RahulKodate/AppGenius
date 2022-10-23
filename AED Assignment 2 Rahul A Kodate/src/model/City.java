/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rahulkodate
 */
public class City {
    
    private String city;

    CommunityDirectory communityDirectory;
   
    public City()
    {
     communityDirectory = new CommunityDirectory();
    
    }

    public CommunityDirectory getCommunityDirectory() {
        return communityDirectory;
    }

    public void setCommunityDirectory(CommunityDirectory communityDirectory) {
        this.communityDirectory = communityDirectory;
    }
    
    
    
    
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
    public boolean isMatch(String city)
    {
       if(getCity().equalsIgnoreCase(city))
       {
       return true;
       }
       return false; 
    }
    
    
        
    
    
}
