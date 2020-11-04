package org.kemy.decomposition;

import org.kemy.Compare;
import org.kemy.Input;

public class Decomposition5 {
    public void secondMax() {
        System.out.print("Enter length array ");
        int n = Input.inputInt();
        System.out.print(" Enter array numbers ");
        double[] x = new double[n];
        double max2 = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < n; i++) {
            x[i] = Input.inputDouble();
        }
        double max1 = x[0];
        for (int i = 1; i < n; i++) {
            if (Compare.compare(x[i], max1) == 1) {
                if (Compare.compare(max1, max2) == 1) {
                    max2 = max1;
                }
                max1 = x[i];
            } else if ((Compare.compare(x[i], max2) == 1)&&(Compare.compare(x[i], max1) == 0)) {
                max2=x[i];
            }
        }
        if (max2!= Double.NEGATIVE_INFINITY) {
            System.out.println(max2);
        } else {
            System.out.println("No second max number");
        }
    }
}
