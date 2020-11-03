package org.kemy.decomposition;

import org.kemy.Input;
                                                        //maybe this task has the wrong condition
public class Decomposition14 {
    public void task() {
        System.out.println("Enter K ");
        int k = Input.inputInt();
        for (int i = 1; i < k; i++) {
            if (i ==  Math.pow(sumnNums(arrayNums(i)),countNums(i))){
                System.out.print (i+ "    " );
            }
        }
    }

    public int countNums(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public int sumnNums(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public int[] arrayNums(int num) {
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
