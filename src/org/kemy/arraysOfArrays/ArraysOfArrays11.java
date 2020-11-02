package org.kemy.arraysOfArrays;

import org.kemy.Input;

public class ArraysOfArrays11 {
    public void resolve() {
        int arr[][] = new int[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                arr[i][j] =(int) (Math.random()*16);
            }
        }
        int c[] = new int[10];
        for (int i = 0; i < 10; i++) {
            int count=0;
            for (int j = 0; j < 20; j++) {
                if (arr[i][j]==5){
                    count++;
                }
                System.out.print(arr[i][j]+ "   ");
            }
            if (count>=3){
                c[i]=1;
            }
            System.out.println();
        }
        for (int i=0; i<10; i++){
            if(c[i]==1){
                System.out.println("Number String = "+i);
            }
        }
    }
}
