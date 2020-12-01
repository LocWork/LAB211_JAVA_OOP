/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Info;

import Validate.Validator;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hi
 */
public class Worker {
    //fields
    //(id, name,age, salary, work location)
    String id;
    String name;
    int age;
    double salary;
    String workLocation;
    String status;
    Date currentDate = new Date();
    String datePatern = "dd/MM/yyyy";
    
    //constructor
    public Worker(){
        id = "Text_holder";
        name = "Text_holder";
        age = 18;
        salary = 1;
        workLocation = "Text_holder";
        status = "UP";
        
    }

    public Worker(String id, String name, int age, double salary, String workLocation, String status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
        this.status = status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public String getStatus() {
        return status;
    }

    public Date getCurrentDate() {
        return currentDate;
    }
    
    public void inputInfo(){
        Validator val = new Validator();
        id = val.manageID("Enter Code [Wxx]: ", "Invalied input");
        name = val.manageName("Enter Name (String): ", "Invalied input");
        age = val.manageAge("Enter Age (Int)(18-50): ", "Your age is invalied", 18, 50);
        salary = val.manageSalary("Enter Salary (Int): ", "Salary must be greater then 0");
        workLocation = val.manageWorkLocation("Enter work location (String [A-Z]{3}): ", "Invalied input");
        status = "null";
        currentDate = new Date();
    }
    
    public String outputInfo(){
//        String workerStatus;
//        if(status == true){
//            workerStatus = "True";
//        }else{
//            workerStatus = "False"
//        }
//      This code is the same as to string but please use to String
        return id+"\t"+name+"\t"+age+"\t"+salary+"\t"+status+"\t"+currentDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        return id+"\t"+name+"\t"+age+"\t"+salary+"\t"+status+"\t"+formater.format(currentDate);
    }
    
    
}
