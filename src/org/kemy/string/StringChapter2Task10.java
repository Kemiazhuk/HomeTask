package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task10 {
    public void task() {
        String str = Input.inputStr();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == '.') || (str.charAt(i) == '?') || (str.charAt(i) == '!')) {
                if ((i < str.length() - 2) && (str.charAt(i) == '.') && (str.charAt(i + 1) == '.') && ((str.charAt(i + 2) == '.'))) {
                    i += 2;
                }
                count++;
            }
        }
        System.out.println(count);
    }
}
