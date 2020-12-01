/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author hi
 */
public class Manager {
    
    public void basicCalculator(){
        double bNumber;
        String userOperator;
        double memory;
        Validator val = new Validator();
        
        //Initial value!
        memory = val.getUserNumber("Enter Number: ", "Invalid input");
      
        //comtinue part
        do {
            userOperator = val.getOperator("Enter Operator: ", "Please input (+, -, *, /, ^)");
            if(!userOperator.matches("=")){
                    bNumber = val.getUserNumber("Enter Number: ", "Invalid input"); 
                    memory = val.calculate(memory, userOperator, bNumber);
                    System.out.println("Memory: "+ memory);        
            }else{
                System.out.println("Result: "+memory);
            }
        } while (!userOperator.matches("="));
    }
    
    public void BMI(){
        double height;
        double weight;
        double result;
        Validator val2 = new Validator();
        
        //weight and height value
        weight = val2.getUserNumber("Enter weight(kg): ", "BMI is a digit");
        height = val2.getUserNumber("Enter height(cm): ", "BMI is a digit");
        //main calcuation
        result = val2.calculateBMI(weight, height);
        System.out.println("BMI number: "+ Math.round(result * 100.0)/100.0);
        if(result <= 19){
            System.out.println("BMI Status: Under-Standard");
        }else if(result > 19 && result <= 25){
            System.out.println("BMI Status: Standard");
        }else if(result > 25 && result <= 30){
            System.out.println("BMI Status: Overweight");
        }else if(result > 30 && result <= 40){
            System.out.println("BMI Status: Fat should be lost");
        }else if(result > 40){
            System.out.println("BMI Status: Fat should be lost immediately");
        }
        
        
    }
}
