package org.kemy.cycles;

import org.kemy.Input;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Cycles1 {
    public BigInteger calc() {
        System.out.print("Enter number K = ");
        Input newInput = new Input();
        BigInteger k = newInput.inputBigInt();
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger i= BigInteger.valueOf(1);
        BigInteger j= BigInteger.valueOf(1);
        while (i.compareTo(k)<=0) {
            sum = sum.add(i);
            i=i.add(j);
        }
        return sum;
    }
}
