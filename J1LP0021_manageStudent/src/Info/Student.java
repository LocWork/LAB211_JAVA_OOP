/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Info;

import Manage.Validator;

/**
 *
 * @author hi
 */
public class Student implements Comparable<Student>{
    //fields
    String id;
    String name;
    int semester;
    String courseName;
    //constructor
    public Student(){
        
    }

    public Student(String id, String name, int semester, String courseName) {
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.courseName = courseName;
    }
    
    //setter

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    //getter

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }

    public String getCourseName() {
        return courseName;
    }
    
    public void inputInfo(){
        Validator val = new Validator();
        id = val.idManage("Enter id(SE|GD|AI): ", "Please follow the pattern SE|GD|AI[xxxxxx]");
        name = val.nameManage("Enter name: ", "Invalied name input");
        semester = val.userNumber("Enter semester: ", "Out of the semester range", 1, 5);
        courseName = val.courseManage("Enter course: ", "Please pick one Java,.Net,C/C++");
    }
    
    public void outputInfo(){
        System.out.println(name+"|"+courseName+"|"+semester);
    }

    @Override
    public String toString() {
        return name+"|"+courseName+"|"+semester;
    }

    @Override
    public int compareTo(Student stu) {
        if(name.compareTo(stu.name) > 0){
            return 1;
        }else if(name.compareTo(stu.name) < 0){
            return -1;
        }else{
            return 0;
        }
    }
    
    
    
    
}
