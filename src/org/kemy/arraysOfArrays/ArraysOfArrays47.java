package org.kemy.arraysOfArrays;

import org.kemy.Input;

public class ArraysOfArrays47 {
    public void resolve() {
        Input newInput = new Input();
        System.out.print("Enter N = ");
        int n = newInput.inputInt();

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
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i) {
                    arr[i][j] = i + 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (i > j) {
                    arr[i][j] = 0;
                    arr[i][n - j - 1] = 0;
                    arr[n - i - 1][j] = 0;
                    arr[n - i - 1][n - j - 1] = 0;
                } else {
                    arr[i][j] = 1;
                    arr[i][n - j - 1] = 1;
                    arr[n - i - 1][j] = 1;
                    arr[n - i - 1][n - j - 1] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();
        int count = 0;
        double arrDouble[][] = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrDouble[i][j] = Math.sin((i * i - j * j) / n);
                if (arrDouble[i][j] > 0) {
                    count++;
                }


            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrDouble[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println(count);


    }
}
