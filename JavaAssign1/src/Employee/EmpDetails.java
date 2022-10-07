/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

import java.util.ArrayList;

/**
 *
 * @author rahulkodate
 */
public class EmpDetails {
    
    private ArrayList<Person> details;
    
    public EmpDetails(){
    
    this.details = new ArrayList<Person>();
//        
    
}
    public ArrayList<Person> getEmpDetails() {
        return details;
    }

    public void setEmpDetails(ArrayList<Person> empDetails) {
        this.details = empDetails;
    }

        
    public Person addNewEmployee(Person p){
  
    this.details.add(p);
    return p;
    
    
    }
    
    public void deleteEmployee(Person p){
    
    details.remove(p);
    
    }

    public Person search_EmployeeByName(String emp){
      
        for(Person p : details){
            if(p.getName().equalsIgnoreCase(emp)){
                return p;
            }
 
        }
      return null;
    }

    public Person search_EmployeeById(int id){
      for(Person p : details){
          if(p.getEmployeeId()==id){
              return p;
          }
     
      }
    return null;
    }

public Person search_EmployeeByCellPhoneNum(String number){
      for(Person p : details){
          if(p.getCellPhoneNum().equalsIgnoreCase(number) ){
              return p;
          }
     
      }
    return null;
    }
}
