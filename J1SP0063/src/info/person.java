/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info;

import Validation.Validator;

/**
 *
 * @author hi
 */
public class person implements Comparable<person>{
    //field
    String name;
    String location;
    double salary;
    public person(){};
    public person(String name, String location, double salary) {
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    public void inputInfo(){
        Validator val = new Validator();
        name = val.manageName("Enter name: ", "Name cannot be blank", "Invalied name input");
        location = val.manageName("Enter location: ", "Location cannot be blank", "Invalied location input");
//        salary = val.manageSalary("Enter salary: ", "Salary cannot be blank", "Salary must be greater than zero");
        salary = val.manageSalary2("Enter salary: ","Salary must be greater than zero");
    }
    
    public void outputInfo(){
        System.out.println("Person information.");
        System.out.println("Name: "+ name);
        System.out.println("Location: "+location);
        System.out.println("Salary: "+salary);
    }

    @Override
    public int compareTo(person p) {
        if(salary > p.salary){
            return 1;     
        }
        else if( salary < p.salary){
            return -1; 
        }
        return 0;
    }
}
