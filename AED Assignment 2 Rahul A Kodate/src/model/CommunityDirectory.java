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
public class CommunityDirectory {
    
    
    private ArrayList<Community> communities;
    
    public CommunityDirectory(){
        this.communities = new ArrayList<Community>(); 
    }
    
    public ArrayList<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(ArrayList<Community> communities) {
        this.communities = communities;
    }
    
    public Community addCommunity(Community newCommunity)
    {
     
        communities.add(newCommunity);
        return newCommunity;
        
    
    }
    
    public void removeCity(Community community)
    {
        communities.remove( community);
    }
    
    
    
}
