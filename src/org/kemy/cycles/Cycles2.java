package org.kemy.cycles;

import org.kemy.Input;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Cycles2 {
    public void calc() {
        Input newInput = new Input();
        System.out.print("Enter segment boundary A = ");
        double a = newInput.inputDouble();
        System.out.print("Enter segment boundary B = ");
        double b = newInput.inputDouble();
        System.out.print("Enter step C = ");
        double c = newInput.inputDouble();
        double EPSILON = 0.0000001;
        while (a - b <= EPSILON) {
            if (a-2 <= EPSILON) {
                System.out.println(EPSILON+"X = " + a + " Y = " + (-a));
            } else {
                System.out.println(EPSILON+"X = " + a + " Y = " + a);
            }
            a += c;
        }
    }

}
