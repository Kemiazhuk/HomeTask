package org.kemy.cycles;

import org.kemy.Input;

public class Cycles5 {
    public void calc() {
        char symbol;
        int count=0;
        for (int i = 0; i < 128; i++) {
            symbol = (char) i;
            System.out.print(i + " - " +(char) i+ "   ");
            count++;
            if (count==11){
                count=0;
                System.out.println();
            }
        }
    }
}
