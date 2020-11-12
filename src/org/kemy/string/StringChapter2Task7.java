package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task7 {
    public void task() {


        StringBuilder str = new StringBuilder(Input.inputStr());
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c != ' ') && (newStr.indexOf(String.valueOf(c)) == -1)) {
                newStr.append(c);
            }
        }
        System.out.println(newStr);
    }

}

