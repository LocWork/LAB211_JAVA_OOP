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

    public String manageString(String msg, String note,int stringLenght){
        Scanner s = new Scanner(System.in);
        String result;
        String rex = "[A-Za-z0-9]{0,20}";
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = s.nextLine();
                if(result.trim().isBlank())throw new Exception(note);
                if(result.length() < stringLenght)throw new Exception();
                if(result.contains(" "))throw new Exception();
                if(!result.matches(rex))throw new Exception(note);
                return result;
            } catch (Exception e) {
                System.out.println(note);
            }
        } while (true);  
    }       
}
