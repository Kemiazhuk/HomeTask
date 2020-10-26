package org.kemy.cycles;

import org.kemy.Input;



public class Cycles7 {
    private boolean flag[] = new boolean[10];

    private void nums(int k) {
        while (k > 0) {
            int t = k % 10;
            k /= 10;
            flag[t] = true;
        }
    }

    private void numsPrint() {
        for (int i = 0; i < 10; i++) {
            if (flag[i] == true) {
                flag[i] = false;
                System.out.print(" " + i);
            }
        }
    }

    public void calc() {
        Input newInput = new Input();
        System.out.print("Enter number first = ");
        int first = newInput.inputInt();
        System.out.print("Enter number second = ");
        int second = newInput.inputInt();
        System.out.print("first number have numerals ");
        nums(first);
        numsPrint();
        System.out.println();
        System.out.print("second number have numerals ");
        nums(second);
        numsPrint();
    }
}
