package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task5 {
    public void task() {
        String str = Input.inputStr();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
