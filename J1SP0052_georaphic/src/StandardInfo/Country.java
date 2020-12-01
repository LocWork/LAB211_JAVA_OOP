/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StandardInfo;

import test.Validator;

/**
 *
 * @author hi
 */
public class Country implements Comparable<Country>{
    //field
    protected String countryCode;
    protected String countryName;
    protected float totalArea;
    //contructor
    public Country(){
        countryCode = "Text_holder";
        countryName = "Text_holder";
        totalArea = 0f;
    }

    public Country(String countryCode, String countryName, float totalArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totalArea = totalArea;
    }
    
    //setter
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }
    //getter
    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public float getTotalArea() {
        return totalArea;
    }
    
    public void display(){
        System.out.println(countryCode+"/t"+countryName+"/t"+Math.round(totalArea));
    }
    

    
    public void inputInfo(){
        Validator val = new Validator();
        countryCode = val.getID("Enter code of country [A-Z]{1,5}:", "Code cannot be empty", "Invalid input");
        countryName = val.getName("Enter name of country:", "Name cannot be empty", "Invalid input");
        totalArea = val.getFloat("Enter total area","Area cannot be smaller than 1","Invalid input");
    }

    @Override
    public int compareTo(Country t) {
//        if(countryName.compareTo(t.countryName) > 0){
//            return 1;
//        }else if(countryName.compareTo(t.countryName) < 0){
//            return -1;
//        }else{
//            return 0;
//        }
        return countryName.compareTo(t.countryName);
    }
    
    
}
