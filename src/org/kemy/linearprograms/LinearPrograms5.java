package org.kemy.linearprograms;

import org.kemy.Input;

public class LinearPrograms5 {
    public String calc(){
        Input newInput= new Input();
        System.out.println("enter time ");
        int time=newInput.inputInt();
        int hour= time / 3600;
        time = time - hour*3600;
        int min = time /60;
        time = time -min*60;
        String s=hour+" hour  "+min+" min  "+time+" sec";
        return s;
    }
}
