package org.kemy.oneDimensional;

import org.kemy.Input;

public class OneDimensional8 {
    public void calc() {
        Input newInput = new Input();
        System.out.print("Enter N = ");
        int n = newInput.inputInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter nubers = ");
            arr[i] = newInput.inputInt();
        }
        int min = arr[0];
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                count = 0;
            } else if (arr[i] == min) {
                count++;
            }
        }
        int[] newArr = new int[n - count];
        int i = 0;
        int j = 0;
        while (i != n) {
            if (arr[i] != min) {
                newArr[j] = arr[i];
                System.out.print(arr[i] + "  ");
                j++;
            }

            i++;
        }
    }
}