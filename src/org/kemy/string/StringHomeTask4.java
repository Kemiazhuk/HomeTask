package org.kemy.string;

import org.kemy.Input;

public class StringHomeTask4 {
    public void task() {
        System.out.println("enter string");
        String string;
        string = Input.inputStr();
        char[] ch = string.toCharArray();
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < ch.length; i++) {
            while ((ch[i] >= '0') && (ch[i] <= '9')) {
                if (i < ch.length) {
                    i++;
                } else {
                    break;
                }
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
