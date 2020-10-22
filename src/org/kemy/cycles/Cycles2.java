package org.kemy.cycles;

import org.kemy.Input;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Cycles2 {
    public void calc() {
        Input newInput = new Input();
        System.out.print("Enter segment boundary A = ");
        BigDecimal a = newInput.inputBigDec();
        System.out.print("Enter segment boundary B = ");
        BigDecimal b = newInput.inputBigDec();
        System.out.print("Enter step C = ");
        double c = newInput.inputDouble();
        BigDecimal step = new BigDecimal(c);
        BigDecimal arg = new BigDecimal(2);
        DecimalFormat df= new DecimalFormat("#.####");

        while (a.compareTo(b)<=0) {
            if (a.compareTo(arg)<=0){
                System.out.println("X = "+ df.format(a) + " Y = " +df.format(a));
            } else {
                System.out.println("X = "+ df.format(a) + " Y = " + df.format(a));
            }
            a=a.add(step);
        }
    }

}
