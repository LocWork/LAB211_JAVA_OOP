/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author hi
 */
public class Main {
    public static void main(String[] args) {
        Manager nm = new Manager();
        Validate val = new Validate();
        String cont = "";
        do {            
            nm.randomNumber();
            nm.display();
            nm.linearSearch();
            nm.arr.clear();
            do {                
                cont = val.getString("Do you want to enter another array (Y/N)", "invalied choice");
            } while (!cont.trim().equalsIgnoreCase("Y") && !cont.trim().equalsIgnoreCase("N"));
        } while (cont.trim().equalsIgnoreCase("Y"));
    }
}
