package org.kemy.arraysOfArrays;

import org.kemy.Input;

public class ArraysOfArrays23 {
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
        int k=2;
        int p=3;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][i] + "   ");
            System.out.print(arr[k][i] + "   ");
            System.out.print(arr[i][p] + "   ");

        }


    }
}

