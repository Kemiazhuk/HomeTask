package org.kemy.oneDimensional;

import org.kemy.Input;

public class OneDimensional5 {

    public void calc() {
        Input newInput = new Input();
        System.out.print("Enter N = ");
        int n = newInput.inputInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter nubers = ");
            arr[i] = newInput.inputInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > i) {
                System.out.print(arr[i] + "  ");
            }
        }
    }

}
