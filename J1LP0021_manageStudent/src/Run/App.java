/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import Info.Student;
import Manage.Manager;
import Manage.Validator;

/**
 *
 * @author hi
 */
public class App {
    public static void main(String[] args) {
        Validator val = new Validator();
        Manager mn = new Manager();
        int choice;
        do {            
            System.out.println("==============Student Manager================");
            System.out.println("1. Create");
            System.out.println("2. Find/Sort");
            System.out.println("3. Update/Delete");
            System.out.println("4. Report");
            System.out.println("5. Exit");
            choice = val.userNumber("Your choice: ", "Out of range", 1, 5);
            switch(choice){
                case 1:
                    mn.createNewStudent();
//                    mn.test();                      
                    break;
                case 2:
                    mn.findAndSort();
                    break;
                case 3:
                    mn.findAndUD();
                    break;
                case 4:
                    mn.dislay();
//                    mn.test();
                    break;
                    
            }  
        } while (choice != 5);
//       Manager.list.add(new Student("SE140140", "Hello a", 1, "Java"));
//        Manager.list.add(new Student("SE140140", "Hello a", 2, "Java"));
//        Manager.list.add(new Student("SE140142", "Hello b", 3, "Net"));
//        Manager.list.add(new Student("SE140140", "Hello a", 3, "Net"));
//        Manager.list.add(new Student("SE140140", "Hello a", 4, "Java"));
//        Manager.list.add(new Student("SE140222", "Hello", 4, "Java"));
//        mn.dislay();
//        mn.test();
//        mn.dislay();
//        mn.findAndSort();
//        System.out.println("----------------");
//        mn.dislay();
//        System.out.println("-------");
//        mn.findAndSort();
        
    }
}
