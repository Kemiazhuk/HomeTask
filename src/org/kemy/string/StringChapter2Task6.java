package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task6 {
    public void task() {
        StringBuilder str = new StringBuilder(Input.inputStr());

        for (int i = str.length()-1; i >=0; i--) {
            str.insert(i+1, str.charAt(i));
        }
        System.out.println(str);

    }
}
