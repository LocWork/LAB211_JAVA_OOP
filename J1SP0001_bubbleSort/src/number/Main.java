/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number;

/**
 *
 * @author hi
 */
public class Main {
    public static void main(String[] args) {
        String userChoice = "";
        Manager nm = new Manager();
        Validate util = new Validate();
       
        do {            
            nm.addNumber();
//            if(nm.arr.size() > 0){
//                System.out.print("Unsorted array : ");
//                nm.display();
//                nm.bubbleSort();
//                System.out.print("Sorted array : ");
//                nm.display();
//                nm.arr.clear();
//            }else{
//                System.out.println("The array is empty");
//            }
            System.out.print("Unsorted array : ");
            nm.display();
            nm.bubbleSort();
            System.out.print("Sorted array : ");
            nm.display();
            nm.arr.clear();

            do {                
                userChoice = util.getString("Do you want to enter another array (Y/N)", "invalied choice");
            } while (!userChoice.trim().equalsIgnoreCase("Y") && !userChoice.trim().equalsIgnoreCase("N"));
        } while (userChoice.trim().equalsIgnoreCase("Y"));
    }
}
