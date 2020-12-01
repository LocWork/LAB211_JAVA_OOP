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
public class Run {
    public static void main(String[] args) {
        Manager mn = new Manager();
        Validator val = new Validator();
        int choice;
        do {     
            System.out.println("=========Doctor Manager============");
            System.out.println("1. Add Doctor");
            System.out.println("2. Update Doctor");
            System.out.println("3. Delete Doctor");
            System.out.println("4. Search Doctor");
            System.out.println("5. Exit");
            choice = val.userChoice(5, "Your choice: ", "Out of range", "Invalied input");
            switch(choice){
                case 1:
                    mn.addInfo();
                    break;
                case 2:
                    mn.updateInfo();
                    break;
                case 3:
                    mn.removeInfo();
                    break;
                case 4:
//                    mn.getDoctorID("D00");
                    mn.searchInfo2();
                    break;
            }
        } while (choice != 5);
    }
}
