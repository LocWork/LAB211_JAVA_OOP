/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OtherContry;

import StandardInfo.Country;
import test.Validator;

/**
 *
 * @author hi
 */
public class EastAsiaCountries extends Country{
    //fields
    private String countryTerrain;
    
    //constructor
    public EastAsiaCountries(){
        super();
        countryTerrain = "";
    }

    public EastAsiaCountries(String countryTerrain, String countryCode, String countryName, float totalArea) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }
    
    //setter

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }
    //getter

    public String getCountryTerrain() {
        return countryTerrain;
    }

    @Override
    public void display() {
        System.out.println(countryCode+"\t"+countryName+"\t"+Math.round(totalArea * 100.0f)/100.0f+"\t\t"+countryTerrain);
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Validator val = new Validator();
        countryTerrain = val.getString("Enter country terrain", "Terrain cannot be empty", "Invalid input");
    }
    
    
    


    
    
    
}
