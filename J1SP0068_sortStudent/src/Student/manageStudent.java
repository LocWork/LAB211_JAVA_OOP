/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author hi
 */
public class manageStudent {
    ArrayList<Student> listStudent = new ArrayList();
    Mytitle utl = new Mytitle();
    void addStudent(){
        String name, classed;
        float mark;
        name = utl.getString("Enter name", "The input is invaled");
        classed = utl.getString("Enter class", "The input is invaled");
        mark = utl.getFloat("Enter mark", "Mark must be greater then 0 and less than 101", "Invalid input",0f,100f);
        listStudent.add(new Student(name, classed, mark));
    }
    
    void sortStudent(){
        Collections.sort(listStudent);
    }
    
    void display(){
        System.out.println("==========Student list================");
        for(int i = 0; i < listStudent.size(); i++){
            System.out.println("Name: "+ listStudent.get(i).getName());
            System.out.println("Class: "+ listStudent.get(i).getsClass());
            System.out.println("Mark: "+ listStudent.get(i).getMark());
        }
    }
}
