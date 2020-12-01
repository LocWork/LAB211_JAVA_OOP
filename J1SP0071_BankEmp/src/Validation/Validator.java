/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hi
 */
public class Validator {
    public String taskManage(String msg,int start, int end){
        Scanner s = new Scanner(System.in);
        String result = null;
        int choice;
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                choice = Integer.parseInt(s.nextLine());
                if(choice < start || choice > end)throw new Exception("Out of bound");
                switch(choice){
                    case 1:
                        result = "Code";
                        break;
                    case 2:
                        result = "Test";
                        break;
                    case 3:
                        result = "Design";
                        break;
                    case 4:
                        result = "Review";
                        break;
                }
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }            
        } while (true);
    }    
    public String nameManage(String msg,String note){
        Scanner s = new Scanner(System.in);
        String result;
        String rex = "[a-zA-Z\\s]{3,20}";
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(!result.matches(rex))throw new Exception(note);
                if(result.trim().isBlank())throw new Exception("User Name Cannot be Blank");  
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    } 
    public Date dateManage(String msg){
        Scanner s = new Scanner(System.in);
        String result = "";
        Date x ;
        String rex ="[\\d]{2}\\/[\\d]{2}\\/[\\d]{4}";
//        Date curDate = new Date();

        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(result.isBlank())throw new Exception("Date cannot be blanked");
                if(!result.matches(rex))throw new Exception("Date does not match patern");
//                String []formater = date.split("\\/");
//                
//                result = new Date(Integer.parseInt(formater[2]) - 1900, Integer.parseInt(formater[1]) - 1, Integer.parseInt(formater[0]));
//                if(result.after(curDate))throw new Exception("Date must be before current date");
                SimpleDateFormat forma = new SimpleDateFormat("dd/MM/yyyy");
                forma.setLenient(false);
//                System.out.println("x");
                x = forma.parse(result);
                return x;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
        
    }
    public double numberManage(String msg, String note){
        Scanner s = new Scanner(System.in);
        double result;
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = Double.parseDouble(s.nextLine());
//                result = Math.round(result);
                if(result < 8 || result > 17.5)throw new Exception(note);
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    }
    
    public int userNumber(String msg){
        Scanner s = new Scanner(System.in);
        int result = 0;
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = Integer.parseInt(s.nextLine());
                if(result < 1)throw new Exception();
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    }
    
    
    public int userChoice(int numberOfChoice,String msg,String warning){
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
                System.out.println(e);
            }
        } while (true);
    }    
}
