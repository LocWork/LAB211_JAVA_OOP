/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author hi
 */
public class Main {
    public static void main(String[] args) {
        Manager manage = new Manager();
        Validation val = new Validation();
        int choice;
        do {            
            System.out.println("========= Bubble Sort program =========");
            System.out.println("1. Input Element");
            System.out.println("2. Sort Ascending");
            System.out.println("3. Sort Descending");
            System.out.println("4. Exit");
            choice = val.userChoice(4, "Please choice one option: ", "Out of range", "Invalied input");
            switch(choice){
                case 1: manage.list.clear();
                        manage.getNumber();
                        break;
                case 2: manage.ascendingSort();
                        break;
                case 3: manage.DescendingSort();
                        break;
            }
        } while (choice != 4);
    }
}
