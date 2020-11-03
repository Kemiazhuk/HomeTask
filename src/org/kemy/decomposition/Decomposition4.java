package org.kemy.decomposition;

import org.kemy.Compare;
import org.kemy.Input;

public class Decomposition4 {
    public void find() {
        System.out.println("Enter quantity dots ");
        int n = Input.inputInt();
        double[] x = new double[n];
        double[] y = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print(" Enter x ");
            x[i] = Input.inputDouble();
            System.out.print(" Enter y ");
            y[i] = Input.inputDouble();
            System.out.println();
        }
        double maxLength = 0.0;
        double maxLengthX1 = 0.0;
        double maxLengthY1 = 0.0;
        double maxLengthX2 = 0.0;
        double maxLengthY2 = 0.0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Compare.compareMinMaxEqual(maxLength, lengthBetweenDot(x[i], y[i], x[j], y[j]), 0.00000001) == -1) {
                    maxLength = lengthBetweenDot(x[i], y[i], x[j], y[j]);
                    maxLengthX1 = x[i];
                    maxLengthY1 = y[i];
                    maxLengthX2 = x[j];
                    maxLengthY2 = y[j];
                }
            }
        }
        System.out.println(" Max Llength between " + maxLengthX1 + " " + maxLengthY1 + " and " + maxLengthX2 + " " + maxLengthY2 + " ");
    }

    public double lengthBetweenDot(double x1, double y1, double x2, double y2) {
        double len = 0.0;
        len = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return len;
    }

}
