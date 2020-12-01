/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Info;

/**
 *
 * @author hi
 */
public class Circle extends Shape{
    double pi = Math.PI;
    double radius;

    public Circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }
    
    @Override
    public double getP() {
        return radius * 2 * pi;
    }

    @Override
    public double getArea() {
        return pi * Math.pow(radius,2);
    }

    @Override
    public void getResult() {
        double p = getP();
        double area = getArea();
        System.out.println("Radius: "+radius);
        System.out.println("Area: "+area);
        System.out.println("P: "+p);
    }
    
}
