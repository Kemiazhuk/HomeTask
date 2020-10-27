package org.kemy.arraysOfArrays;

import org.kemy.Input;

public class ArraysOfArrays9 {
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
        int max = 0;
        int indexColumn = -1;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[j][i];
            }
            if (sum > max) {
                max = sum;
                indexColumn = i;
            }
        }
        System.out.println("max sum in column number "+(indexColumn+1));
    }
}
