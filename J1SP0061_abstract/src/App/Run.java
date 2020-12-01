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
        String choice = "";
        Validator val = new Validator();
        do {            
            mn.calculatePA();
            mn.printPA();
            choice = val.userChoice();
        } while (choice.equalsIgnoreCase("Y"));
    }    
}
