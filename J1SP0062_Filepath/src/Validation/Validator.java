/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import java.util.Scanner;

/**
 *
 * @author hi
 */
public class Validator {
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
    
    public String userString(String msg, String blank){
        Scanner s = new Scanner(System.in);
        String result;
//        String rex = "[A-Z]{3}";
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(result.trim().isBlank())throw new Exception(blank);
//                if(!result.matches(rex))throw new Exception();
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);  
    }      
}
