/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Info.Student;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class Manager {
    ArrayList<Student> list = new ArrayList<>();
    
    public boolean checkName(String name){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName().equals(name)){
                return true;
            }
        }
        
        return false;
    }
    
    public void addStudent(){
        Validator val =new Validator();
        Student x = new Student(); 
        do {                
            x.inputInfo();
            if(checkName(x.getName())){
                System.out.println("There is already a student with that name");
            }
        } while (checkName(x.getName()));
        list.add(x);    
    }
    
    public void displayClassinfo(){
        DecimalFormat dft = new DecimalFormat("#.##");        
        int total = list.size();
        double typeA = calculateType(0, "A", total);
        double typeB = calculateType(0, "B", total);
        double typeC = calculateType(0, "C", total);
        double typeD = calculateType(0, "D", total);        
        System.out.println("--------Classification Info -----");
        System.out.println("Type A: "+dft.format(typeA)+"%");
        System.out.println("Type B: "+dft.format(typeB)+"%");
        System.out.println("Type C: "+dft.format(typeC)+"%");
        System.out.println("Type D: "+dft.format(typeD)+"%");
    }
    
    public double calculateType(int countType, String type,int total){
        double result;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getType().equals(type)){
                countType++;
            }
        }
        result = ((double)countType / (double)total)*100;
        return result;
    }
    
    public void display(){
        for(int i = 0; i<list.size();i++){
            System.out.println("----Student "+(i+1)+"--------");
            list.get(i).outputInfo();
        }
    }
    
}
