/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Info;

import java.text.DecimalFormat;

/**
 *
 * @author hi
 */
public class Rectangle extends Shape{
    
    double x,y;

    public Rectangle(double x, double y,String name) {
        super(name);
        this.x = x;
        this.y = y;
    }
    

    
    @Override
    public double getP() {
        return 2 * (x + y);
    }

    @Override
    public double getArea(){
        return x * y;
    }

    @Override
    public void getResult() {
//        DecimalFormat df = new DecimalFormat("#.##");
        double area = getArea();
        double p = getP();
        System.out.println("Width: "+x);
        System.out.println("Height: "+y);
        System.out.println("Area: "+ area);
        System.out.println("Perameter: " + p);
    }

    
}
