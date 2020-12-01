/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Info.Employee;
import Validation.Manager;
import Validation.Validator;

/**
 *
 * @author hi
 */
public class Run {
    public static void main(String[] args) {
        Manager mn = new Manager();
        Validator val = new Validator();
        int userChoice = 0;
        do {            
            System.out.println("=======Task Program============");
            System.out.println("1. Add Task");
            System.out.println("2. Deleted Task");
            System.out.println("3. Show Task");
            System.out.println("4. Exit");
            userChoice = val.userChoice(4, "Your choice: ", "Out of bound");
            switch(userChoice){
                case 1:
                    mn.addTask();
                    break;
                case 2:
                    mn.removeTask();
                    break;
                case 3:
                    mn.display();
                    break;
            }
        } while (userChoice != 4);
    }
}
