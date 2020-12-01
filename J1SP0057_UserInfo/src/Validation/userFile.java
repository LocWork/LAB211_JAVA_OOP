/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Info.User;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class userFile {
    public static void writeFile(ArrayList<User> list,String fileName){
        File f = null;
        PrintWriter w = null;
        try {
            f = new File(fileName);
            if(f.exists() && f.isFile()){
                if(list != null && !list.isEmpty()){
                    w = new PrintWriter(f);
                    for(int i = 0; i<list.size(); i++){
                        w.println(list.get(i).toString());
                        w.flush();
                    }
                    System.out.println("File has been save");
                }else{
                    System.out.println("The list is empty");
                }   
            }else{
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            try {
                if(w != null){
                    w.close();
                }
            } catch (Exception e) {
            }
        }
       
              
    }
    
    public static ArrayList<User> readFile(String fileName){
        File f = null;
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<User> list = new ArrayList();
        try {
            f = new File(fileName);
            if(f.exists() && f.isFile()){
                fr = new FileReader(f);
                br = new BufferedReader(fr);
                while(br.ready()){
                    String s = br.readLine();
                    String[] arr= s.split("\\s\\|\\s");
                    if(arr.length == 2){
                        User x = new User(arr[0].trim(),arr[1].trim());
                        list.add(x);
                    }
                }
            }else{
                throw new Exception("File not found");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            try {
                if(fr != null){
                    fr.close();
                }
                if(br != null){
                    br.close();
                }
            } catch (IOException e) {
            }
        }
        return list;
    }    
}
