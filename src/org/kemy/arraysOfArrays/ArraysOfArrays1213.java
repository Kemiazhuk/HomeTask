package org.kemy.arraysOfArrays;

public class ArraysOfArrays1213 {
    public void resolve() {
        int n=5;
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] =(int) (Math.random()*15);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for(int k=j; k<n; k++){
                    if (arr[i][j]>arr[i][k]){
                        int t=arr[i][j];
                        arr[i][j]=arr[i][k];
                        arr[i][k]=t;
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
