package org.kemy.cycles;

import org.kemy.Input;

public class Cycles6 {
    public void calc() {
        Input newInput = new Input();
        int m = newInput.inputInt();
        int n = newInput.inputInt();
        for (int i = m; i <= n; i++) {
            System.out.println();
            System.out.print("Number = " + i + " denominator ");
            int k = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                    k = 1;
                }
            }
            if (k == 0) {
                System.out.print(" don't have ");
            }

        }
    }
}
