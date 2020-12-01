/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//public static final ResourceBundle getBundle(String baseName)
// I10 Local    en En
// I18 international    vi VN
//        Locale localeLanguage = new Locale(lang, country);
//        ResourceBundle src = ResourceBundle.getBundle(base,localeLanguage);

package Managed;

import java.util.Enumeration;
import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.ResourceBundle.Control.*;        
/**
 *
 * @author hi
 */


public class Manager {
    
    
    public void languageSystem(int choice){
        String lang;
        String country;
        String base = "ResourceFile/Resource";
        switch(choice){
            case 1:
                lang = "vi";
                country = "VN";
//                base = "Resource/Resource";
                break;
            default:
                lang = "en";
                country = "US";
//                base = "Resource/Resource";
                break;
        }
        Locale localeLanguage = new Locale(lang, country);
        ResourceBundle src = ResourceBundle.getBundle(base,localeLanguage);
        
        inputSystem(src);
        
        
    }
    
    public void inputSystem(ResourceBundle src){
        Validator val = new Validator();
        String number;
        String pass;
        String cap;
        String caption;
        boolean redo = true;
        
        number = val.userNumber(src.getString("msgNumber"), src.getString("blank"), src.getString("exNumber"));
        pass = val.userString(src.getString("msgString"),src.getString("blank"),src.getString("exString"));
        do {            
            caption = capchaSystem();
            System.out.println(src.getString("capcha")+caption);
            cap = val.userCapcha(src.getString("msgCapcha"), src.getString("blank"), src.getString("exCapcha"));
            if(caption.contains(cap)){
                redo = false;
            }else{
                redo = true;
            }
        } while (redo == true);
    }
    
    public String capchaSystem(){
        String alphaNumberic = "ABCDEFGHIGKLMNOBQRSTUVWSYZ1234567690";
        Random rando = new Random();
        StringBuilder build = new StringBuilder();
        int count = 0;
        while(count < 6){
            int randomNumber =  rando.nextInt(36);
            build.append(alphaNumberic.charAt(randomNumber));
            count++;
        }
        String result = build.toString();
        return result;
    }
    
   
}
