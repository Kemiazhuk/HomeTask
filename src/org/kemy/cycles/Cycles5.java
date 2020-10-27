package org.kemy.cycles;

import org.kemy.Input;

public class Cycles5 {
    public void calc() {
        char symbol;
        for (int i = 0; i < 128; i++) {
            symbol = (char) i;
            System.out.print(i + " - " +(char) i+ "   ");
            if (i%10==2){
                System.out.println();
            }
        }
    }
}
