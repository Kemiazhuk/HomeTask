package org.kemy.oneDimensional;

import org.kemy.Input;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class OneDimensional9 {
    public void calc() {
        System.out.print("Enter length array = ");
        int n = Input.inputInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter nubers = ");
            arr[i] = Input.inputInt();
        }
        HashMap<Integer, Integer> mapArr = new HashMap<Integer, Integer>();
        int count;
        for (int i = 0; i < n; i++) {
            count = 0;
            if (mapArr.get(arr[i]) != null) {
                count = mapArr.get(arr[i]);
                mapArr.put(arr[i], count++);
            } else {
                mapArr.put(arr[i], 1);
            }
        }
        Integer minCount = mapArr.get(arr[0]);
        Integer minNum = arr[0];
        for (int i = 0; i < n; i++) {
            if (minCount < mapArr.get(arr[i])) {
                minCount = mapArr.get(arr[i]);
                minNum = arr[i];

            } else if (minCount == mapArr.get(arr[i]) && (minNum>arr[i])) {
                minCount = mapArr.get(arr[i]);
                minNum = arr[i];
            }
        }
        System.out.println("number is " + minNum);
    }
}