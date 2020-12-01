/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Info.Employee;
import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class Manager {
    ArrayList<Employee> list = new ArrayList<>();
 
    
    public boolean checker(Employee x){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getAss().endsWith(x.getAss())){
                if(list.get(i).getDate().equals(x.getDate())){
                    if(list.get(i).getTime() == x.getTime()){
                        if(list.get(i).getTaskType().equals(x.getTaskType())){
                            if(list.get(i).getName().equals(x.getName())){
                                if(list.get(i).getRev().equals(x.getName())){
                                    System.out.println("That task already exits");
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public void addTask(){
        Employee x = new Employee();
        do{
        x.inputInfo();
        if(list.isEmpty()){
            x.setId(1);
        }else{
            x.setId(list.size() + 1);
        }
        }while(checker(x));
        list.add(x);
        
        
    }
    
    public void removeTask(){
        Validator val = new Validator();
        if(list.isEmpty()){
            System.out.println("The list is currently empty"); 
        }else{
            int number = val.userNumber("Enter task id: ");
        
            if(removeAction(number)){
                System.out.println("The task has been remove");
            }else{
                System.out.println("There is no task to remove");
            }            
        }
        
    }
    
    public boolean removeAction(int idNumber){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == idNumber){
                list.remove(i);
                for(int j = i; j < list.size(); j++){
                    list.get(j).setId(j + 1);
                }
                return true;
            }
        }
        
        return false;
    }
    
    public void display(){
        if(list.isEmpty()){
            System.out.println("The list is Empty");
        }else{
//            System.out.println(id+"\t"+name+"\t"+taskType+"\t"+formater.format(date)+"\t"+time+"\t"+ass+"\t"+rev);
            System.out.println("ID\tName\tTask Type\tDate\tTime\tAssignee\tReviewer");
            for(int i = 0; i < list.size(); i++){
                list.get(i).outputInfo();
            }
        }
    }
    
    
    
}
