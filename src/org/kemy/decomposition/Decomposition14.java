package org.kemy.decomposition;

import org.kemy.Input;

import java.util.ArrayList;

public class Decomposition14 {
    public void task() {
        System.out.println("Enter K ");
        int k = Input.inputInt();
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 1; i < k; i++) {
            newArr = arrayNums(i);
            if (i == Math.pow(sumnNums(newArr), newArr.size())) {
                System.out.print(i + "    ");
            }
        }
    }

    public int sumnNums(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    public ArrayList<Integer> arrayNums(int num) {
        int i = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (num != 0) {
            arr.add(num % 10);
            num /= 10;
        }
        return arr;
    }
}