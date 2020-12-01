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
//    public int userNumber(){
//        Scanner s = new Scanner(System.in);
//        int result = 0;
//        do {            
//            try {
//                System.out.print("Enter the size: ");
//                s = new Scanner(System.in);
//                result = Integer.parseInt(s.nextLine());
//                if(result < 1)throw new Exception();
//                return result;
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        } while (true);
//    }
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
    
    int getInt(String msg, String warning,String error){
        Scanner s = new Scanner(System.in);
        int result = 0;
        do {            
            try {
                System.out.print(msg);
                s = new Scanner(System.in);
                result = Integer.parseInt(s.nextLine());
                if(result < 1 || result > 100){
                    System.out.println(warning);
                }else{
                    return result;
                }
            } catch (NumberFormatException e) {
                System.out.println(error);
            }
        } while (true);
    }    
}
