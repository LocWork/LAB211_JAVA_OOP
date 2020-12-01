/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import Manager.Validator;
import Manager.manager;

/**
 *
 * @author hi
 */
public class App {
    public static void main(String[] args) {
        manager mn = new manager();
        Validator val = new Validator();
        String redo;
        do {            
            mn.binarySearch();
            redo = val.userChoice();
        } while (redo.equalsIgnoreCase("Y"));
    }
}
