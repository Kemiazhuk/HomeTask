package org.kemy.decomposition;

import org.kemy.Input;

public class Decomposition11 {
    public void task() {
        System.out.println("Enter two Numbers");
        int a1 = Input.inputInt();
        int a2 = Input.inputInt();
        int numsA1 = nums(a1);
        int numsA2 = nums(a2);
        if (numsA1 > numsA2) {
            System.out.println("first");
        } else if (numsA1 < numsA2) {
            System.out.println("second");
        } else {
            System.out.println("equally");
        }
    }

    public int nums(int num) {
        int i = 0;
        while (num != 0) {
            num /= 10;
            i++;
        }
        return i;
    }



}
