/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.util.Scanner;

/**
 *
 * @author hi
 */
public class Main {
    public static void main(String[] args) {
        Mytitle utl = new Mytitle();
        Scanner s = new Scanner(System.in);
        String cont = "";
        manageStudent ms = new manageStudent();
        System.out.println("=========Collection sort program===========");
        do {            
            ms.addStudent();
            do {                
                cont = utl.getString("Do you want to add another studen(Y/N)", "Invalid input"); 
            } while (!cont.trim().equalsIgnoreCase("Y") && !cont.trim().equalsIgnoreCase("N"));
        } while (cont.trim().equalsIgnoreCase("Y"));
        ms.sortStudent();
        ms.display();
    }
    
    
            
}
