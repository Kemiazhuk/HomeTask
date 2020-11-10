package org.kemy.sorting;

import org.kemy.Input;

public class Sorting4 {
    public static int[] sortByInsert(int[] arr) {

//        System.out.println("Enter length array");
//        int n = Input.inputInt();
//        int arr[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = Input.inputInt();
//        }

        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            j = i-1;
            int num = arr[i];
            while ((j >= 0) && (arr[j] > num)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = num;

        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i] + "  ");
//        }
        return arr;
    }
}
