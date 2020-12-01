/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Validation.Info;
import Validation.Validator;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hi
 */
public class Run {
    public static void main(String[] args) {
        Validator val = new Validator();
        Info check = new Info();
        String redo;
        do {            
            check.inputInfo();
            check.outputInfo();
            redo = val.userChoice("Do you want to check another (Y/N): ");    
        } while (redo.equalsIgnoreCase("Y"));
//        String a = "hal@gmial.com";
//        String rex = "[\\w]{3,10}[@]{1}[\\w]{3,10}.com{1}";
//        System.out.println(a.matches(rex));
    }
}
