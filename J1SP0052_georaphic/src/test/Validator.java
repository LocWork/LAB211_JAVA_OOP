/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import OtherContry.EastAsiaCountries;
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
    
    public String getString(String msg, String warning,String note){
        String result;
        Scanner s = new Scanner(System.in);
        do {            
            try {
                System.out.println(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(result.trim().isEmpty()){
                    System.out.println(warning);
                }
                return result;
            } catch (Exception e) {
                System.out.println(note);
            }
        } while (true);
    }
    
    public String getID(String msg,String warning,String note){
        String result;
        String ex = "[A-Z]{1,5}";
        Scanner s = new Scanner(System.in);
        do {            
            try {
                System.out.println(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(result.trim().isEmpty()){
                    System.out.println(warning);
                }
                if(!result.matches(ex))throw new Exception();
                return result;
            } catch (Exception e) {
                System.out.println(note);
            }
        } while (true);
    }
    
    //work on this latter
    public String getName(String msg,String warning,String note){
        String result;
        String ex = "[a-zA-Z- ',]+";
        Scanner s = new Scanner(System.in);
        do {            
            try {
                System.out.println(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(result.trim().isEmpty()){
                    System.out.println(warning);
                }
                if(!result.matches(ex))throw new Exception();
                return result;
            } catch (Exception e) {
                System.out.println(note);
            }
        } while (true);
    }
    
    public float getFloat(String msg,String warning ,String note){
        float result;
        Scanner s = new Scanner(System.in);
        do {            
            try {
                System.out.println(msg);
                s = new Scanner(System.in);
                result = Float.parseFloat(s.nextLine());
                if(result < 1){
                    System.out.println(warning);
                }else{
                    return result;
                }      
            } catch (Exception e) {
                System.out.println(note);
            }
        } while (true);
    }
    
}
