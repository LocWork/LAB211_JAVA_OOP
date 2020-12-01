/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import Validation.Manager;
import Validation.Validator;

/**
 *
 * @author hi
 */
public class App {
    public static void main(String[] args) {
        Manager mn = new Manager();
        Validator val = new Validator();
        int choice;
        do {            
            System.out.println("====USER MANAGEMENT SYSTEM=========");
            System.out.println("1. Creat a new acount");
            System.out.println("2. Login system");
            System.out.println("3. Exit");
            mn.load();
            choice = val.userChoice(3, "Your choice: ", "Out of range", "Invalied input");
            switch(choice){
                case 1:
                    mn.newUser();
                    break;
                case 2:
                    mn.login();
                    break;
            }
        } while (choice != 3);
        mn.save();
    }
}
