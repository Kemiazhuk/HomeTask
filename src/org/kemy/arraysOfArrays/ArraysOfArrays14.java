package org.kemy.arraysOfArrays;

import org.kemy.Input;

public class ArraysOfArrays14 {
    public void resolve() {
        Input newInput = new Input();
        System.out.print("Enter size matrix m*n (m>=n) = ");
        int str = newInput.inputInt();
        int col = newInput.inputInt();
        int arr[][] = new int[str][col];
        int count = 0;
        for (int i = 0; i < col; i++) {
            count = 0;
            while (count != i + 1) {
                int k = (int) (Math.random() * str);
                if (arr[k][i] != 1) {
                    count++;
                    arr[k][i] = 1;
                }
            }
        }
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }
}

