package org.kemy.arraysOfArrays;

import org.kemy.Input;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysOfArrays1213 {
    public void resolve() {
        System.out.println("Enter size matrix");
        int n= Input.inputInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] =(int) (Math.random()*15);
            }
        }
        for (int i = 0; i < n; i++) {
            Arrays.sort(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+ "   ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for(int k=j; k<n; k++){
                    if (arr[j][i]>arr[k][i]){
                        int t=arr[j][i];
                        arr[j][i]=arr[k][i];
                        arr[k][i]=t;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+ "   ");
            }
            System.out.println();
        }
    }
}
