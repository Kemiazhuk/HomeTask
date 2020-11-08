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

            if (checkSum(sum, f)) {
                System.out.println("Good square with size " + f);
            }
        }
    }

    public boolean checkSum(int sumNumbers, int size) {
        boolean flag=true;
        int sum3=0;
        int sum4=0;
        for (int i = 0; i < size; i++) {
            int sum1=0;
            int sum2=0;
            sum3+=matrix[i][i];
            sum4+=matrix[i][size-i-1];

            for (int j = 0; j < size; j++) {
                sum1+=matrix[i][j];
                sum2+=matrix[j][i];
            }
            if ((sum1 != sumNumbers )||(sum2 != sumNumbers )){
                flag =false;
                break;
            }
        }
        if (((sum3 != sumNumbers ))||((sum4 != sumNumbers ))){
            flag =false;
        }
        return flag;
    }

}
