package org.kemy.decomposition;

import org.kemy.Input;

public class Decomposition10 {
    public void task() {
        System.out.println("Enter number N");
        int n = Input.inputInt();
        int [] numberNums = nums(n);
        for(int i =0; i<numberNums.length; i++){
            System.out.print(numberNums[i]+ "   ");
        }
    }

    public int[] nums(int num) {
        int i = 0;
        String s = String.valueOf(num);
        int[] arr = new int[s.length()];
        while (num != 0) {
            arr[i] = num % 10;
            num /= 10;
            i++;
        }
        return arr;
    }
}
