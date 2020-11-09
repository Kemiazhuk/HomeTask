package org.kemy.sorting;

import org.kemy.Input;

import java.util.ArrayList;

public class Sorting2 {
    public  static int [] sortBySelect(int [] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Input.inputInt();
//        }
        for (int i = 0; i < arr.length - 1; i++) {
            int h = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[h] > arr[j]) {
                    h = j;
                }
            }
            int k = arr[i];
            arr[i] = arr[h];
            arr[h] = k;
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + "  ");
//        }
        return arr;
    }
}
