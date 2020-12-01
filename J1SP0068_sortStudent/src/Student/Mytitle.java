/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.util.Scanner;

/**
 *
 * @author hi
 */
public class Mytitle {
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
    
    float getFloat(String msg, String warning,String error,float min, float max){
        Scanner sc = new Scanner(System.in);
        float result = 0f;
        int flag = 0;
        do {            
            try {
                System.out.println(msg);
                result = Float.parseFloat(sc.nextLine());
                if(result < min || result > max){
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
