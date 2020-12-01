/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hi
 */
public class Info {
    //Field
    String number;
    String eMail;
    Date date;

    //constructor
    public Info(){
        
    }

    public Info(String number, String eMail, Date date) {
        this.number = number;
        this.eMail = eMail;
        this.date = date;
    }
    //setter

    public void setNumber(String number) {
        this.number = number;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    //getter

    public String getNumber() {
        return number;
    }

    public String geteMail() {
        return eMail;
    }

    public Date getDate() {
        return date;
    }
    
    public void inputInfo(){
        Validator val = new Validator();
        number = val.getNumber("Enter phone number: ", "Phone number must contain 10 digit");
//        eMail = val.getEmail("Enter email: ", "Invalied email pattern");
        eMail = val.getEmail2("Enter email: ", "Invalied email pattern");
        date = val.getDate2("Enter date: ");
    }
    
    public void outputInfo(){
        System.out.println("Number: "+number);
        System.out.println("Email: "+eMail);
//        //de kiem tra dieu kiem thi
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        formatter.setLenient(false);
        System.out.println("Date: "+ formatter.format(date)); //use this code  to for mate to dd/mm/YY
//         System.out.println("Date: "+ date);
    }  
    
}
