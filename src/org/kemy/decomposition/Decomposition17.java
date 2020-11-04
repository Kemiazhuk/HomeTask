package org.kemy.decomposition;

import org.kemy.Input;

public class Decomposition17 {
    public void task() {
        System.out.println("Enter number");
        int n = Input.inputInt();
        int count = 0;
        while (n > 0) {
            n -= sumNum(n);
            count++;
        }
        System.out.println(count);
    }

    public int sumNum(int k) {
        int sum = 0;
        while (k != 0) {
            sum += k % 10;
            k/=10;
        }
        return sum;
    }
}
