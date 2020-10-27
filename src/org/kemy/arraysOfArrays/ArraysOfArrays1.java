package org.kemy.arraysOfArrays;

import org.kemy.Input;

public class ArraysOfArrays1 {
    public void resolve() {
        Input newInput = new Input();
        System.out.print("Enter N = ");
        int n = newInput.inputInt();

        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter nubers = ");
                arr[i][j] = newInput.inputInt();
            }
        }
        for (int i = 0; i < n; i += 2) {
            if (arr[i][0] > arr[i][n - 1]) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + "   ");
                }
                System.out.println();
            }


        }
    }
}

