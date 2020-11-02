package org.kemy.oneDimensional;

import org.kemy.Input;

public class OneDimensional6 {
    public void calc() {
        Input newInput = new Input();
        System.out.print("Enter N = ");
        int n = newInput.inputInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter nubers = ");
            arr[i] = newInput.inputDouble();
        }
        boolean flag = true;
        double sum = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sum += arr[i-1];
            } else {
                flag = true;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
