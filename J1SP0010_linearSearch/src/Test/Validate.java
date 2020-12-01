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
public class Validate {
    //basic method
    public int getNumber(String msg ,String warning, String error){
        Scanner s = new Scanner(System.in);
        int userNumber = 0;
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                userNumber = Integer.parseInt(s.nextLine());
                if(userNumber < 1){
                    System.out.println(warning);
                }else{
                    return userNumber;
                }
            } catch (NumberFormatException e) {
                System.out.println(error);
            }
        } while (true);
    }

    public int userNumber(String msg, String error){
        Scanner s = new Scanner(System.in);
        int userNumber = 0;
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                userNumber = Integer.parseInt(s.nextLine());
                return userNumber;
            } catch (NumberFormatException e) {
                System.out.println(error);
            }
        } while (true);
    }
    
    String getString(String msg, String warning){
        Scanner sc = new Scanner(System.in);
        String result = "";
        do {            
            System.out.println(msg);
            sc = new Scanner(System.in);
            result = sc.nextLine();
            if(result.trim().isEmpty()){
                System.out.println(warning);
            }
        } while (result.trim().isEmpty());
        return result;
    }
}
