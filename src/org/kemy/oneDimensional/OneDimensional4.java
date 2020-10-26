package org.kemy.oneDimensional;

import org.kemy.Input;

public class OneDimensional4 {
    public void calc() {
        Input newInput = new Input();
        System.out.print("Enter N = ");
        int n = newInput.inputInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter nubers = ");
            arr[i] = newInput.inputDouble();
        }
        int indexMin=0;
        int indexMax=0;
        double min = arr[0];
        double max = arr[0];
        for (int i = 1; i < n; i++){
            if (arr[i]>max) {
                max=arr[i];
                indexMax=i;
            }
            if (arr[i]<min){
                min=arr[i];
                indexMin=i;
            }
        }
        double q=arr[indexMax];
        arr[indexMax]=arr[indexMin];
        arr[indexMin]=q;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
