/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

/**
 *
 * @author hi
 */
public class manager {
    
    int searchNumber;
    boolean found = false;
    public void binarySearch(){
        int [] numberList = {2,4,6,7,9,15,20,39};
        int choice;
        Validator val = new Validator();
        //the list must be sorted
        System.out.println("{2,4,6,7,9,15,20,39}");
       
        choice = val.userNumber();
        int i = 0;
        search(choice, i, numberList.length -1,numberList);
        if(found == false){
            System.out.println("That number is not in the list");
        }else{
            System.out.println(choice+" was founded at "+searchNumber);      
        } 
    }
    
    // 9 0 7 4 1 2
    
    public void search(int number, int i, int last,int[] list){
        int mid = (i + last)/2;
       
        if(i <= last){
            if(number == list[mid]){
                searchNumber = mid;
                found = true;
            }else if(number > list[mid]){
                search(number, mid + 1, last , list);
            }else if(number < list[mid]){    
                search(number, i, mid - 1, list);
            }                  
        }else{
            
            found = false;
        
        }
    }   
        
        
    }
    
//    public void search2(int [] a){
//        int mid = 
//    }

