package org.kemy.decomposition;

import org.kemy.Input;

public class Decomposition13 {
    public void task() {
        System.out.println("Enter N");
        int n = Input.inputInt();
        for (int i = n; i <= 2 * n - 2; i++) {
            if (primeNumber(i) && (primeNumber(i + 2))) {
                System.out.println(i + "  " + (i + 2));
            }

        }
    }

    public static boolean primeNumber(int x) {
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
