package org.kemy.cycles;

import org.kemy.Input;

public class Cycles7 {

    private boolean[] nums(int k) {
        boolean flag[] = new boolean[10];
        while (k > 0) {
            int t = k % 10;
            k /= 10;
            flag[t] = true;
        }
        return flag;
    }

    public void calc() {
        Input newInput = new Input();
        System.out.print("Enter number first = ");
        int first = newInput.inputInt();
        System.out.print("Enter number second = ");
        int second = newInput.inputInt();
        boolean[] firstBoll = nums(first);
        boolean[] secondBoll = nums(second);
        System.out.print("The same numerals is  ");
        for (int i = 0; i < 10; i++) {
            if ((firstBoll[i])&&(secondBoll[i])) {
                System.out.print(i + "  ");
            }
        }

    }
}
