/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author hi
 */
public class Validation {
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
    
    public int getSize(int sizeMin,int sizeMax,String msg,String warning,String note){
        Scanner s = new Scanner(System.in);
        int number;
        do {            
            try {
                System.out.print(msg);
                number = Integer.parseInt(s.nextLine());
                if(number < sizeMin || number > sizeMax){
                    System.out.println(warning);
                }else{
                    return number;
                }
            } catch (NumberFormatException e) {
                System.out.println(note);
            }
        } while (true);
    }
    public int getInt(String msg,String note){
        int result;
        Scanner s = new Scanner(System.in);
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = Integer.parseInt(s.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.out.println(note);
            }
        } while (true);
    }
}
