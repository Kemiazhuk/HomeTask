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
        allNums = combinations(allNums, item, 0,1);
        for (int i = 0; i < allNums.size(); i++) {
           System.out.println(allNums.get(i));
        }
    }
    public ArrayList<Integer> combinations(ArrayList<Integer> allCombinations, int[] item, int count, int start) {
        int num = 0;
        if (count < item.length) {
            for (int i = start; i < 10; i++) {
                item[count] = i;
                combinations(allCombinations, item, count + 1, i+1);
            }
        } else {
                for (int i = 0; i < item.length; i++) {
                    num = num * 10 + item[i];
                }
                allCombinations.add(num);
        }
        return allCombinations;
    }

}