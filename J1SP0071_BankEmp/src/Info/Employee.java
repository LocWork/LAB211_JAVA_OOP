/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Info;

import Validation.Validator;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hi
 */
public class Employee {
    //Field
    int id = 0;
    String name;
    String taskType;
    Date date;
    double from;
    double to;
    double time;
    String ass;
    String rev;
    //Constructor
    public Employee(){
    
    }
    

    public Employee(int id, String name, String taskType, Date date, double from, double to, double time, String ass, String rev) {
        this.id = id;
        this.name = name;
        this.taskType = taskType;
        this.date = date;
        this.from = from;
        this.to = to;
        this.time = time;
        this.ass = ass;
        this.rev = rev;
    }
    //setter

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setAss(String ass) {
        this.ass = ass;
    }

    public void setRev(String rev) {
        this.rev = rev;
    }
    //getter

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTaskType() {
        return taskType;
    }

    public Date getDate() {
        return date;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public double getTime() {
        return time;
    }

    public String getAss() {
        return ass;
    }

    public String getRev() {
        return rev;
    }
    
    public void inputInfo(){
        Validator val = new Validator();        
//        id = id + 1;
        name = val.nameManage("Name of the requirement(String): ", "Name does not match form [a-zA-z]{3-20}");
        taskType = val.taskManage("Tasktype ID: ", 1, 4);
        date = val.dateManage("Date(dd/mm/yyyy): ");
        do {            
            from = Math.round(val.numberManage("Start time(8-17.5): ", "Time is beyond work limit") * 2.0)/2.0;
            to = Math.round(val.numberManage("End time(8-17.5): ", "Time is beyond work limit")*2.0)/2.0;
            if(from > to){
                System.out.println("Start time must be less then end time");
            }
        } while (from > to);
        
        time = to - from;  
        ass = val.nameManage("Assignee(String): ", "Assignee does not match form [a-zA-z]{3-20}");
        rev = val.nameManage("Reviewer(String): ", "Reviewer does not match form [a-zA-z]{3-20}");
    }
    
    public void outputInfo(){
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        formater.setLenient(false);
        System.out.println(id+"\t"+name+"\t"+taskType+"\t\t"+formater.format(date)+"\t"+time+"\t"+ass+"\t"+rev);
        
        
    }
    
}
