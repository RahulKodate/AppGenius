/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturer;

import Business.Items.Item;
import Business.ManuReq.ManuRequests;
import java.util.ArrayList;

/**
 *
 * @author srushtidesai
 */
public class Manufacturer { 
    private String ManuName;
    private String emailAddress;
    private String ManuId;
    private ArrayList<ManuRequests> Manureq;
    private ArrayList<Item> itemDirectory;

    public ArrayList<Item> getItemDirectory() {
        return itemDirectory;
    }

    public void setItemDirectory(ArrayList<Item> itemDirectory) {
        this.itemDirectory = itemDirectory;
    }
        
    
    
    public Manufacturer(){
        this.Manureq =new ArrayList<ManuRequests>();
        this.itemDirectory=new ArrayList<Item>();
    }
    
    
   
    private String userName;
    String PhoneNumber;
    private String Password;
    
    public String getManuId() {
        return ManuId;
    }

    public void setManuId(String ManuId) {
        this.ManuId = ManuId;
    }   
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public String getManuName() {
        return ManuName;
    }

    public void setManuName(String manuName) {
        this.ManuName = manuName;
    }
    public ArrayList<ManuRequests> getManureq() {
        return Manureq;
    }

    public void setManureq(ArrayList<ManuRequests> Manureq) {
        this.Manureq = Manureq;
    }

    
   

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    @Override
    public String toString()
    {
        return this.ManuName;
    }
   
    public Item addNewItem(Item item)
    { 
        itemDirectory.add(item);
        return item;
        
    }
    
}

    

