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
public abstract class Shape {
    //field
    String name;

    public Shape(String name) {
        this.name = name;
    }
    
    public abstract double getP();
    public abstract double getArea();
    public abstract void getResult();
}
