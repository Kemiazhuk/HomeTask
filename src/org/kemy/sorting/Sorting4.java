package org.kemy.sorting;

import org.kemy.Input;

public class Sorting4 {
    public void sortByInsert() {
        System.out.println("Enter length array");
        int n = Input.inputInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Input.inputInt();
        }
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
                int k = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = k;
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "  ");
        }
    }
}
