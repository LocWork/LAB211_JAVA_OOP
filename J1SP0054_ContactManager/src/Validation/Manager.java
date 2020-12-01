/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Info.ContactInfo;
import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class Manager {
    ArrayList<ContactInfo> arr = new ArrayList<>();
    
    //basic arr constructor

    public Manager() {
    }

    public void setArr(ArrayList<ContactInfo> arr) {
        this.arr = arr;
    }
    
    
    public ArrayList<ContactInfo> getArr() {
        return arr;
    }
    
   
    
    
    
    
    
    public boolean checkName(String name){
        for(int i =0 ; i < arr.size(); i++){
            if(arr.get(i) != null && arr.get(i).getFullname().trim().equals(name.trim())){
                return true;
            }
        }
        return false;
    }
    
    public void addName(){
        ContactInfo con = new ContactInfo();
        boolean flag;
        int userID;
        if(arr.isEmpty()){
            userID = 1;
        }else{
            userID = arr.size() + 1;
        }
        do {            
            con.enterInfo(userID);
            if(checkName(con.getFullname())){
                System.out.println("There is already a person with that name");
                flag = true;
            }else{
                flag = false;
                arr.add(con);
                System.out.println("Contact info has been added");
            }
        } while (flag == true);
        
    }
    
    public void display(){
        if(arr.isEmpty()){
            System.out.println("The contact list is empty");
        }else{
            System.out.println("===============================Contact Info==========================================");
            System.out.println("ID\tName\t\tFirst Name\tLast Name\tGroup\tAddress\t\tPhone");
            for(int i =0 ;i < arr.size(); i++){
                if(arr.get(i) != null){
                    arr.get(i).displayInfo();
                }
            }
            System.out.println("\t");            
            }
    }
    
    public void search(){
        Validator val = new Validator();
        int userID;
        boolean flag = false;
        userID = val.getInt("Please input an ID: ","ID start at 1", "Invalied input");
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) != null && arr.get(i).getID() == userID){
                arr.remove(arr.get(i));
                flag = true;
                for(int j = i; j < arr.size();j++){
                    if(arr.get(j) != null){
                        arr.get(j).setID(j + 1);
                    }
                }
            }
            
        }
        if(flag == true){
            System.out.println("Contact has been deleted\t");
        }else{
            System.out.println("There is no contact with that ID");
        }
    }
    
    
}
