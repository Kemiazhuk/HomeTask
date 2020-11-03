package org.kemy.decomposition;

import org.kemy.Input;

public class Decomposition8 {
    public void task() {
        double[] x = new double[6];
        System.out.println("Enter array numbers");
        for (int i = 0; i < 6; i++) {
            x[i] = Input.inputDouble();
        }
        System.out.println("Enter k");
        int k = Input.inputInt();
        System.out.println("Enter m");
        int m = Input.inputInt();
        double firstSum= sumOrder(x,0,k);
        double secondSum= sumOrder(x,k,m);
        double thirdSum = sumOrder(x,m,5);

        System.out.println(firstSum + "  " + secondSum + "  "+ thirdSum);
    }

    public double sumOrder(double arr[], int x, int y) {
        double sum = 0;
        for (int i = x; i <= y; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
