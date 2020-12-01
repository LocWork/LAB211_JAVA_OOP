/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import info.person;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author hi
 */
public class Manager {
    public ArrayList<person> list = new ArrayList();
    
    public void clearTheList(){
        list.clear();
    }
    
    public boolean checkName(String name){
        for(int i = 0 ; i < list.size(); i++){
            if(list.get(i).getName().equals(name)){
                return true;
            }
        }
        return false;
        
    }
    
    public void newPerson(){
        int count = 0;
            
        do {            
            person x = new person();
            x.inputInfo();
            if(checkName(x.getName())){
                System.out.println("There is already a person with that name\n");
                
            }else{
                list.add(x);
                count++;
            }
        } while (count < 3);
        
    }
    
    public void sortPerson(){
        Collections.sort(list);
    }
    
    public void personList(){
        for(int i = 0; i < list.size(); i++){
            list.get(i).outputInfo();
            System.out.println();
        }
    }
}
