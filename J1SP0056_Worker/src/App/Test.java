/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Validate.Manager;
import Validate.Validator;

/**
 *
 * @author hi
 */
public class Test {   
    public static void main(String[] args) {
        Manager mn = new Manager();
        Manager mn2 = new Manager();
                
        Validator val = new Validator();
        int choice;
        do {            
            System.out.println("1. Add worker");
            System.out.println("2. Up salary");
            System.out.println("3. Down salary");
            //Please redo this part because it should print the up date list
            //and not the worker list
            System.out.println("4. Display Information salary(List)");
            System.out.println("5. Exit");
            choice = val.userChoice(5, "Your choice: ", "Out of range", "Invalid input");
            switch(choice){
                case 1:
                    mn.addInfo();
                    break;
                case 2:
                    mn.upSalary();
                    break;
                case 3:
                    mn.downSalary();
                    break;
                case 4:
                    mn.displayInfo();
                    break;
            }
        } while (choice != 5);
    }
}
