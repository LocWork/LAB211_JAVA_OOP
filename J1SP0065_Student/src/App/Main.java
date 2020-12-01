/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Manager.Manager;
import Manager.Validator;
import java.util.Scanner;

/**
 *
 * @author hi
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String redo = "";
        Validator val = new Validator();
        Manager mn = new Manager();
        
        do {            
            mn.addStudent();
            redo = val.userChoice();
        } while (redo.equalsIgnoreCase("Y"));
        mn.display();
        mn.displayClassinfo();
    }
}
