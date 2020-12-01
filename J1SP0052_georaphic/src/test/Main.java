/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import OtherContry.EastAsiaCountries;

/**
 *
 * @author hi
 */
public class Main {
    public static void main(String[] args) {
        ManageEastAsiaCountries manage = new ManageEastAsiaCountries();
        EastAsiaCountries store = new EastAsiaCountries();
        Validator val = new Validator();
        int choice;
        String name;
        do {            
            System.out.println("\t\t\t\t\tMENU");
            System.out.println("==============================================================================");
            System.out.println("1. Input the information of 11 countries in East Asia");
            System.out.println("2. Display the information of country you've just input");
            System.out.println("3. Search the information of country by user-entered name");
            System.out.println("4. Display the information of countries sorted name in ascending order  ");
            System.out.println("5. Exit ");
            System.out.println("==============================================================================");
            choice = val.userChoice(5, "Your choice: ", "Out of range", "Invalied input");
            switch(choice){
                case 1: manage.addCountryInformation();
                        break;
                case 2: manage.getRecentlyEnteredInformation();
                        break;
                case 3: 
                        manage.searchInformationByName();
                        break;
                case 4:
                        manage.sortInformationByAscendingOrder();
                        break;
            }
        } while (choice != 5);
    }
}
