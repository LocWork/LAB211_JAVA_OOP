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
    public int userChoice(int numberOfChoice,String msg,String warning,String note){
        Scanner s = new Scanner(System.in);
        int number;
        do {            
            try {
                System.out.print(msg);
                number = Integer.parseInt(s.nextLine());
                if(number < 0 || number > numberOfChoice){
                    System.out.println(warning);
                }else{
                    return number;
                }
            } catch (NumberFormatException e) {
                System.out.println(note);
            }
        } while (true);
    }    
    
    public String manageCode(String msg, String note){
        Scanner s = new Scanner(System.in);
        String result;
        String rex = "[D][0-9]{2}";
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(result.trim().isBlank())throw new Exception(note);
                if(!result.matches(rex))throw new Exception(note);
                return result.trim();
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);  
    }
    
    public String manageName(String msg, String note){
        Scanner s = new Scanner(System.in);
        String result;
        String rex = "[A-Za-z]{1,20}";
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(result.trim().isBlank())throw new Exception(note);
                if(!result.matches(rex))throw new Exception(note);
                return result;                
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    }
    
    public String manageSpecialization(String msg, String note){
        Scanner s = new Scanner(System.in);
        String result;
        String rex = "[A-Za-z]{1,20}";
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(result.trim().isBlank())throw new Exception(note);
                if(!result.matches(rex))throw new Exception(note);
                return result;                
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    }    
    
    
    public int manageAvailability(String msg, String note,int min,int max){
        Scanner s = new Scanner(System.in);
        int result;
        do {            
            try {
                System.out.print(msg);
                result = Integer.parseInt(s.nextLine());
                if(result < min || result > max)throw new Exception(note);
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    }
    
}
