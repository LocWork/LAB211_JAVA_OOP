/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hi
 */
public class manager {
    
    public void addNumber(){
        Scanner s = new Scanner(System.in);
        int [] list;
        int size = 0;
        Validator val = new Validator();        
        Random dice = new Random();
        int userNumber;     
        size = val.getInt("Enter the size of the array: ", "The size cannot be smaller than 1", "Invalied input");
        list = new int[size];
            for(int i = 0; i < size; i++){
                userNumber = 1+dice.nextInt(20); 
                list[i] = userNumber;
            }  
            
        System.out.println("Unsorted arry: "+ Arrays.toString(list));
        quickSort(list, 0, list.length - 1);
        System.out.println("Sorted array: "+Arrays.toString(list));          
    }    
      
    public void quickSort(int[]list,int start, int end){
        int pivot = (start + end) / 2;
        if(start < end){
            for(int i = start; i <= pivot; i++){
                for(int j = end; j >= pivot; j--){
                    if(list[i] >  list[j]){
                        if(list[j] <= list[pivot] || list[i] >= list[pivot]){
                            swap(list, i, j);
                            i= start;
                        }
                    }
                }
            }  
            quickSort(list, start, pivot - 1);
            quickSort(list, pivot + 1, end);               
        }   
    }
    public void swap(int[] list,int a, int b){
        int tmp = list[a];
        list[a] = list[b];
        list[b] = tmp;
    }
    

}
