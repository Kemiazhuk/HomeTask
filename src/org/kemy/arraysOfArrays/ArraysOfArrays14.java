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

                int k = (int) (Math.random() * 10) % 2;
                if ((k == 1) && (arr[j][i] == 0)) {
                    arr[j][i] = k;
                    count++;
                }
                int z=0;
                if ((count < i + 1) && (j == col - 1)) {
                    while (count != i+1) {
                        if (arr[z][i]==0){
                            arr[z][i] =1;
                            count++;
                        }
                        z++;
                    }
                    break;
                }
                if ((count == i + 1) || (count == str)) {
                    break;
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
