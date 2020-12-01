/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import OtherContry.EastAsiaCountries;
import StandardInfo.Country;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author hi
 */
public class ManageEastAsiaCountries {
    ArrayList<Country> arr = new ArrayList();
    ArrayList<Country> arrayLog = new ArrayList();
    
    //change code here beacause it is over due
    public boolean checkedID(String countryID){
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i)!= null && arr.get(i).getCountryCode().equals(countryID)){
                return true;
            }
        }
        return false;
    }

    public boolean checkedName(String countryName){
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i)!= null && arr.get(i).getCountryName().equals(countryName)){
                return true;
            }
        }
        return false;
    }

    
//    public void addCountryInformation(EastAsiaCountries x){
//        if(checkedID(x.getCountryCode())){
//            System.out.println("There is already a country with that CODE");
//        }else if(checkedName(x.getCountryName())){
//            System.out.println("There is already a country with that Name");
//        }else{
//            arr.add(x);
//        }
//    }
    public void addCountryInformation(){
        
        boolean flag;
        do {            
                EastAsiaCountries x = new EastAsiaCountries();
                x.inputInfo();
            if(checkedID(x.getCountryCode())){
                flag = true;
            }else if(checkedName(x.getCountryName())){
                flag = true;
            }else{
                arr.add(x);
                arrayLog.add(x);
                flag = false;
            }
        } while (flag == true);
        
    }
    
    //Need fixing
    public void getRecentlyEnteredInformation(){
        if(arr.isEmpty()){
            System.out.println("There is nothing in the array");
        }else{
            System.out.println("ID\tName\tTotal Area\tTerrain");
            arrayLog.get(arrayLog.size() -1).display();
        }
    }
    
    //need more condition
    public void searchInformationByName(){
        boolean flag = false;
        Validator val = new Validator();
        if(arr.isEmpty()){
            System.out.println("There is nothing in the array");
        }else{
            String name;
            name = val.getName("Enter the country you want to search", "Name cannot be Empty", "Invalied input");
            String [] list = name.split(" ");
            System.out.println("ID\tName\tTotal Area\tTerrain");
            for(int i =0 ; i< arr.size(); i++){                
                if(arr.get(i) != null && arr.get(i).getCountryName().contains(list[0])){
                    
                    arr.get(i).display();
                    flag = true;
                }
            }
        if(flag == false){
            System.out.println("That country does not exit");
        }
        }

    }
    
    public void sortInformationByAscendingOrder(){
        if(arr.isEmpty()){
            System.out.println("There is nothing in the array");
        }else{
            Collections.sort(arr);         
            System.out.println("ID\tName\tTotal Area\tTerrain");
            for(int i = 0; i< arr.size(); i++){
                if(arr.get(i) != null){
                    arr.get(i).display();
                }
            }
        }
    }
//    public void displayAll(){
//        if(arr.isEmpty()){
//            System.out.println("There is nothing in the array");
//        }else{
//            for(int i = 0; i< arr.size(); i++){
//                if(arr.get(i) != null){
//                    arr.get(i).display();
//                }
//            }
//        }
//    }
    
}
