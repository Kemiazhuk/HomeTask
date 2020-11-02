package org.kemy.sorting;

import org.kemy.Input;

public class Sorting3 {
    public void sortByChange() {
        System.out.println("Enter length array");
        int n = Input.inputInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Input.inputInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "  ");
        }
    }
}