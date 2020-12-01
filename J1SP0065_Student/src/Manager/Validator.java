/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.util.Scanner;

/**
 *
 * @author hi
 */
public class Validator {
    public String nameValidate(String msg,String note){
        Scanner s = new Scanner(System.in);
        String result;
        String rex = "[\\w\\s\\d]{2,15}";
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(result.trim().isBlank())throw new Exception("String cannot be blank");
                if(!result.matches(rex))throw new Exception(note);
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }            
        } while (true);
    }
    
    public double digitValidate(String msg,String note, String note2){
        Scanner s = new Scanner(System.in);
        double result;
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = Double.parseDouble(s.nextLine());
                if(result < 1)throw new Exception(note);
                if(result > 10)throw new Exception(note2);
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
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
