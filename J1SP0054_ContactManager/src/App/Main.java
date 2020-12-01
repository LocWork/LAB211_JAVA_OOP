/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Validation.Manager;
import Validation.Validator;

/**
 *
 * @author hi
 */
public class Main {
    public static void main(String[] args) {
        Manager mn = new Manager();
        Validator val = new Validator();
        int choice;
        do {            
            System.out.println("1. Add a contact");
            System.out.println("2. Display all contacts");
            System.out.println("3. Delete a contact");
            System.out.println("4. Exit");
            choice = val.userChoice(1, 4, "Your choice: ", "Out of range", "Invalied input");
            switch(choice){
                case 1:
                    mn.addName();
                    break;
                case 2:
                    mn.display();
                    break;
                case 3:
                    mn.search();
                    break;
            }
        } while (choice != 4);
    }
}
