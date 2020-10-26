package org.kemy.oneDimensional;

import org.kemy.Input;

public class OneDimensional3 {
    public int[] calc () {
        Input newInput = new Input();
        System.out.print("Enter N = ");
        int n = newInput.inputInt();
        double [] arr = new double[n];
        int [] sum=new int[3];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter nubers = ");
            arr[i]= newInput.inputDouble();
            if (arr[i]<0) {
                sum[0]++;
            }else if (arr[i]>0) {
                sum[1]++;
            }else sum[2]++;
        }
        return sum;
    }
}
