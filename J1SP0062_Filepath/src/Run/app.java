/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import Validation.Manager;
import Validation.Validator;
import java.util.Scanner;

/**
 *
 * @author hi
 */
public class app {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String redo = "";
        Validator val = new Validator();
        Manager mn = new Manager();

        do {         
            mn.pathProgram();
            redo = val.userChoice();
        } while (redo.equalsIgnoreCase("Y"));
    }    
}
