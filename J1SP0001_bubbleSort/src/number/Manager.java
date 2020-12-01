/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author hi
 */
public class Manager {
    //fields
    ArrayList<number> arr = new ArrayList<>();
    
    //methods
    public void addNumber(){
        Random dice = new Random();
        int userNumber;
        int arraySize = 0;
        Validate val = new Validate();       
        arraySize = val.getInt("Enter the size of the array: ", "The size cannot be smaller than 1", "Invalied input");
            for(int i = 0; i < arraySize; i++){
                userNumber = 1+dice.nextInt(9);
                arr.add(new number(userNumber));
            }            
    }

    
    public void bubbleSort(){
        if(arr.size() < 1){
            System.out.println("The array is empty");
        }else{
            for(int i = 0; i < arr.size(); i++){
                for(int j = 0; j < arr.size() - i - 1; j++){
                    if(arr.get(j).getNumber() > arr.get(j + 1).getNumber()){
                        number tmp = arr.get(j);
                        arr.set(j,arr.get(j+1));
                        arr.set(j + 1, tmp);
                    }
                }
            }
        }
    }
    
    public void display(){
        if(arr.isEmpty()){
            System.out.print("The array is empty");
        }else{
            for(int i = 0; i < arr.size(); i++){
                System.out.print(arr.get(i).getNumber() +" ");
            }
            System.out.println("");            
        }
    }
    
    public void combination(){
        
    }
    
}
