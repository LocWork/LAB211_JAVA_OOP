/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validate;

import Info.Worker;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hi
 */
public class Manager {
    ArrayList<Worker> workerList = new ArrayList<>();
    ArrayList<String> infoList = new ArrayList<>();
//    Worker workerInfo = new Worker();
    
    
    //consturctor
    public Manager() {
    }
    //getter
    public ArrayList<Worker> getWorkerList() {
        return workerList;
    }

//    public ArrayList<Worker> getInfoList() {
//        return infoList;
//    }

//    public Worker getWorkerInfo() {
//        return workerInfo;
//    }
    //setter

    public void setWorkerList(ArrayList<Worker> workerList) {
        this.workerList = workerList;
    }

//    public void setInfoList(ArrayList<Worker> infoList) {
//        this.infoList = infoList;
//    }

//    public void setWorkerInfo(Worker workerInfo) {
//        this.workerInfo = workerInfo;
//    }
    
    
    //Method
    public boolean compareCode(String workerCode){
        for(int i = 0; i < workerList.size(); i++){
            if(workerList.get(i).getId().equals(workerCode)){
                return true;
            }
        }
        return false;
    }
    
    public Worker searchWorker(String workerCode){
        for(int i = 0; i < workerList.size(); i++){
            if(workerList.get(i).getId().equals(workerCode)){
                return workerList.get(i);
            }
        }
        return null;
    }
    
    public void addInfo(){
//        Dont redo the input but force the user to manually input       
//        boolean redo = true;
        Worker workerInfo = new Worker();
        workerInfo.inputInfo();
        if(compareCode(workerInfo.getId())){
            System.out.println("There is already a person with that code");
            System.out.println("Please try again.");
        }else{
            workerList.add(workerInfo);
//            infoList.add(workerInfo);
            System.out.println("Worker info has been added");
        }
        
    }
    
    public void upSalary(){
        Validator val = new Validator();
        String selectID;
        double amountToAdd;
        double total;
        //get the id form user
        selectID = val.manageID("Enter Worker ID: ", "Invalied input");
        //check if that id exit
        if(compareCode(selectID) == false){
            System.out.println("There is no worker with that ID");
        }else{
            if(searchWorker(selectID) != null){
                amountToAdd = val.manageSalary("Enter amount (Int): ", "The number must be greater than 0");
                total = searchWorker(selectID).getSalary() + amountToAdd;
                searchWorker(selectID).setSalary(total);
                searchWorker(selectID).setStatus("UP");
                //this will make the infoList contain only the update Info the user info
                String x;
                x = searchWorker(selectID).toString();
                infoList.add(x);
//                WARNING THIS CODE WILL UPDATE ALL THE INFO IN THE LIST AT ONCE
//                infoList.add(searchWorker(selectID));
                System.out.println("The work salary has been added");
            }else{
                System.out.println("There is something wrong with your code");
            }
      
        }
        //if exit perform method
        
    }
        
    //Secont solution to the down Salary if salary = 1 then dont let the user remove anymore
        public void downSalary(){
            //do the same as up salary but reverse
           Validator val = new Validator();
            String selectID;
            double amountToRemove;
            double total;
            boolean redo = true;
            Date currentDate = new Date();
            //get the id form user
            selectID = val.manageID("Enter Worker ID: ", "Invalied input");
            //check if that id exit
            if(compareCode(selectID) == false){
                System.out.println("There is no worker with that ID");
            }else{
                //if(searchWorker(selectID).getSalary == 1) sout(The amout is at a minimum);
                if(searchWorker(selectID) != null){
                    //check extra condition 
                    //x = 1 and total = 0 than it will be an infinite loop
                    amountToRemove = val.manageSalary("Enter amount(Int): ", "The number must be greater than 0");
                    total = searchWorker(selectID).getSalary() - amountToRemove;  
                    //use if condition dont loop
                    if(total < 1){
                        System.out.println("Unable to subtract the salary");
                    }else{
                        //The three part that need to be save please do the same for up salary
                        searchWorker(selectID).setSalary(total);
                        searchWorker(selectID).setCurrentDate(currentDate);
                        searchWorker(selectID).setStatus("DOWN");
                        String x;
                        x = searchWorker(selectID).toString();
                        infoList.add(x);                        
//                        infoList.add(searchWorker(selectID));   
                        System.out.println("The worker salary has been subtract");
                    }
                }else{
                    System.out.println("There is something wrong with your code");
                }
      
        }               
        }
    
    public void displayInfo(){
        if(infoList.isEmpty()){
            System.out.println("There is nothing in the worker update list");
        }else{
            //id+"\t"+name+"\t"+age+"\t"+salary+"\t"+status+"\t"+
            System.out.println("Code\tName\tAge\tSalary\tStatus\tDate");
            for(int i = 0; i < infoList.size(); i++){
                System.out.println(infoList.get(i));
            }            
        }
    }
    
}
