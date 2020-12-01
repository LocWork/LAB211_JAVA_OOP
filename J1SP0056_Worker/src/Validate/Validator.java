/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validate;

import java.text.SimpleDateFormat;
import java.util.Date;
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
    
    public String manageID(String msg, String note){
        Scanner s = new Scanner(System.in);
        String result;
        String rex = "^[W][0-9]{2}";
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
        String rex = "[A-Za-z\\s]{0,20}";
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
//                if(result.trim().isBlank())throw new Exception(note);
                if(!result.matches(rex))throw new Exception(note);
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);  
    }    
    
    public int manageAge(String msg, String note,int min,int max){
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
    
    
    
    public double manageSalary(String msg, String note){
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
//    This part is not needed  
//    public Date manageDate(String msg, String note){
//        Scanner s = new Scanner(System.in);
//        Date result;
//        String date;
//        Date curentDate = new Date();
//        do {            
//            try {
//                
//                System.out.print(msg);
//                s = new Scanner(System.in);
//                date = s.nextLine();
//                String[] arr= date.split("/");
//                result=new Date(Integer.parseInt(arr[2]) - 1900,Integer.parseInt(arr[1]) - 1,Integer.parseInt(arr[0])); 
//                if(result.after(curentDate))throw new Exception(note);      
//                return result;
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//            
//        } while (true);
//    }
    
    public String manageWorkLocation(String msg, String note){
        Scanner s = new Scanner(System.in);
        String result;
        String rex = "[A-Z]{3}";
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(result.trim().isBlank())throw new Exception(note);
                if(!result.matches(rex))throw new Exception();
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);  
    }    
}


// this is the base code
//    public String getID(String msg, String note){
//        Scanner s = new Scanner(System.in);
//        String result;
//        do {            
//            try {
//                System.out.print(msg);
//                s = new Scanner(System.in);
//                result = s.nextLine();
//                if(result.trim().isBlank())throw new Exception(note);
//                return result;
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        } while (true);  
//    }