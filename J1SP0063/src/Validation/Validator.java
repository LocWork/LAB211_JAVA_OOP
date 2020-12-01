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
    
    public String manageName(String msg,String blank,String reg){
        Scanner s = new Scanner(System.in);
        String result;
        String rex = "[A-Za-z]{0,20}";
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(result.trim().isBlank())throw new Exception(blank);
                if(!result.matches(rex))throw new Exception(reg);
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);  
    }
    

    
    public double manageSalary(String msg,String blank,String negative){
        Scanner s = new Scanner(System.in);
        double result;
        String x = "";
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                x = s.nextLine();
                x = x.trim();
                if(x.isBlank())throw new Exception(blank);
                result = Double.parseDouble(x);
                if(result < 1)throw new Exception(negative);
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    }
    public double manageSalary2(String msg, String note){
        Scanner s = new Scanner(System.in);
        double result;
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = Double.parseDouble(s.nextLine());
                if(result < 1)throw new Exception(note);
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    }    
}
