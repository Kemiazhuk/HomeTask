package org.kemy.oneDimensional;

import org.kemy.Input;

public class OneDimensional8 {
    public void calc() {
        Input newInput = new Input();
        System.out.print("Enter N = ");
        int n = newInput.inputInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter nubers = ");
            arr[i] = newInput.inputInt();
        }
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]!=min){
                System.out.print(arr[i] + "  ");
            }
        }
    }
}