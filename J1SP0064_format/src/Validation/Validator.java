/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author hi
 */
public class Validator {
    ArrayList<String> list = new ArrayList<>();
    public String getNumber(String msg, String note){
        Scanner s = new Scanner(System.in);
        String result;
        String rex = "[\\d]{10}";
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(result.trim().isBlank())throw new Exception("Please enter phone number");
                if(!result.matches(rex))throw new Exception(note);                
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
            
        } while (true);
    }
    public String getEmail(String msg,String note){
        Scanner s = new Scanner(System.in);
        String result;

        String rex2 = "^[\\w]+\\d?@\\w+[.]\\w+([.]\\w+)?"; //The www school code not mine

//FRC code for standard email regular expresion        
//(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|"(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21\x23-\x5b\x5d-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])*")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21-\x5a\x53-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])+)\])        
        
//        String rex = "[\\w]{3,10}[@]{1}[\\w]{3,10}.[\\w]{3,5}";

        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                 if(result.trim().isBlank())throw new Exception("Please enter email"); 
                if(!result.matches(rex2))throw new Exception(note);
               
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    }
    
    public String getEmail2(String msg, String note){
        Scanner s = new Scanner(System.in);
        String result;
        String base = "^([a-zA-Z0-9_\\-\\.]+)@\\w+[.]\\w+([.]\\w+)?";
//        String w3School = "^[\\w]+\\d?@\\w+[.]\\w+([.]\\w+)?";
   
        
//        String base2 = ""
                    //word digit @ word . word
        boolean validEmail = false;
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(result.trim().isBlank())throw new Exception("Please enter email");  //<----- most get wrong 
                if(!result.matches(base))throw new Exception(note);
                if(eChecker(result) == false)throw new Exception(note);
                
           
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);        
    }
    
    public boolean eChecker(String email){
        String rex = "^([a-zA-Z0-9_\\-\\.]+)@\\w+.com"; //normal mail
        String rex2 = "^([a-zA-Z0-9_\\-\\.]+)@fpt.edu.vn";  //part of fpt
        String rexEX = "^([0-9]+)@\\w+[.]\\w+([.]\\w+)?";   //gmail
        String base2 = "^([0-9]+)([a-zA-Z]{1,10})@\\w+[.]\\w+([.]\\w+)?";//gmail  
//        System.out.println(email.matches(rexEX));
//        System.out.println(!email.matches(base2));
        if(email.matches(rexEX)){
            if(email.matches(base2) == false){
                return false;
            }
        }
        
        if(email.matches(rex) || email.matches(rex2)){
            return true;
        }
        
        return false;
    }
    
    
    public Date getDate(String msg){
        Scanner s = new Scanner(System.in);
        String inputStringDate;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        formatter.setLenient(false);
//        String rex ="[\\d]{1,2}\\/[\\d]{1,2}\\/[\\d]{4}";
        do {            
            try {
                System.out.print(msg);
                s= new Scanner(System.in);
                inputStringDate = s.nextLine();
                Date tmp = formatter.parse(inputStringDate);
                String [] arr = inputStringDate.split("/");
                Date date = new Date(Integer.parseInt(arr[2]) - 1900,Integer.parseInt(arr[1]) - 1,Integer.parseInt(arr[0]));
                return date;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    }
    
    public Date getDate2(String msg){
        Scanner s = new Scanner(System.in);
        String inputStringDate;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        formatter.setLenient(false);
        String rex ="[\\d]{2}\\/[\\d]{2}\\/[\\d]{4}";
        do {            
            try {
                System.out.print(msg);
                s= new Scanner(System.in);
                inputStringDate = s.nextLine();
                if(inputStringDate.isBlank())throw new Exception("Blank date");
                if(!inputStringDate.matches(rex))throw new Exception("Invalied input");
                Date tmp = formatter.parse(inputStringDate);
                return tmp;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);        
        
    }
    
    public String userChoice(String msg){
        Scanner s = new Scanner(System.in);
        String result;
        do {            
            try {
                System.out.println(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(!result.equalsIgnoreCase("Y") && !result.equalsIgnoreCase("N"))throw new Exception();
                if(result.trim().isBlank())throw new Exception("No blank");
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    }
    
}

//                for(int i = 0; i < list.size();i++){
//                    System.out.println((list.get(i)));
//                    if(result.matches(list.get(i))){
//                        System.out.println("x");
//                        checkType = true;
//                    }
//                }
//                if(!result.matches(rex3)){
//                    throw new Exception("Cannot find this email listing");
//                }
//                if(checkType == false)throw new Exception("Cannot find this email listing");