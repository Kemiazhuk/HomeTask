package org.kemy.branching;

import org.kemy.Input;

public class Branching5 {
    public double calc() {
        Input newInput = new Input();
        System.out.print("X =");
        double x = newInput.inputDouble();
        if (x > 3) {
            return (1 / (Math.pow(x, 3) + 6));
        } else {
            return (Math.pow(x, 2) - 3 * x + 9);
        }
    }
}
