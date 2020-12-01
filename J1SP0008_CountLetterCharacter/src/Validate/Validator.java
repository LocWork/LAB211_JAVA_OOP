/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validate;

import java.util.Scanner;

/**
 *
 * @author hi
 */
public class Validator {
    
    public String userString(){
        Scanner s = new Scanner(System.in);
        boolean redo = true;
        String result = null;
         String rex = "[A-Za-z\\s]";
        do {            
            try {
                System.out.print("Enter your content: ");
                s = new Scanner(System.in);
                result = s.nextLine();
                if(result.matches(rex))throw new Exception();
                if(result.trim().isBlank())throw new Exception();
                redo = false;
            } catch (Exception e) {
                System.out.println(e);
                redo = true;
            }
        } while (redo == true);
        
        return result;
        
    }
    public String userChoice(){
        Scanner s = new Scanner(System.in);
        String result;
        do {            
            try {
                System.out.print("Do you want to continue?(Y/N): ");
                s = new Scanner(System.in);
                result = s.nextLine();
                if(!result.equalsIgnoreCase("Y") && !result.equalsIgnoreCase("N"))throw new Exception();
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    }
}
