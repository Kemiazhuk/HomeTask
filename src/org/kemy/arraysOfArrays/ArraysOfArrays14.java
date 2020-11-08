package org.kemy.arraysOfArrays;

import org.kemy.Input;

public class ArraysOfArrays14 {
    public void resolve() {
        Input newInput = new Input();
        System.out.print("Enter size matrix m = ");
        int str = newInput.inputInt();
        System.out.print("Enter size matrix n = ");
        int col = newInput.inputInt();
        int arr[][] = new int[str][col];
        int count = 0;
        for (int i = 0; i < col; i++) {
            count = 0;
            for (int j = 0; j < str; j++) {
                if (count < i + 1) {
                    arr[j][i] = 1;
                    count++;
                }
            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < str; j++) {
                    int k = (int) (Math.random()*str);
                    int t = arr[j][i];
                    arr[j][i] = arr[k][i];
                    arr[k][i] = t;
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

