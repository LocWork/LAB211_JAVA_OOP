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
public class Main {
    public static void main(String[] args) {
        Manager mm = new Manager();
        Validator val = new Validator();
        int choice;
        do {            
            System.out.println("======Equation Program========");
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");
            
            choice = val.userChoice(3, "Your choice: ", "Out of range", "invalid input");
            switch(choice){
                case 1: System.out.println("----Calculation------");
                        mm.getAB();
                        mm.calulateEquation();
                        mm.displayEOP();
                        mm.arr.clear();
                        break;
                case 2: System.out.println("----Calculation------");
                        mm.getABC();
                        mm.calculateQuadraticEquation();
                        mm.displayEOP();
                        mm.arr.clear();
            }
        } while (choice != 3);
    }
}
