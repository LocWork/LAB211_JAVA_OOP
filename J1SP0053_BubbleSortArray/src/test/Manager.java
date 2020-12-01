/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class Manager {
    ArrayList<Number> list = new ArrayList();
    
    //method
    public void getNumber(){
        int size;
        Validation val = new Validation();
        size = val.getSize(1,100,"Enter The size of the array(int): ","The size is from 1 to 100","Invalied input");
        for(int i = 0; i < size; i++){
            int number = val.getInt("Enter the " +(i+1)+" number: ","Invalid input");
            list.add(new Number(number));
        }
    }
    
    public void ascendingSort(){
        if(list.isEmpty()){
            System.out.println("The array is currently empty please choice option 1\n");
        }else{
            for(int i = 0; i < list.size(); i++){
                for(int j = 0; j < list.size() - i - 1; j++){
                    if(list.get(j).getUserNumber() > list.get(j +1).getUserNumber()){
                        Number tmp = list.get(j);
                        list.set(j, list.get(j+1));
                        list.set(j+1, tmp);
                    }
                }
        }
            System.out.println("-----------Ascending---------------");
            for(int i = 0; i < list.size(); i++){
                System.out.print("["+list.get(i).getUserNumber()+"]" + " ---> ");
            }  
            System.out.println("");
            }
        
    }
    public void DescendingSort(){
        //neu muon thi lay luon getNumber
        if(list.isEmpty()){
            System.out.println("The array is currently empty please choice option 1\n");
        }else{
            for(int i = 0; i < list.size(); i++){
                for(int j = 0; j < list.size() - i - 1; j++){
                    if(list.get(j).getUserNumber() < list.get(j +1).getUserNumber()){
                        Number tmp = list.get(j);
                        list.set(j, list.get(j+1));
                        list.set(j+1, tmp);
                    }
                }
            }
            System.out.println("-----------Descending---------------");
            for(int i = 0; i < list.size(); i++){
                System.out.print("["+list.get(i).getUserNumber()+"]" + " <---");
            }  
            System.out.println("");
        }
        
    }
    
    
    
}
