package org.kemy.string;

import org.kemy.Input;

public class StringHomeTask2 {
    public void task() {
        System.out.println("enter string");
        String string = Input.inputStr();
        StringBuilder newStr = new StringBuilder(string);
        char[] ch = string.toCharArray();
        int i = string.length()-1;
        while (i >= 3) {
            if ((ch[i - 3] == 'w') && (ch[i - 2] == 'o') && (ch[i - 1] == 'r') && (ch[i] == 'd')) {
                newStr.replace(i-3,i+1,"letter");
                i -= 3;
            }
            i--;
        }
        System.out.println(newStr);
    }
}
