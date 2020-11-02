package org.kemy.sorting;

import org.kemy.Input;

import java.util.ArrayList;

public class Sorting2 {
    public void sortBySelect() {
        System.out.println("Enter length array");
        int n = Input.inputInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Input.inputInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int h = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[h] > arr[j]) {
                    h = j;
                }
            }
            int k = arr[i];
            arr[i] = arr[h];
            arr[h] = k;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "  ");
        }
    }
}
