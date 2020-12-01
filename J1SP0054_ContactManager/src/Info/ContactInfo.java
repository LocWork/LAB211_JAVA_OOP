/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Info;

import Validation.Manager;
import Validation.Validator;

/**
 *
 * @author hi
 */
public class ContactInfo {
    //fields
    int ID;
    String fullname;
    String group;
    String adddress;
    String phone;
    String firstName;
    String LastName;
    
    //constructor

    public ContactInfo(int ID, String fullname, String group, String adddress, String phone, String firstName, String LastName) {
        this.ID = ID;
        this.fullname = fullname;
        this.group = group;
        this.adddress = adddress;
        this.phone = phone;
        this.firstName = firstName;
        this.LastName = LastName;
    }

    public ContactInfo() {
        ID = 0;
        fullname = "Text holder";
        firstName = "text";
        LastName = "text";
        phone = "1231231234";
        adddress = "text";
    }
    
    //getter

    public int getID() {
        return ID;
    }

    public String getFullname() {
        return fullname;
    }

    public String getGroup() {
        return group;
    }

    public String getAdddress() {
        return adddress;
    }

    public String getPhone() {
        return phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }
    
    //setter

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAdddress(String adddress) {
        this.adddress = adddress;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    
    //method
    public void enterInfo(int id){
        Validator val = new Validator(); 
        fullname = val.getStringWithCondition("Please enter your name: ", "Please match the pattern", "Name cannot be empty", "Invalied input", "Invalied input");
        firstName = val.getNamePos(fullname, true, "Warnning invalied name input");
        LastName = val.getNamePos(fullname, false, "Warning invalied name input");
        group = val.getString("Please enter your group: ", "Group cannot be null", "Invalied input");
        adddress = val.getString("Please enter your address: ", "Group cannot be null", "Invalied input");
        phone = val.getDigit("Please enter your phone number: ", "Phone number cannot be empty", "Please input Phone flow");
        ID = id;
    }
    
    public void displayInfo(){
        System.out.println(ID+"\t"+fullname+"\t"+firstName+"\t\t"+LastName+"\t\t"+group+"\t"+adddress+"\t"+"\t"+phone);
    }
    
}
