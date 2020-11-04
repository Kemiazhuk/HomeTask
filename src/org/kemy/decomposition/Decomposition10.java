package org.kemy.decomposition;

import org.kemy.Input;

import java.util.ArrayList;

public class Decomposition10 {
    public void task() {
        System.out.println("Enter number N");
        int n = Input.inputInt();
        ArrayList<Integer> numberNums = new ArrayList<Integer>();
        while (n != 0) {
            numberNums.add (n % 10);
            n /= 10;
        }
        for (int i = numberNums.size()-1; i>=0; i--) {
            System.out.print(numberNums.get(i) + "   ");
        }
    }
}
