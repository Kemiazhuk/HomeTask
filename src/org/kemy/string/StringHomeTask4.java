package org.kemy.string;

import org.kemy.Input;

public class StringHomeTask4 {
    public void task() {
        System.out.println("enter string");
        String string = Input.inputStr();
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < string.length(); i++) {
            while ((i < string.length())&&(string.charAt(i)>='0')&&(string.charAt(i)<='9')) {
                i++;
                flag = true;
            }
            if (flag) {
                count++;
            }
            flag = false;
        }
        System.out.println(count);
    }
}
