package org.kemy.oneDimensional;

import org.kemy.Input;

public class OneDimensional7 {
    public void calc() {
        Input newInput = new Input();
        System.out.print("Enter N = ");
        int n = newInput.inputInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter nubers = ");
            arr[i] = newInput.inputDouble();
        }
    }
}