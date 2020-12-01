/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author hi
 */
public class Manager {
    //fields
    ArrayList<Number> arr = new ArrayList<>();
    Validate val = new Validate();
    
    //methods
    public void randomNumber(){
        int number;
        Random dice = new Random();
        int arraySize;
        
        arraySize = val.getNumber("Enter the array size: ", "The array smaller than 1", "Invalid input");
        for(int i = 0; i < arraySize; i++){
            number = 1 + dice.nextInt(9);
            arr.add(new Number(number));
        }
    }
    
    public void display(){
        System.out.print("The array: ");
        if(!arr.isEmpty()){
            for(int i = 0 ;i < arr.size(); i++){
                System.out.print(arr.get(i).getNumber() + " ");
            }
            System.out.println("");            
        }else{
            System.out.print("The array is empty\n");
        }
    }
    
    public void linearSearch(){
        int searchNumber;
        int flag = -1;
        searchNumber = val.userNumber("Enter search value: ", "Invalid input");
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).getNumber() == searchNumber){
                flag = i;
                System.out.println("Found "+searchNumber+" at "+flag+" position");
                
            }
        }
        if(flag == -1){
            System.out.println("The number does not exit");
        }
    }
}
