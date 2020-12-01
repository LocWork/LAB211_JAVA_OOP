/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.util.Scanner;

/**
 *
 * @author hi
 */
public class Student implements Comparable<Student>{
    //fields
    private String name;
    private String sClass;
    private float mark;
    
    //constructor

    public Student(String name, String sClass, float mark) {
        this.name = name;
        this.sClass = sClass;
        this.mark = mark;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
    //getter
    public String getName() {
        return name;
    }

    public String getsClass() {
        return sClass;
    }

    public float getMark() {
        return mark;
    }
    
    //method
    //nhap thong tin cho sinh vien
//    public void nhapInfo(){
//        int flag = 0;
//        Scanner s = new Scanner(System.in);
//        do {            
//            try {
//                System.out.println("Enter student name:");
//                s = new Scanner(System.in);
//                name = s.nextLine();
//                if(name.equals(""))throw new Exception("Student name must not be empty");
//            } catch (Exception e) {
//            }
//        } while (flag == 0);
//    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
