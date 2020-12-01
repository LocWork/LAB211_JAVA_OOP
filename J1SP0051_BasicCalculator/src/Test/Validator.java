/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

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
    
    
    public double getUserNumber(String msg,String note){
        Scanner s = new Scanner(System.in);
        double number;
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                number = Double.parseDouble(s.nextLine());
                return number;
            } catch (NumberFormatException e) {
                System.out.println(note);
            }
        } while (true);
    }
    
    public String getOperator(String msg,String note){
        Scanner s = new Scanner(System.in);
        String userOperator;
        String ex = "[+\\-\\*\\/\\^\\=]{1}";
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                userOperator = s.nextLine();
                if(!userOperator.matches(ex))throw new Exception("Please input (+, -, *, /, ^)");
                return userOperator;
            } catch (Exception e) {
                System.out.println(note);
            }
        } while (true);
        
    }
    
    public double calculate(double memory,String userOperator ,double bNumber){
        double result = 0;
        double mul = 1;
        switch(userOperator){
            case "+":
                try {
                    result= memory + bNumber;
                    return result;
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case "-":
                try {
                    result = memory - bNumber;
                    return result;
                } catch (Exception e) {
                    System.out.println(e);
                }
                break; 
            case "*":
                try {
                    mul = memory * bNumber;
                    if(mul == -0){
                        mul = 0;
                    }
                    return mul;
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case "/":
                try{
                    if(bNumber != 0){
                        mul = memory / bNumber;
                        return mul;
                    }else{
                        System.out.println("Divider cannot be zero");
                        return memory;
                    }
                } catch(Exception e){
                    System.out.println(e);
                }
                break;
                
                

            case "^":
                try {
                     mul = Math.pow(memory, bNumber);
                     return mul;
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;   
        }
        return -1;
    }
    
    public double calculateBMI(double weight, double height){
        double result;
        height = height / 100;
        result = weight / (height * height);
        return result;
    }
    

    
}
