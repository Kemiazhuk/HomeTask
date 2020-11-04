package org.kemy.decomposition;


import org.kemy.Input;

import java.util.ArrayList;

public class Decomposition15 {
    public void task() {
        ArrayList<Integer> allNums = new ArrayList<>();
        System.out.println("Enter N - how many digits ");
        int n = Input.inputInt();
        int sum = 0;
        int item[] = new int[n];
        int oddArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        allNums = combinations(allNums, oddArr, item, 0);
        for (int i = 0; i < allNums.size(); i++) {
           System.out.println(allNums.get(i));
        }
    }

    public ArrayList<Integer> combinations(ArrayList<Integer> allCombinations, int[] odd, int[] item, int count) {
        int num = 0;
        if (count < item.length) {
            for (int i = 0; i < odd.length; i++) {
                item[count] = odd[i];
                combinations(allCombinations, odd, item, count + 1);
            }
        } else {
            if (increasing(item)) {
                for (int i = 0; i < item.length; i++) {
                    num = num * 10 + item[i];
                }
                allCombinations.add(num);
            }
        }
        return allCombinations;
    }


    public boolean increasing(int[] arr) {
        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}