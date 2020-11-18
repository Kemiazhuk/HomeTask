package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task10 {
    public void task() {
        String str = Input.inputStr();
        String [] sentences = str.split("[\\.\\?\\!]");
        System.out.println(sentences.length);
    }
}
