package org.kemy.arraysOfArrays;

import org.kemy.Input;

public class ArraysOfArrays14 {
    public void resolve() {
        Input newInput = new Input();
        System.out.print("Enter N = ");
        int n = newInput.inputInt();
        System.out.print("Enter M = ");
        int m = newInput.inputInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i <= j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }


    }
}
