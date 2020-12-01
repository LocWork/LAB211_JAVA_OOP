/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import static java.lang.Math.pow;
import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class Manager {
    ArrayList<Number> arr = new ArrayList<>();
    Validator val = new Validator();
    float s, s1, s2;
    float delta;
    
    //method
    
    public void getAB(){
        float number;
        do {           
            number = val.getNumber("Enter A: ", "invalied input");
            if(number == 0){
                System.out.println("A cannot be 0");
            }
        } while (number == 0);
        arr.add(new Number(number));
        
        number = val.getNumber("Enter B: ", "invalied input");
        arr.add(new Number(number));
    }
    
    public void calulateEquation(){
        s = (- arr.get(1).getNumber()) / arr.get(0).getNumber();
        System.out.println("Solution: "+s);
    }
    
    public void getABC(){
        float number;
        do {           
            number = val.getNumber("Enter A: ", "invalied input");
            if(number == 0){
                System.out.println("A cannot be 0");
            }
        } while (number == 0);
        arr.add(new Number(number));
        
        number = val.getNumber("Enter B: ", "invalied input");
        arr.add(new Number(number));
        
        number = val.getNumber("Enter C: ", "invalied input");
        arr.add(new Number(number));  
    }
    
    public void calculateQuadraticEquation(){
        delta = (float) (pow(arr.get(1).getNumber(), 2) - (4 * arr.get(0).getNumber() * arr.get(2).getNumber()));
        if(delta < 0){
            System.out.println("The equation has no solution");
        }else if(delta == 0){
            s = (-arr.get(1).getNumber()) / (2 * arr.get(0).getNumber());
            System.out.println("Solution: x1 = x2 = " + s);
        }else if(delta > 0){
            s1 = (float) ((-arr.get(1).getNumber() + Math.sqrt(delta)) / (2 * arr.get(0).getNumber()));
            s2 = (float) ((-arr.get(1).getNumber() - Math.sqrt(delta)) / (2 * arr.get(0).getNumber()));
            System.out.println("Solution: x1 = "+ s1+" x2 = "+s2);
        }
    }
    
    public void displayEOP(){
        int tmp;
        int flag = 0;
        
        //ODD NUMBER;
        System.out.print("Odd number: ");
        for(int i = 0; i < arr.size(); i++){
            
            if(arr.get(i).getNumber() % 2 != 0){
                System.out.print(arr.get(i).getNumber() + ", ");
                flag = 1;
            }
        }

        val.checker(flag, "There is no odd number");
        
        
        //EVEN NUMBER;
        System.out.println();
        System.out.print("Even number: ");
        for(int i = 0; i < arr.size(); i++){
            
            if(arr.get(i).getNumber() % 2 == 0){
                System.out.print(arr.get(i).getNumber() + ", ");
                flag = 1;
            }
        } 

        val.checker(flag, "There is no even number");
        
        
        //PERFECT SQUARE NUMBER;
        System.out.println();
        System.out.print("Perfect square number: ");
        for(int i = 0; i < arr.size(); i++){
            
            tmp = (int) Math.sqrt(arr.get(i).getNumber());
            tmp = (int) pow(tmp, 2);
            if(tmp == arr.get(i).getNumber()){
                System.out.print(arr.get(i).getNumber() + ", ");
                flag = 1;
            }
        }
        val.checker(flag, "There is no perfect square number");
        System.out.println();
    }
    
}
