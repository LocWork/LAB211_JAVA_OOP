/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Info.User;
import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class Manager {
    ArrayList<User> fileList = new ArrayList();
    ArrayList<User> list = new ArrayList<>();
    public boolean checkName(String name){
        for(int i =0; i< list.size(); i++){
            if(list.get(i).getUserName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    public boolean checkPass(String pass){
        for(int i = 0 ; i < list.size(); i++){
            if(list.get(i).getUserPass().equals(pass)){
                return true;
            }
        }
        return false;
    }
    
    public void load(){
        fileList = userFile.readFile("info.txt"); 
    }
    public void save(){
        userFile.writeFile(list, "info.txt");
    }
    
    public void newUser(){
        User u = new User();
        u.inputInfo();
        list = fileList;
        if(checkName(u.getUserName()) == false && checkPass(u.getUserPass()) == false){
            list.add(u);    
            System.out.println("User has been created");    
        }else{
            System.out.println("Unable to create user");
        }
    }
    
    // fix the code
    public void login(){
        User u = new User();
//        load();
        u.inputInfo();
//        System.out.println(u.toString());
        list = fileList;
        if(checkName(u.getUserName()) == true && checkPass(u.getUserPass()) == true){
            System.out.println("Login success");
        }else{
            System.out.println("Unable to login");
        }        
        
    }
    
}
