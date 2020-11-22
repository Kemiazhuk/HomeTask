package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task5 {
    public void task() {
        String str = Input.inputStr();
        int count = 0;
        int i = str.indexOf("a");
        while (i != -1) {
            count++;
            i = str.indexOf("a", i + 1);
        }
        System.out.println(count);
    }
}
