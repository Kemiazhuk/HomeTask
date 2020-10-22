package org.kemy.cycles;

import java.math.BigInteger;

public class Cycles4 {
    public void calc() {
        BigInteger num = new BigInteger("1");
        for (int i = 1; i <= 200; i++) {
            BigInteger k = BigInteger.valueOf(i * i);
            num = (num.multiply(k));
        }
        System.out.println(num);
    }
}
