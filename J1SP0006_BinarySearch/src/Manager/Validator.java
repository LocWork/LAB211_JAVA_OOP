/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.util.Scanner;

/**
 *
 * @author hi
 */
public class Validator {
    public int userNumber(){
        Scanner s = new Scanner(System.in);
        int result;
        do {            
            try {
                System.out.print("Enter a number: ");
                s = new Scanner(System.in);
                result = Integer.parseInt(s.nextLine());
                return result;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (true);
    }
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
    
}
