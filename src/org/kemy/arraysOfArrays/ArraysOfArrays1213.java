package org.kemy.arraysOfArrays;

import org.kemy.Input;

import java.util.Arrays;
import java.util.Collections;

public class ArraysOfArrays1213 {
    public void resolve() {
        System.out.println("Enter size matrix");
        int n= Input.inputInt();
        Integer arr[][] = new Integer[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] =(int) (Math.random()*15);
            }
        }

        for (int i = 0; i < n; i++) {
            Arrays.sort(arr[i]);
        }
        System.out.println("sort string ascending");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+ "   ");
            }
            System.out.println();
        }

        System.out.println("sort string descending");
        for (int i = 0; i < n; i++) {
            Arrays.sort(arr[i], Collections.reverseOrder());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+ "   ");
            }
            System.out.println();
        }

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
        System.out.println("sort columns ascending");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+ "   ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for(int k=j; k<n; k++){
                    if (arr[j][i]<arr[k][i]){
                        int t=arr[j][i];
                        arr[j][i]=arr[k][i];
                        arr[k][i]=t;
                    }
                }
            }
        }
        System.out.println("sort columns descending");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+ "   ");
            }
            System.out.println();
        }
    }
}
