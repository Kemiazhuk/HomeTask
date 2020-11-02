package org.kemy.arraysOfArrays;

import org.kemy.Input;

public class ArraysOfArrays16 {
    public static int [][] makeMagicSquare(int n) {
//        while (true) {
//            System.out.println("Enter odd size magic square ");
//            n = Input.inputInt();
//            if (n % 2 == 1) {
//                break;
//            } else {
//                System.out.println("Wrong format! Try again");
//            }
//        }
        int[][] magicSquare = new int[n][n];
        int count = 2;
        magicSquare[0][n / 2] = 1;
        int i = n - 1;
        int j = n / 2 + 1;
        while (count < n * n + 1) {

            if ((i < 0) && (j != n)) {
                i = n - 1;
            } else if ((i >= 0) && (j == n)) {
                j = 0;
            } else if ((i < 0) && (j == n)) {
                i += 2;
                j--;
            }

            if ((i >= 0) && (j != n)) {
                if (magicSquare[i][j] == 0) {
                    magicSquare[i][j] = count;
                    count++;
                } else if (magicSquare[i][j] != 0) {
                    i += 2;
                    j--;
                    magicSquare[i][j] = count;
                    count++;
                }
            }
            i--;
            j++;
        }
//        for (i = 0; i < n; i++) {
//            for (j = 0; j < n; j++) {
//                System.out.print(magicSquare[i][j] + "  ");
//            }
//            System.out.println();
//        }
        return magicSquare;
    }
}
