package org.kemy.linearprograms;

import org.kemy.Input;

import java.text.DecimalFormat;

public class LinearPrograms4 {
    private String answer;

    public String calc() {
        Input newInput = new Input();
        System.out.print("a=");
        Double a = newInput.inputDouble(); ///переделать на дабл
        String k = a.toString();

        answer = k.substring(4)+"," +k.substring(0,3);
        return answer;
    }
}
