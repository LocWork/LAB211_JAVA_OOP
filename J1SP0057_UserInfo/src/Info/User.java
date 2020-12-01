/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Info;

import Validation.Validator;

/**
 *
 * @author hi
 */
public class User {
    //Filed
    String userName;
    String userPass;
    
    //constructor
    public User(){
        
    }
    public User(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }
    //getter

    public String getUserName() {
        return userName;
    }

    public String getUserPass() {
        return userPass;
    }
    //setter

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
    
    public void inputInfo(){
        Validator val = new Validator();
        userName = val.manageString("Enter username: ", "Name must have at least 5 character and no spaces!", 5);
        userPass = val.manageString("Enter password: ", "Password must have at least 5 character and no spaces!", 6);
    }
    
    public String outputInfo(){
        return userName + userPass;
    }

    @Override
    public String toString() {
        return userName+" | "+userPass;
    }
}
