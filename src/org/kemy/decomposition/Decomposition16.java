package org.kemy.decomposition;

import org.kemy.Input;

import java.math.BigInteger;
import java.util.ArrayList;

public class Decomposition16 {

    public void task() {
        ArrayList<Long> allNums = new ArrayList<>();
        System.out.println("Enter N - how many digits ");
        int n = Input.inputInt();
        long sum = 0;
        int item[] = new int[n];
        int oddArr[] = {1, 3, 5, 7, 9};
        allNums = combinations(allNums, oddArr, item, 0);
        for (int i = 0; i < allNums.size(); i++) {
            sum += allNums.get(i);
        }
        int count = 0;
        System.out.println("Sum = " + sum);
        while (sum != 0) {
            long num = sum % 10;
            if (num % 2 == 0) count++;
            sum /= 10;
        }
        System.out.println("Even nums in sum = " + count);
    }

    public ArrayList<Long> combinations(ArrayList<Long> allCombinations, int[] odd, int[] item, int count) {
        long num = 0;
        if (count < item.length) {
            for (int i = 0; i < odd.length; i++) {
                item[count] = odd[i];
                combinations(allCombinations, odd, item, count + 1);
            }
        } else {
            for (int i = 0; i < item.length; i++) {
                num = num * 10 + item[i];
            }
            allCombinations.add(num);
        }
        return allCombinations;
    }
}
//    public void task() {
//        ArrayList<BigInteger> allNums = new ArrayList<>();
//        System.out.println("Enter N - how many digits ");
//        int n = Input.inputInt();
//        BigInteger sum = BigInteger.valueOf(0);
//        int item[] = new int[n];
//        int oddArr[] = {1, 3, 5, 7, 9};
//        allNums = combinations(allNums, oddArr, item, 0);
//        for (int i = 0; i < allNums.size(); i++) {
//            sum = sum.add(allNums.get(i));;
//        }
//        System.out.println("Sum = " + sum);
//        int count = 0;
//
//        while (sum.compareTo(BigInteger.valueOf(0)) > 0) {
//            BigInteger num = sum.mod(BigInteger.valueOf(10));
//            if ((num.mod(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(0)))==0) count++;
//            sum =sum.divide(BigInteger.valueOf(10));
//        }
//        System.out.println("Even nums in sum = " + count);
//    }
//
//    public ArrayList<BigInteger> combinations(ArrayList<BigInteger> allCombinations, int[] odd, int[] item, int count) {
//        BigInteger num = BigInteger.valueOf(0);
//        if (count < item.length) {
//            for (int i = 0; i < odd.length; i++) {
//                item[count] = odd[i];
//                combinations(allCombinations, odd, item, count + 1);
//            }
//        } else {
//            for (int i = 0; i < item.length; i++) {
//                num = (num.multiply(BigInteger.valueOf(10))).add(BigInteger.valueOf(item[i]));
//            }
//            allCombinations.add(num);
//        }
//        return allCombinations;
//    }

