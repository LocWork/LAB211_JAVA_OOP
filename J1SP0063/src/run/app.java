/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import Validation.Manager;
import Validation.Validator;

/**
 *
 * @author hi
 */
public class app {
    public static void main(String[] args) {
        Manager mn = new Manager();
        String choice = "";
        Validator val = new Validator();
        do {            
            mn.newPerson();
            mn.sortPerson();
            mn.personList();
            mn.list.clear();
            choice = val.userChoice();
        } while (choice.equalsIgnoreCase("Y"));
    }
}
