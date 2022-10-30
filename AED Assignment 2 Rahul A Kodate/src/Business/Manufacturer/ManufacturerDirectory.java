/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturer;

import java.util.ArrayList;

/**
 *
 * @author srushtidesai
 */
public class ManufacturerDirectory { ArrayList<Manufacturer> manufacturerList ;

    

    public ManufacturerDirectory() {
        this.manufacturerList = new ArrayList();
    }

    public ArrayList<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public void setManufacturerList(ArrayList<Manufacturer> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }
    
    public Manufacturer addNewManufacturer(Manufacturer manu){
    
        manu.setManuId("Manu"+(manufacturerList.size()+1));
        Manufacturer manufacturer = new Manufacturer();
        manufacturerList.add(manu);
        return manufacturer;
        
    }
    
    public void removeManufacturer(String manufacturerId)
    {
        for(Manufacturer m :manufacturerList){
            if(m.getManuId().equals(manufacturerId)){
                 manufacturerList.remove(m);
            }
        }
       
    }
    public Manufacturer search_Manu(String manu)
    {
        for(Manufacturer m :manufacturerList)
        {
            if(m.getManuId().equals(manu))
            {
                 return m;
            }
        
        
        
        }
    return null;
    }
}    

