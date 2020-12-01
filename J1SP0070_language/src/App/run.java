/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Managed.Manager;
import Managed.Validator;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author hi
 */
public class run {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Manager mn = new Manager();
        Validator val = new Validator();
        int choice;
        do {            
            System.out.println("--------Login program---------");
            System.out.println("1.VietNamese");
            System.out.println("2.English");
            System.out.println("3.Exit");
//            choice = val.userChoice("Your choice: ","Out of bound",1,3, "Error");
            choice = val.userChoice("------>: ","1 ---> 3",1,3);
            switch(choice){
                case 1:
                    mn.languageSystem(choice);
                    break;
                case 2:
                    mn.languageSystem(choice);
                    break;
            }
        } while (choice != 3);
    }
}
