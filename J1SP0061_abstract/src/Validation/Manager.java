/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Info.Circle;
import Info.Rectangle;
import Info.Triangle;

/**
 *
 * @author hi
 */
public class Manager {
    public Rectangle rShape;
    public Circle cShape;
    public Triangle tShape;
    public void calculatePA(){
        Validator val = new Validator();
//        double rWidth = val.manageDouble("Enter Rectangle width: ", "Please input again", "Must be greater than 0");
//        double rLength = val.manageDouble("Enter Rectangle length: ", "Please input again", "Must be greater than 0");
//        double cRadius = val.manageDouble("Enter circle radius: ", "Please input again", "Must be greater than 0");
//        double a = val.manageDouble("Enter a side of the triangle: ", "Please input again", "Must be greater than 0");
//        double b = val.manageDouble("Enter b side of the triangle: ", "Please input again", "Must be greater than 0");
//        double c = val.manageDouble("Enter c side of the triangle: ", "Please input again", "Must be greater than 0");
        
        double rWidth = val.manageDouble2("Enter Rectangle width: ", "Must be greater than 0");
        double rLength = val.manageDouble2("Enter Rectangle length: ", "Must be greater than 0");
        double cRadius = val.manageDouble2("Enter circle radius: ", "Must be greater than 0");
        double a = val.manageDouble2("Enter a side of the triangle: ",  "Must be greater than 0");
        double b = val.manageDouble2("Enter b side of the triangle: ", "Must be greater than 0");
        double c = val.manageDouble2("Enter c side of the triangle: ","Must be greater than 0");    
        
        rShape = new Rectangle(rWidth,rLength,"Rectangle");
        cShape = new Circle(cRadius, "Circle");
        tShape = new Triangle(a, b, c, "Triangle");        
    }
    
    public void printPA(){
        System.out.println("-----Rectangle-----");
        rShape.getResult();
        System.out.println("-----Circle--------");
        cShape.getResult();
        System.out.println("------Triangle------");
        tShape.getResult();
    }
    
}
