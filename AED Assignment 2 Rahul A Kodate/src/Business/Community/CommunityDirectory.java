
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Community;

import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import static java.time.InstantSource.system;
import java.util.ArrayList;

/**
 *
 * @author moins
 */
public class CommunityDirectory {
    
    private ArrayList<Community> communityList;

    public CommunityDirectory(){
        communityList = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunityList() {
        return this.communityList;
    }

    public void setCommunityList(ArrayList<Community> communityDirectory) {
        this.communityList = communityDirectory;
    }

    public Community addCommunity(Community c){
        c.setCommunityId("C"+(communityList.size()+1));
        communityList.add(c);
        return c;
    }
    
    public void deleteCommunity (String communityId, Ecosystem system){
        for(Community c : communityList){
            if(c.getCommunityId().equals(communityId)){
                c.removeAllHospitals(system);
                communityList.remove(c);
            }
        }
    for(UserAccount account: system.getUserAccountDirectory().getUserAccountList()) {
            if(account.getId().equals(communityId)) {
                system.getUserAccountDirectory().getUserAccountList().remove(account);
            }
        }
    
    
    }
   
    public Community getCommunityId (int index){
        return communityList.get(index);
    }
   
    public String getCommunityName(String communityId){
        for(Community community : communityList){
            if(community.getCommunityId().equalsIgnoreCase(communityId)){
                return community.getName();
        }
     }
    return "";
    }     
    
    public Community getCommunity (String id){
        for(Community community: communityList){
            if(community.getCommunityId().equalsIgnoreCase(id)){
                return community;
            }
        }
    return null;
    }
   
}




