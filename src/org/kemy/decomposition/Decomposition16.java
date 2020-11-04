package org.kemy.decomposition;

import org.kemy.Input;

import java.util.ArrayList;

public class Decomposition16 {


    public void task() {
        ArrayList<Integer> allNums = new ArrayList<>();
        System.out.println("Enter N - how many digits ");
        int n = Input.inputInt();
        int sum = 0;
        int item[] = new int[n];
        int oddArr[] = {1, 3, 5, 7, 9};
        allNums = combinations(allNums, oddArr, item, 0);
        for (int i = 0; i < allNums.size(); i++) {
            sum += allNums.get(i);
        }
        int count = 0;
        while (sum != 0) {
            int num = sum % 10;
            if (num % 2 == 0) count++;
            sum/=10;
        }
        System.out.println("Even nums in sum = "+count);
    }

    public ArrayList<Integer> combinations(ArrayList<Integer> allCombinations, int[] odd, int[] item, int count) {
        int num = 0;
        if (count < item.length) {
            for (int i = 0; i < odd.length; i++) {
                item[count] = odd[i];
                combinations(allCombinations, odd, item, count + 1);
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
