/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managed;

import java.util.Scanner;

/**
 *
 * @author hi
 */
public class Validator {
    public String userNumber(String msg,String blank,String ex){
        Scanner s = new Scanner(System.in);
        String rex = "[\\d]{10}";
        String result;
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(result.trim().isBlank())throw new Exception(blank);
                if(!result.matches(rex))throw new Exception(ex);
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    }
    
    public String userString(String msg,String blank, String ex){
        Scanner s = new Scanner(System.in);
        String rex = "[\\d\\w]{8,31}";
        String result;
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(result.trim().isBlank())throw new Exception(blank);
                if(leeterOnly(result) == true)throw new Exception(ex);
                if(numberOnly(result) == true)throw new Exception(ex);
                if(!result.matches(rex))throw new Exception(ex);
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    }
    
    public String userCapcha(String msg,String blank, String ex){
        Scanner s = new Scanner(System.in);
        String rex = "[\\d\\w]{1}";
        String result;
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(result.trim().isBlank())throw new Exception(blank);
                if(!result.matches(rex))throw new Exception(ex);
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    }
    
    public boolean leeterOnly(String userString){
        char[]c = userString.toCharArray();
        for(int i = 0; i < userString.length(); i++){
            if(Character.isDigit(c[i])){
                return false;
            }
        }
        return true;
    }
    
    public boolean numberOnly(String userString){
        char[]c = userString.toCharArray();
        for(int i = 0; i < userString.length(); i++){
            if(Character.isAlphabetic(c[i])){
                return false;
            }
        }
        return true;
    }
    
    
    public int userChoice(String msg,String bound,int min,int max){
        Scanner s = new Scanner(System.in);
        int result;
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = Integer.parseInt(s.nextLine());
                if(result < min || result > max)throw  new Exception(bound);
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    }  
}
