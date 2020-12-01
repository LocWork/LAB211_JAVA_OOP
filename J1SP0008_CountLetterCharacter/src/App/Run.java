/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Validate.Manager;
import Validate.Validator;
import java.util.Scanner;

/**
 *
 * @author hi
 */
//  Hello Hello world
//  

public class Run {
    public static void main(String[] args) {
        Manager mn = new Manager();
        Validator val = new Validator();
        Scanner s = new Scanner(System.in);
        String redo;
        do {            
            mn.getUserString();
            redo = val.userChoice();  
        } while (redo.equalsIgnoreCase("Y"));
    }    
}
