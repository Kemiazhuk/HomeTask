package org.kemy.oneDimensional;

import org.kemy.Input;

public class OneDimensional10 {
    public void calc() {
        Input newInput = new Input();
        System.out.print("Enter length array ");
        int n = newInput.inputInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter array numbers = ");
            arr[i] = newInput.inputInt();
        }
        int[] newArr = new int[n];
        int i = 0;
        int j = 0;
        while (i != n) {
            newArr[j]=arr[i];
            j++;
            i+=2;
        }

        for (i = 0; i < n; i++) {
            System.out.print("   " + newArr[i]);
        }
    }
}
