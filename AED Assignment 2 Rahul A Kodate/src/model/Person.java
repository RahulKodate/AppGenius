/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author rahulkodate
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private long cellNo;
    private Date date;
    private int age;
    private long height;
    private long weight;
    private String address;
    private Image personPicture;
    
    public Person(){
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getCellNo() {
        return cellNo;
    }

    public void setCellNo(long cellNo) {
        this.cellNo = cellNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Image getPersonPicture() {
        return personPicture;
    }

    public void setPersonPicture(Image personPicture) {
        this.personPicture = personPicture;
    }
    
    public boolean isMastch (String Name){
    if(getFirstName().equalsIgnoreCase(Name)){
        return true;
    }
     return false;
    }
    
            
 
    
}
