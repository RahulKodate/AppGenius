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
public class PersonDirectory {
    
    private ArrayList<Person> person;
     
    
    public PersonDirectory(){
        
        person = new ArrayList<>();
    }
    
    public ArrayList<Person> getPerson(){
       return person;
    }
    
    public void setPerson(ArrayList<Person> person){
        this.person = person;
    
    }
    
     public Person addPerson(Person newPerson)
    {
     
        person.add(newPerson);
        return newPerson;  
    }
    
    public void removePerson(Person person)
    {
        this.person.remove(person);
    }
}
    


