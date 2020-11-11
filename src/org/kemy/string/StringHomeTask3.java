package org.kemy.string;

import org.kemy.Input;

public class StringHomeTask3 {
    public void task(){
        System.out.println("enter string");
        String string = Input.inputStr();
        int count=0;
        for (int i=0; i< string.length(); i++){
            if ((string.charAt(i)>='0')&&(string.charAt(i)<='9')){
                count++;
            }
        }
        System.out.println(count);
    }
}
