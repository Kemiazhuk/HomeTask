package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task2 {
    public void task() {
        String str = Input.inputStr();
        String result = str.replace("a", "ab");
        System.out.println(result);

    }
}
