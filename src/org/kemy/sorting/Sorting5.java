package org.kemy.sorting;

import org.kemy.Input;

public class Sorting5 {

    public static int[] sortByShel(int arr[]) {
//        System.out.println("Enter length array");
//        int n = Input.inputInt();
//        int arr[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = Input.inputInt();
//        }
        for (int step = arr.length / 2; step > 0; step /= 2) {
            for (int i = step; i < arr.length; i++) {
                for (int j = i - step; j >= 0 && arr[j] > arr[j + step]; j -= step) {
                    int x = arr[j];
                    arr[j] = arr[j + step];
                    arr[j + step] = x;
                }
            }
        }

//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i] + "  ");
//        }
        return arr;
    }
}
