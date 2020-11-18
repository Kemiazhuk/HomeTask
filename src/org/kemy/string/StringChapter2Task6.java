package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task6 {
    public void task() {
        StringBuilder str = new StringBuilder(Input.inputStr());
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i <str.length(); i++) {
            char ch =str.charAt(i);
            newStr.append(ch).append(ch);
        }
        System.out.println(newStr);

    }
}
