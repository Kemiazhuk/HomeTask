package org.kemy.branching;

import org.kemy.Input;

public class Branching2 {

    public double solve() {
        Input newInput = new Input();
        System.out.print("a=");
        double a = newInput.inputDouble();
        System.out.print("b=");
        double b = newInput.inputDouble();
        System.out.print("c=");
        double c = newInput.inputDouble();
        System.out.print("d=");
        double d = newInput.inputDouble();
        return Math.max(Math.min(a, b),Math.min(c,d));
    }
}
