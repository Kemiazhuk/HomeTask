package org.kemy.string;

import org.kemy.Input;

public class StringHomeTask2 {
    public void task() {
        //StringBuffer
        System.out.println("enter string");
        StringBuffer newStr = new StringBuffer(Input.inputStrBuilder());
        int i = newStr.length()-1;
        while (i >= 3) {
            if ((newStr.charAt(i - 3) == 'w') && (newStr.charAt(i - 2) == 'o') && (newStr.charAt(i - 1) == 'r') && (newStr.charAt(i) == 'd')) {

                newStr.replace(i-3,i+1,"letter");
                i -= 3;
            }
            i--;
        }
        System.out.println(newStr);
    }
}
