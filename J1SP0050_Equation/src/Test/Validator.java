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
    
    public float getNumber(String msg,String note){
        Scanner s = new Scanner(System.in);
        float number;
        do {            
            try {
                System.out.print(msg);
                number = Float.parseFloat(s.nextLine());
                return number;
            } catch (NumberFormatException e) {
                System.out.println(note);
            }
        } while (true);
    }
    
    public void checker(int flag, String msg){
            if(flag == 0){
                System.out.print(msg);
            }
    }
}
