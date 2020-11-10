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
        int j;
        for (int step = arr.length / 2; step > 0; step /= 2) {
            for (int i = step; i < arr.length; i++) {
                int num = arr[i];
                for (j = i; j >= step; j -= step) {
                    if (num < arr[j - step]) {
                        arr[j] = arr[j - step];
                    } else break;
                }
                arr[j] = num;
            }
        }

//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i] + "  ");
//        }
        return arr;
    }
}
