/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Lab;

import Business.Ecosystem;
import java.util.ArrayList;

/**
 *
 * @author Saad Ghojaria
 */
public class LabDirectory {
    
    private ArrayList<Lab> pathologyLabs;
    private ArrayList<Lab> neurologyLabs;
    private ArrayList<Lab> orthopedicLabs;

    public ArrayList<Lab> getPathologyLabs() {
        return pathologyLabs;
    }

    public void setPathologyLabs(ArrayList<Lab> pathologyLabs) {
        this.pathologyLabs = pathologyLabs;
    }

    public ArrayList<Lab> getNeurologyLabs() {
        return neurologyLabs;
    }

    public void setNeurologyLabs(ArrayList<Lab> neurologyLabs) {
        this.neurologyLabs = neurologyLabs;
    }

    public ArrayList<Lab> getOrthopedicLabs() {
        return orthopedicLabs;
    }

    public void setOrthopedicLabs(ArrayList<Lab> orthopedicLabs) {
        this.orthopedicLabs = orthopedicLabs;
    }
    
    
    
    public LabDirectory(){
        pathologyLabs = new ArrayList<Lab>();
        neurologyLabs = new ArrayList<Lab>();
        orthopedicLabs = new ArrayList<Lab>();
    }

    
    
    public Lab addLab(Lab l){
        
        if(l.getType().equals("Pathology Lab")) {
            l.setLabID("pathologyLab"+(pathologyLabs.size()+1));
            ArrayList<String> tests = new ArrayList();
            tests.add("LFT - Liver function tests");
            tests.add("Urine analysis");
            tests.add("TSH - Thyroid Simulation Harmobne Quantification");
            tests.add("Full blood examination");
            tests.add("Iron Tests");
            l.setTests(tests);
                
            pathologyLabs.add(l);
        }
        
        if(l.getType().equals("Neurology Lab")) {
            l.setLabID("neurologyLab"+(neurologyLabs.size()+1));
            ArrayList<String> tests = new ArrayList();
            tests.add("MRI Scan");
            tests.add("CT Scan");
            tests.add("NCV - Nerve Conductivity Velocity");
            l.setTests(tests);
            
            neurologyLabs.add(l);
        }
                
        if(l.getType().equals("Orthopedic Lab")) {
            l.setLabID("orthopedicLab"+(orthopedicLabs.size()+1));
            ArrayList<String> tests = new ArrayList();
            tests.add("Ultrasound");
            tests.add("X ray");
            tests.add("Dual Energy X ray");
            tests.add("Bone Scan");
            l.setTests(tests);
            
            orthopedicLabs.add(l);
        }
        
        return l;
    }
    
     public Lab getLab(String id, String type){
         if(type.equals("pathology")) {
            for(Lab lab: pathologyLabs){
            
                if(lab.getLabID().equalsIgnoreCase(id)){
                    return lab;
                }
            }
            return null;
         }
         
         if(type.equals("neurology")) {
            for(Lab lab: neurologyLabs){
            
                if(lab.getLabID().equalsIgnoreCase(id)){
                    return lab;
                }
            }
            return null;
         }
         
         if(type.equals("orthopedic")) {
            for(Lab lab: orthopedicLabs ){
            
                if(lab.getLabID().equalsIgnoreCase(id)){
                    return lab;
                }
            }
           return null;
         }
         
         return null;
    }
     
    public void deleteLab(String labId, String type, Ecosystem system){
        
        if(type.equals("pathology")) {
            for(Lab lab: pathologyLabs){
            
                if(lab.getLabID().equals(labId)){
                    pathologyLabs.remove(lab);
                }
            }
         }
         
         if(type.equals("neurology")) {
            for(Lab lab: neurologyLabs){
            
                if(lab.getLabID().equals(labId)){
                    neurologyLabs.remove(lab);
                }
            }
         }
         
         if(type.equals("orthopedic")) {
            for(Lab lab: orthopedicLabs){
            
                if(lab.getLabID().equals(labId)){
                    orthopedicLabs.remove(lab);
                }
            }
         }
    
    }
}
