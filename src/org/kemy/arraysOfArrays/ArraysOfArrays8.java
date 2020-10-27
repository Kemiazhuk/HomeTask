package org.kemy.arraysOfArrays;

import org.kemy.Input;

public class ArraysOfArrays8 {
    public void resolve() {
        Input newInput = new Input();
        System.out.print("Enter N = ");
        int n = newInput.inputInt();
        System.out.print("Enter Column number = ");
        int column1 = newInput.inputInt();
        System.out.print("Enter Column number = ");
        int column2 = newInput.inputInt();

        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    arr[i][j] = j + 1;
                } else {
                    arr[i][j] = n - j;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int k = arr[i][column1];
            arr[i][column1] = arr[i][column2];
            arr[i][column2] = k;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
