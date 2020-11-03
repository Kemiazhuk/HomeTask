package org.kemy.decomposition;

import org.kemy.Compare;
import org.kemy.Input;

public class Decomposition5 {
    public void secondMax() {
        System.out.print("Enter length array ");
        int n = Input.inputInt();
        System.out.print(" Enter array numbers ");
        double[] x = new double[n];
        double max1 = 0.0;
        double max2 = 0.0;
        for (int i = 0; i < n; i++) {
            x[i] = Input.inputDouble();
        }
        if (Compare.compareMinMaxEqual(x[0], x[1], 0.00000001) == 1) {
            max1 = x[0];
            max2 = x[1];
        } else if (Compare.compareMinMaxEqual(x[0], x[1], 0.00000001) == -1) {
            max1 = x[1];
            max2 = x[0];
        } else {
            max1 = x[0];
        }

        for (int i = 2; i < n; i++) {
            if (Compare.compareMinMaxEqual(x[i], max1, 0.00000001) > 0) {
                if (Compare.compareMinMaxEqual(max1, max2, 0.00000001) == 1) {
                    max2 = max1;
                }
                max1 = x[i];
            } else if (Compare.compareMinMaxEqual(x[i], max2, 0.00000001) == 1) {
                max2=x[i];
            }
        }
        System.out.println(max2);
    }
}
