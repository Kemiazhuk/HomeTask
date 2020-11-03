package org.kemy.decomposition;

import org.kemy.Input;

public class Decomposition3 {
    public void squareHexagon(){
        System.out.println("Enter side of hexagon ");
        Double side = Input.inputDouble();
        Double sqare= squareTriangle(side)*6;
        System.out.println("Sqare of hexagon ="+sqare);
    }
    public double squareTriangle(double a){
        double s=0.0;
        s= Math.sqrt(3)*a*a/4;
        return s;
    }

}
