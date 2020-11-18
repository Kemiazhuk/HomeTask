package org.kemy.string;

import org.kemy.Input;

import java.util.HashSet;

public class StringChapter2Task7 {
    public void task() {


        StringBuilder str = new StringBuilder(Input.inputStr());
        StringBuilder newStr = new StringBuilder();
        HashSet<Character> symbol = new HashSet<Character>();
        symbol.add(' ');
        for (int i = 0; i < str.length(); i++) {
            if (symbol.add(str.charAt(i))) {
                 newStr.append(str.charAt(i));
            }
        }
        System.out.println(newStr);
    }

}

