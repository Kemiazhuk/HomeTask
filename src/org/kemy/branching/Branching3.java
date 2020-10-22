package org.kemy.branching;

import org.kemy.Input;

import java.math.BigDecimal;

public class Branching3 {
    public boolean belongLine() {
        Input newInput = new Input();
        System.out.print("x1=");
        BigDecimal x1 = new BigDecimal(newInput.inputDouble());
        System.out.print("y1=");
        BigDecimal y1 = new BigDecimal(newInput.inputDouble());
        System.out.print("x2=");
        BigDecimal x2 = new BigDecimal(newInput.inputDouble());
        System.out.print("y2=");
        BigDecimal y2 = new BigDecimal(newInput.inputDouble());
        System.out.print("x3=");
        BigDecimal x3 = new BigDecimal(newInput.inputDouble());
        System.out.print("y3=");
        BigDecimal y3 = new BigDecimal(newInput.inputDouble());
        BigDecimal rez = new BigDecimal(0);
        x1 = x1.subtract(x3); // (x1-x3)
        x2 = x2.subtract(x3); // (x2-x3)
        y2 = y2.subtract(y3); // (y2-y3)
        y1 = y1.subtract(y3); // (y1-y3)
        x1 = x1.multiply(y2); // (x1 - x3) * (y2 - y3)
        x2 = x2.multiply(y1); // (x2 - x3) * (y1 - y3)
        x1 = x1.subtract(x2); // (x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)
        // Calculation formula  -  ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0)

        if (x1.compareTo(rez) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
