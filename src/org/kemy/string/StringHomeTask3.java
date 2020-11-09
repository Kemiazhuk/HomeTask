package org.kemy.string;

import org.kemy.Input;

public class StringHomeTask3 {
    public void task(){
        System.out.println("enter string");
        String string;
        string = Input.inputStr();
        char [] ch = string.toCharArray();
        int count=0;
        for (int i=0; i< ch.length; i++){
            if ((ch[i]>='0')&&(ch[i]<='9')){
                count++;
            }
        }
        System.out.println(count);
    }
}
