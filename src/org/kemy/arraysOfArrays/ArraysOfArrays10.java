package org.kemy.arraysOfArrays;

import org.kemy.Input;

public class ArraysOfArrays10 {
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
        for (int i = 0; i < n; i++) {
            if (arr[i][i]>0){
                System.out.println(arr[i][i]+ "    ");
            }
        }
    }
}
