package org.kemy.decomposition;

import org.kemy.Input;

public class Decomposition9 {
    public void task() {
        System.out.println("Enter all side");
        double x = Input.inputDouble();
        double y = Input.inputDouble();
        double z = Input.inputDouble();
        double t = Input.inputDouble();
        double gip = pifagor(x, y);
        double s = geron(x, y, gip) + geron(gip, z, t);
        System.out.println("Square = " + s);
    }

    public double pifagor(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public double geron(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
