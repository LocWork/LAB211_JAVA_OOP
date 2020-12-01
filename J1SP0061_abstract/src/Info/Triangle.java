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
public class Triangle extends Shape{
    double x,y,z;

    public Triangle(double x, double y, double z, String name) {
        super(name);
        this.x = x;
        this.y = y;
        this.z = z;
    }
    

    @Override
    public double getP() {
        return x + y + z;
    }

    @Override
    public double getArea() {
        double p = getP()/2;
        double h = 2 * ((Math.sqrt(p*(p-x)*(p-y)*(p-z)))/x);
        return (z * h) / 2;
    }

    @Override
    public void getResult() {
       double p = getP();
       double area = getArea();
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("side a: "+x);
        System.out.println("side b: "+y);
        System.out.println("side c: " +z);
        System.out.println("Area: "+df.format(area));
        System.out.println("P: "+df.format(p));
    }
    
}
