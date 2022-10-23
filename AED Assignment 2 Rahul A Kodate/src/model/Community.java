/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rahulkodate
 */
public class Community {
    
    private String communityName;
    HouseDirectory houseDirectory;
    
    public Community(){
        
      houseDirectory = new HouseDirectory();
        
    }

    public HouseDirectory getHouseDirectory() {
        return houseDirectory;
    }

    public void setHouseDirectory(HouseDirectory houseDirectory) {
        this.houseDirectory = houseDirectory;
    }
    
    

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
   
    public boolean isMatch(String community)
    {
       if(getCommunityName().equalsIgnoreCase(community))
       {
       return true;
       }
       return false; 
    }
    
    
}
