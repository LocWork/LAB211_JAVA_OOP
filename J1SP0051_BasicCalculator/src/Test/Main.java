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
        //setup
        Manager test = new Manager();
        Validator val = new Validator();
        int choice;
        
        do {            
            System.out.println("====Calculator Program======");
            System.out.println("1.Normal Calculator");
            System.out.println("2.BMI Calculator");
            System.out.println("3.Exit");
            choice = val.userChoice(3, "Your choice: ", "Out of range", "Invalied input");
            switch(choice){
                case 1:
                        System.out.println("------Normal Calculator--------");
                        test.basicCalculator();
                        break;
                case 2: System.out.println("--------BMI Calculator---------");
                        test.BMI();
                        break;
            }
        } while (choice != 3);
    }
}
