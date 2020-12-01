/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author hi
 */
public class Manager {
    public void pathProgram(){
        Validator val = new Validator();
        String userPath = "";
        do{             
            userPath = val.userString("Enter path: ", "Blank input");            
        }while(checkPath(userPath) == false);
        Path up = Paths.get(userPath);
//        up.getFileName();
//        up.getParent();
//        up.getRoot()
        String [] arr = up.toString().split("\\\\");
        System.out.println("Disk: "+getDisk(arr));
        System.out.println("Extention: "+getExtention(arr));
        System.out.println("FileName: "+getFileName(arr));
        System.out.println("Path: "+getPath(arr));
        System.out.println("Folder: "+getFolder(arr));
        
        
       
    }
//    D:\Java\SE1406_PhanNhuLoc_LMS\reader.txt
    
    public String getPath(String [] arr){
        String path = "";
        for(int i = 0; i < arr.length-2;i++){
            path = path.concat(arr[i]+"\\");
        }
        path = path.concat(arr[arr.length-2]);
        return path;
    }
    
    public String getFolder(String [] arr){
        String path = "";
        for(int i = 1; i < arr.length-2;i++){
            path = path.concat(arr[i]+"\\");
        }
        path = path.concat(arr[arr.length-2]);
        return path;        
    }
    
    public String getDisk(String [] arr){
        return arr[0];
    }
    
    public String getExtention(String [] arr){
        String back = arr[arr.length -1];
        String[]arr2 = back.split("\\.");
        return arr2[1];
    }
    
    public String getFileName(String [] arr){
        String back = arr[arr.length -1];
        String[]arr2 = back.split("\\.");
        return arr2[0];
    }    
    
    
    public boolean checkPath(String path){
                
            try {
                File f = new File(path);
                if(!f.isFile() || !f.exists())throw new Exception();
            } catch (Exception e) {
                System.out.println("File does not exits");
                return false;
            }
            return true;                 
    }
}
