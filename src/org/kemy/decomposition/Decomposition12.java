package org.kemy.decomposition;

import org.kemy.Input;

import java.util.ArrayList;

public class Decomposition12 {
    public void task() {
        System.out.println("Enter sum K ");
        int k = Input.inputInt();
        System.out.println("Enter num N ");
        int n = Input.inputInt();
        ArrayList<Integer> newA = new ArrayList<>();

        for (int i = n; i > 0; i--) {
            if (sumNum(i) == k) {
                newA.add(i);
            }
        }

        for (int i = newA.size()-1; i>=0; i--) {
            System.out.print(newA.get(i) + "   ");
        }
    }

    public int sumNum(int k) {
        int sum = 0;
        while (k != 0) {
            sum += k % 10;
            k /= 10;
        }
        return sum;
    }
}
