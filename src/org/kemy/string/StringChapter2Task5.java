package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task5 {
    public void task() {
        String str = Input.inputStr();
        char[] ch = str.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
