/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Slot;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Saad Ghojaria
 */
public class SlotList {
    
    private ArrayList<Slot> slotList;
   
    public SlotList(){
        slotList = new ArrayList<Slot>();
    }

    public ArrayList<Slot> getSlotList() {
        return slotList;
    }

    public void setSlotList(ArrayList<Slot> SlotList) {
        this.slotList = slotList;
    }

    public void add(String hospitalId, String department,LocalDateTime in_time,int duration ) {
        Slot slot = new Slot("S"+(slotList.size()+1),hospitalId,department,in_time,duration);
        slotList.add(slot);
    }
    
    public Slot getSlot(String slotId){
        for(Slot slot: slotList){
            if(slot.getSlotId().equalsIgnoreCase(slotId)){
                return slot;
            }
        }
        return null;
    }
    
     
    public Slot add(Slot slot){
        slot.setSlotId("S"+(slotList.size()+1));
             
        slotList.add(slot);
        return slot;
    }

    public void updateSlot(String slotId, String hospitalId, String department, LocalDateTime in_time,int duration ) {
        for(Slot slot: slotList){
            if(slot.getSlotId().equalsIgnoreCase(slotId)){
                slot.setDepartment(department);
                
            }
        }
    }
    
    public void deleteSlot(String id){
        for(int i =0; i< slotList.size();i++){
            if(slotList.get(i).getSlotId().equalsIgnoreCase(id)){
                slotList.remove(i);
            }
        }
    }
    
    public Slot getSlotByIndex(int index){
        return slotList.get(index);
    }
    
    
}
