package org.kemy.oneDimensional;

import org.kemy.Input;

public class OneDimensional1 {
    public int sumMultipl() {
        Input newInput = new Input();
        System.out.print("Enter N = ");
        int n = newInput.inputInt();
        System.out.print("Enter K = ");
        int k = newInput.inputInt();
        int[] arr = new int[n];
        int sum=0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter nubers = ");
            arr[i]= newInput.inputInt();
            if (arr[i]%k==0) {
                sum+=arr[i];
            }
        }

        return sum;
    }
}
