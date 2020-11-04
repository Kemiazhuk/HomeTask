package org.kemy.decomposition;

import org.kemy.Compare;
import org.kemy.Input;

public class Decomposition4 {
    public void find() {
        System.out.println("Enter quantity dots ");
        int n = Input.inputInt();
        double[][] x = new double[n][2];

        for (int i = 0; i < n; i++) {
            System.out.print(" Enter x ");
            x[i][0] = Input.inputDouble();
            System.out.print(" Enter y ");
            x[i][1] = Input.inputDouble();
            System.out.println();
        }
        double maxLength = 0.0;
        int firstId=0;
        int secondId=0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double len= lengthBetweenDot(x[i][0], x[i][1], x[j][0], x[j][1]);
                if (Compare.compare(maxLength,len) == -1) {
                    maxLength = len;
                    firstId=i;
                    secondId=j;
                }
            }
        }
        System.out.println(" Max Llength between " + x[firstId][0] + " " + x[firstId][1] + " and " + x[secondId][0] + " " +  x[secondId][1] + " ");
    }

    public double lengthBetweenDot(double x1, double y1, double x2, double y2) {
        double len = 0.0;
        len = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return len;
    }

}
