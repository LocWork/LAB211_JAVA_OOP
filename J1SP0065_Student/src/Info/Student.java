/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Info;

import Manager.Validator;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author hi
 */
public class Student {
    
    //Fields
    String name;
    String className;
    double math;
    double physical;
    double chemistry;
    double avg ;
    String type;
    //constructor
    public Student(){
        name = "admin";
        className = "F00";
        math = 1;
        physical = 1;
        chemistry = 1;
        type = "D";
        avg = 1;
    }
    
    

    public Student(String name, String className, double math, double physical, double chemistry, double avg, String type) {
        this.name = name;
        this.className = className;
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
        this.avg = avg;
        this.type = type;
    }

    //getter

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public double getMath() {
        return math;
    }

    public double getPhysical() {
        return physical;
    }

    public double getChemistry() {
        return chemistry;
    }

    public double getAvg() {
        return avg;
    }

    public String getType() {
        return type;
    }
    //setter

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public void setPhysical(double physical) {
        this.physical = physical;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void inputInfo(){
        Validator val = new Validator();
        name = val.nameValidate("Enter studend name: ", "Invalid input");
        className = val.nameValidate("Enter class name: ", "Invalid input");
        math = val.digitValidate("Enter math score: ", "Math is greater than 0", "Math is less than 10");
        physical = val.digitValidate("Enter physical score: ", "Physical is greater than 0", "Physical is less than 10");
        chemistry = val.digitValidate("Enter chemistry score: ", "Chemistry greater than 0", "Chemistry is less than 10");
        avg = (math + physical + chemistry) / 3;
//        DecimalFormat dft = new DecimalFormat("#.##");
//        dft.setRoundingMode(RoundingMode.UP);
        if(avg > 7.5){
            type = "A";
        }else if(avg >= 6 && avg <= 7.5){
            type = "B";
        }else if(avg >= 4 && avg < 6){
            type = "C";
        }else if(avg < 4){
            type = "D";
        }
        
    }
    
        public void outputInfo(){
        DecimalFormat dft = new DecimalFormat("#.##");
//        dft.setRoundingMode(RoundingMode.UP);            
            System.out.println("Name: "+name);
            System.out.println("Class: "+className);
            System.out.println("AVG: "+dft.format(avg));
            System.out.println("Type: "+type);
        }    

    
}
