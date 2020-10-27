package org.kemy.arraysOfArrays;

import org.kemy.Input;

public class ArraysOfArrays15 {
    public void resolve() {
        Input newInput = new Input();
        System.out.print("Enter N = ");
        int n = newInput.inputInt();
        System.out.print("Enter M = ");
        int m = newInput.inputInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        int max=arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]%2!=0){
                    arr[i][j]=max;
                }
                System.out.print(arr[i][j]+ "   ");
            }
            System.out.println();
        }
    }
}
