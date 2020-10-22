package org.kemy.branching;

import org.kemy.Input;

public class Branching4 {
    private double firstMinSide;
    private double secondMinSide;

    public void compare(double x, double y, double z) {
        double k = Math.max(x, Math.max(y, z));
        if (k == x) {
            firstMinSide = z;
            secondMinSide = y;
        } else if (k == y) {
            firstMinSide = z;
            secondMinSide = x;
        } else {
            firstMinSide = x;
            secondMinSide = y;
        }
    }

    public boolean calc() {
        Input newInput = new Input();
        System.out.print("Length hole A =");
        double a = newInput.inputDouble();
        System.out.print("Length hole B =");
        double b = newInput.inputDouble();
        System.out.print("Brick X = ");
        double x = newInput.inputDouble();
        System.out.print("Brick Y = ");
        double y = newInput.inputDouble();
        System.out.print("Brick Z = ");
        double z = newInput.inputDouble();
        compare(x, y, z);
        if (a < b) {
            double k = b;
            b = a;
            a = k;
        }                                                      // we have formula  where p>=q and a>=b
        if (firstMinSide > secondMinSide) {                  // (p <= a) && (q <= b) ||
            double q = secondMinSide;                       //  (p > a) && (b >= (2*p*q*a + (p*p-q*q)*
            secondMinSide = firstMinSide;                   //* sqrt(p*p+q*q-a*a)) / (p*p+q*q))
            firstMinSide = q;
        }

        if (((secondMinSide <= a) && (firstMinSide <= b)) ||
                ((secondMinSide > a) &&
                (b >= (2 * secondMinSide * firstMinSide * a + (secondMinSide * secondMinSide - firstMinSide * firstMinSide) *
                        Math.sqrt(secondMinSide * secondMinSide + firstMinSide * firstMinSide - a * a)) /
                        (secondMinSide * secondMinSide + firstMinSide * firstMinSide)))) {
            return true;
        } else {
            return false;
        }
    }
}
