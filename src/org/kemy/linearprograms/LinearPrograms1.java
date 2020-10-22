package org.kemy.linearprograms;

import org.kemy.Input;

public class LinearPrograms1 {
    private double answer;

    public double calc() {
        Input newInput = new Input();
        System.out.print("a=");
        double a = newInput.inputDouble();
        System.out.print("b=");
        double b = newInput.inputDouble();
        System.out.print("c=");
        double c = newInput.inputDouble();
        answer = ((a - 3) * b / 2) + c;
        return answer;
    }
}
