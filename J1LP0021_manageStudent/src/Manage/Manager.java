/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage;

import Info.Student;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author hi
 */
public class Manager {
    public ArrayList<Student> list = new ArrayList<>();
    public ArrayList <Student> searchList = new ArrayList<>();
    public  ArrayList <Student> searchList2 = new ArrayList<>();
    public ArrayList<Integer> courseList = new ArrayList<>();
    public ArrayList<Student> listUD = new ArrayList<>();
    
    public boolean compareID(Student x){
        for(int i = 0; i< list.size(); i++){
            if(list.get(i).getId().equals(x.getId())){
                if(!list.get(i).getName().equals(x.getName())){
                    return true;
                }else
                if(list.get(i).getName().equals(x.getName())){
                    if(list.get(i).getCourseName().equals(x.getCourseName())){
                        if(list.get(i).getSemester() == x.getSemester()){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    //Becarefull not to overide the original
    public void createNewStudent(){
        
        Validator val = new Validator();
        int count = 0;
        boolean addMore = false;
        String choice;
        do {   
            // ==> new Student each loop
            Student x = new Student();
            x.inputInfo();
            if(compareID(x)){
                System.out.println("There is aready a similer info in the list");
            }else{
                list.add(x);
                count++;
            }
        } while (count < 3);
         
        do {            
            choice = val.userChoice("Do you want to add more (Y/N): ", "Please choice Y or N","Y","N");
            if(choice.equalsIgnoreCase("Y")){
                Student y = new Student();
                do {                    
                    if(compareID(y)){
                        System.out.println("There is aready a similer info in the list");
                    }
                    y.inputInfo(); 
                   
                } while (compareID(y));
                 list.add(y);
                addMore = true;
            }else if(choice.equalsIgnoreCase("N")){
                addMore = false;
            }
        } while (addMore == true);
    }
    
    //Find and sort
    public void findAndSort(){
        if(list.isEmpty()){
            System.out.println("The list is empty");
        }else{
            int tmpSize = list.size();
            //====>Storing the original information
            Student [] a = new Student[tmpSize];
            for(int i = 0; i < tmpSize; i++){
                a[i] = list.get(i);
            }           
            //=====>Getting the student name and begin sortin
            Validator val = new Validator();
            String name;
            name = val.nameManage("Enter student name: ", "Name does not match patter //w 3-20");
            searchList = getSearchStudents(name);
            if(searchList.isEmpty()){
                System.out.println("Unable to find the student");
            }else{
                Collections.sort(searchList);
                for(int i = 0; i < searchList.size(); i++){
                    searchList.get(i).outputInfo();
                }
                //Getting grid of the search list to beable to search again
                searchList.clear();
            }    
            //return the list back to it original form
            list.clear();
            for(int i = 0; i < tmpSize; i++){
                list.add(a[i]);
            }  
        }
    }
    
    
    public ArrayList getSearchStudents(String name){
        int tmp = list.size();
        for(int i =0 ; i < tmp; i++){
              if(list.get(i).getName().equals(name)){
                  searchList.add(list.get(i));
              }else{
                  if(list.get(i).getName().contains(name)){
                      searchList.add(list.get(i));
                  }
              }
        }
        return searchList;
        
    }
    
    public Student getOneStudent(String id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId().equals(id)){
                return  list.get(i);
            }
        }
        return null;
    }
    //SE123123  java 1
    //SE123123  java 2
    
    public void getListStudent(String id){
        //clear the list to be able to redo the method
        listUD.clear();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId().equals(id)){
                listUD.add(list.get(i));
            }
        }
    }
    
    public void findAndUD(){
        Validator val = new Validator();
        String choice;
        if(list.isEmpty()){
            System.out.println("There is nobody to search!");
        }else{
            //===>Getting a student by id
            String id;
            id = val.idManage("Enter search id: ", "Please match SE|GD|AI[\\d]{6}");
            getListStudent(id);
            if(listUD.isEmpty()){
                System.out.println("There is no student with that id");
            }else{
                choice = val.userChoice("Do you want to up(U) date or deleted(D): ","Please choice U or D", "U", "D");
                if(choice.equalsIgnoreCase("U")){
                    EditStudentV2(choice);
                }else if(choice.equalsIgnoreCase("D")){
                    EditStudentV2(choice);
                }
            }
            
        }
    }
    

    public boolean compareEdit(Student x,String [] listx){
        for(int i = 0; i< listx.length; i++){
            String[]nute = listx[i].split("\\|");
                if(nute[1].equals(x.getCourseName())){
                    String s = Integer.toString(x.getSemester());
                        if(nute[2].equals(s) ){
                            return true;
                        }
            }
        }
        return false;               
    }
    
    public void infoForListHolder(String [] listHolder){
        for(int i = 0; i < listUD.size();i++){
            listHolder[i] = listUD.get(i).toString();
        }        
    }
    
    public void printUDInfo(){
        for(int i = 0; i< listUD.size(); i++){
                listUD.get(i).outputInfo();
        }        
    }
      
    
    public void EditStudentV2(String choice){
        //====>get the information to change
        Validator val = new Validator();
        String [] listHolder = new String[listUD.size()];
        infoForListHolder(listHolder);
        
        if(listUD.size() == 1){
            printUDInfo();
            Student y = listUD.get(0);
                if(choice.equalsIgnoreCase("U")){                    
//                    do {                        
                        int semester = val.userNumber("Enter new semester: ", "Out of the semester range", 1, 5);
                        String courseName = val.courseManage("Enter new course: ", "Please pick one Java,.Net,C/C++");            
                        y.setSemester(semester);
                        y.setCourseName(courseName);                           
//                    } while (compareEdit(y, listHolder));
            }else{
                Deletion(y.getId(), y.getName(), y.getSemester(), y.getCourseName());
            }
        }else{
            
            boolean redo = true;
            Student x = new Student();
            int index = 0;
            System.out.println("====PLease choice one of the information below======");
            for(int i = 0; i< listUD.size(); i++){
                listUD.get(i).outputInfo();
            }
            
            do {           
                
                int semesterMany = val.userNumber("Enter semester: ", "Out of the semester range", 1, 5);
                String courseNameMany = val.courseManage("Enter course: ", "Please pick one Java,.Net,C/C++"); 
                
                for(int i = 0; i < listUD.size(); i++){
                    if(listUD.get(i).getSemester() == semesterMany){
                        if(listUD.get(i).getCourseName().equals(courseNameMany)){
                            x = listUD.get(i);
                            redo = false;
                            index = i;
                        }
                    }
                }         
                if(redo == true){
                    System.out.println("========Please choice again=======");
                }
            } while (redo == true);
            
            
            if(choice.equalsIgnoreCase("U")){
                System.out.println("==============Enter new info====================");
                do {                    
                    int newSemester = val.userNumber("Enter new semester: ", "Out of the semester range", 1, 5);
                    String newCourseName = val.courseManage("Enter new course: ", "Please pick one Java,.Net,C/C++");            
                    x.setSemester(newSemester);
                    x.setCourseName(newCourseName); 
                    if(compareEdit(x, listHolder)){
                        System.out.println("The info already exits");
                        x.outputInfo();
                    }
//                    System.out.println(compareEdit(x, listHolder));                 
                } while (compareEdit(x, listHolder));
            }else{
                Deletion(x.getId(), x.getName(), x.getSemester(), x.getCourseName());
            }
            
        }
        
        
    }
    
    //public void deletdV2(string choice)
    public void Deletion(String code, String name, int semenster, String course){
        boolean deleted = false;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId().equals(code)){
                if(list.get(i).getName().equals(name)){
                    if(list.get(i).getSemester() == semenster){
                        if(list.get(i).getCourseName().equals(course)){
                            list.remove(i);
                            deleted = true;
                        }
                    }
                }
            }
        }
        if(deleted == true){
            System.out.println("This student has been remove.");
        }else{
            System.out.println("This student has not been remove.");
        }
    }
    
    
    public void dislay(){
        if(list.isEmpty()){
            System.out.println("There is nothing to display");
        }else{
            int tmpSize = list.size();
            //Storing the original infomation
            Student [] a = new Student[tmpSize];
            for(int i = 0; i < tmpSize; i++){
                a[i] = list.get(i);
            }            
            searchList2 = list;

            //Find the uniue student
            uniqueStudent();            
            
            
            int [] counter = countAll(a);
            for(int i = 0; i < searchList2.size(); i++){
                System.out.println(searchList2.get(i).getId()+"|"+searchList2.get(i).getName()+"|"+searchList2.get(i).getCourseName()+"|"+counter[i]);
            }  
            
            //return the list back to it original for
            searchList2.clear();
            courseList.clear();
            list.clear();
            for(int i = 0; i < tmpSize; i++){
                list.add(a[i]);
            }
        }

            
    }
 
    public void uniqueStudent(){    
        for(int i = 0; i < searchList2.size() - 1;i++){
            for(int j = i + 1; j < searchList2.size();j++){
                if(searchList2.get(i).getId().equals(searchList2.get(j).getId())){
                    if(searchList2.get(i).getName().equals(searchList2.get(j).getName())){
                        if(searchList2.get(i).getCourseName().equals(searchList2.get(j).getCourseName())){
                            searchList2.remove(j);
//                            j = i + 1;
                            j--;
                        }
                    }
                }
            }  
        }  
    }
    
    public int[] countAll(Student [] stuList){
        int tmpCountSize = stuList.length;
        int[] counter = new int[tmpCountSize];
        for(int i = 0; i < searchList2.size();i++){
            int count = 0;
            for(int j = 0; j< tmpCountSize;j++){
                if(searchList2.get(i).getId().equals(stuList[j].getId()) ){
                    if(searchList2.get(i).getName().equals(stuList[j].getName())){
                       if(searchList2.get(i).getCourseName().equals(stuList[j].getCourseName())){
                            count++;
                        }                   
                    }
                }
            }
            counter[i] = count;
        }  
        return counter;
    }
    
    public void test(){
        for(int i = 0; i< list.size(); i++){
            list.get(i).outputInfo();
        }
    }
    
    public void printOneKindOfStudent(String id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId().equals(id)){
               list.get(i).outputInfo();
            }
        }        
    }    
    
}



//    public void EditStudent(Student x){
//        String name;
//        String courseName;
//        int semester;
//        Validator val = new Validator();
//        name = val.nameManage("Enter name: ", "Invalied name input");
//        semester = val.userNumber("Enter semester: ", "Out of the semester range", 1, 5);
//        courseName = val.courseManage("Enter course: ", "Please pick one Java,.Net,C/C++" ); 
//        x.setName(name);
//        x.setSemester(semester);
//        x.setCourseName(courseName);
//    }


//    public void EditStudentV15(String choice,String id){
//        Validator val = new Validator();
//        if(listUD.size() == 1){
//            printOneKindOfStudent(id);
//            if(choice.equalsIgnoreCase("U")){
//                
//            }else{
//                
//            }
//            
//        }else{
//            System.out.println("=====Please choice the bellow======");
//            printOneKindOfStudent(id);
//        }
        
        
//    }