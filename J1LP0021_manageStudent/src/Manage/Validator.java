/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage;

import java.util.Scanner;

/**
 *
 * @author hi
 */
public class Validator {
    public String nameManage(String msg,String note){
        Scanner s = new Scanner(System.in);
        String result;
        //\\w
        String rex = "[a-zA-Z\\s]{3,20}";
//        String rex = "[\\w]{3,20}";
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
    //re use code 
    public String idManage(String msg,String note){
        Scanner s = new Scanner(System.in);
        String result;
        String rex = "(SE|GD|AI)[\\d]{6}";
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(!result.matches(rex))throw new Exception(note);
                if(result.trim().isBlank())throw new Exception("User ID Cannot be Blank");  
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    } 
    
//    public int semesterManage(String msg,String note,int min,int max){
//        Scanner s = new Scanner(System.in);
//        int result;
//        do {            
//            try {
//                System.out.print(msg);
//                s = new Scanner(System.in);
//                result = Integer.parseInt(s.nextLine());
//                if(result < min || result > max)throw  new Exception(note);
//                return result;
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        } while (true);
//    } 
    
        public String courseManage(String msg,String note){
        Scanner s = new Scanner(System.in);
        String result;
        String rex1 = "Java";
        String rex2 = ".Net";
        String rex3 = "(C\\/C\\+\\+){1}";
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
  
                if(result.equalsIgnoreCase("NET") || result.equalsIgnoreCase(".NET")){
                    result = rex2;
                }
                if(result.equalsIgnoreCase("JAVA")){
                    result = rex1;
                }
    

                if(result.trim().isBlank())throw new Exception("User Course Cannot be Blank");
                if(!result.matches(rex1) && !result.matches(rex2) && !result.matches(rex3))throw new Exception(note);
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    } 
        
    public int userNumber(String msg,String note,int min,int max){
        Scanner s = new Scanner(System.in);
        int result;
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = Integer.parseInt(s.nextLine());
                if(result < min || result > max)throw  new Exception(note);
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    } 
    
    public String userChoice(String msg, String note,String y, String n){
        Scanner s = new Scanner(System.in);
        String result;
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(result.trim().isBlank())throw  new Exception("Choice cannot be blank");
                if(!result.equalsIgnoreCase(y) && !result.equalsIgnoreCase(n))throw new Exception(note);
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    }
    
   
    
}
