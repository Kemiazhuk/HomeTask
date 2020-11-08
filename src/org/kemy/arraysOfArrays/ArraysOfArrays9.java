package org.kemy.arraysOfArrays;

import org.kemy.Input;

public class ArraysOfArrays9 {
    public void resolve() {
        System.out.print("Enter quantity string ");
        int n = Input.inputInt();
        System.out.print("Enter quantity columns ");
        int m = Input.inputInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter numbers = ");
                arr[i][j] = Input.inputInt();
            }
        }
        int max = 0;
        int indexColumn = -1;
        for (int i = 0; i < m; i++) {
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
