/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number;

import java.util.Scanner;

/**
 *
 * @author hi
 */
public class Validate {
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
    
//    int getNumber(String warning, String error){
//        Scanner s = new Scanner(System.in);
//        int number = 0;
//        do {            
//            try {
//                s = new Scanner(System.in);
//                number = Integer.parseInt(s.nextLine());
//                    return number;
//            } catch (NumberFormatException e) {
//                System.out.println(error);
//            }
//        } while (true);
//    }
    
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
