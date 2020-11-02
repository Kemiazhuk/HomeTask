package org.kemy.arraysOfArrays;


public class Test16 {
    public int[][] matrix;
    public void testMagicSquare() {

        for (int f = 3; f < 100; f += 2) {
            int sum = 0;
            matrix = new int[f][f];
            matrix = ArraysOfArrays16.makeMagicSquare(f);
            for (int j = 0; j < f; j++) {
                sum += matrix[0][j];
            }
            if ((sumColums(sum, f)) && (sumString(sum, f)) && (sumDiagonal(sum, f))) {
                System.out.println("Good square with size " + f);
            }
        }
    }

    public boolean sumColums(int sumNumbers, int size) {
        boolean flag=true;
        for (int i = 0; i < size; i++) {
            int sum=0;
            for (int j = 0; j < size; j++) {
                sum+=matrix[i][j];
            }
            if (sum != sumNumbers ){
                flag =false;
                break;
            }
        }
        return flag;
    }

    public boolean sumString(int sumNumbers, int size) {
        boolean flag=true;
        for (int i = 0; i < size; i++) {
            int sum=0;
            for (int j = 0; j < size; j++) {
                sum+=matrix[j][i];
            }
            if (sum != sumNumbers ){
                flag =false;
                break;
            }
        }
        return flag;
    }

    public boolean sumDiagonal(int sumNumbers, int size) {
        boolean flag=true;
        for (int i = 0; i < 2; i++) {
            int sum=0;
            for (int j = 0; j < size; j++) {
                sum+=matrix[j][size-j-1];
            }
            if (sum != sumNumbers ){
                flag =false;
                break;
            }
        }
        return flag;
    }
}
