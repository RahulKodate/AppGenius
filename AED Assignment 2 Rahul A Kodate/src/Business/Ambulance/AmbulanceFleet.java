/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ambulance;

import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author shrutikasalian
 */
public class AmbulanceFleet {
    
    private ArrayList<Ambulance> ambulanceFleet;

    public AmbulanceFleet() {
        ambulanceFleet = new ArrayList<Ambulance>();
    }

    public ArrayList<Ambulance> getAmbulanceFleet() {
        return ambulanceFleet;
    }

    public void setAmbulanceFleet(ArrayList<Ambulance> ambulanceFleet) {
        this.ambulanceFleet = ambulanceFleet;
    }
      
    public Ambulance getDepartment(String id){
        for(Ambulance ambulance: ambulanceFleet){
            if(ambulance.getAmbulanceId().equalsIgnoreCase(id)){
                return ambulance;
            }
        }
        return null;
    }
    
    public Ambulance add(Ambulance ambulance){
        ambulance.setAmbulanceId("Amb"+(ambulanceFleet.size()+1));
        ambulanceFleet.add(ambulance);
        return ambulance;
    }
   
    public void deleteAmbulance(String ambulanceId, Ecosystem system){
        
        // Remove the patient from patientList
        for(Ambulance p: ambulanceFleet) {
            if(p.getAmbulanceId().equals(ambulanceId)){
                ambulanceFleet.remove(p);
            }
        }
    }
    public String getAmbulanceId(String ambulanceId){
        
        
        for(Ambulance a: ambulanceFleet) {
            if(a.getAmbulanceId().equals(ambulanceId)){
                return a.getAmbulanceId();
            }
        }
        return null;
    }
    
}
       
    
    
    

