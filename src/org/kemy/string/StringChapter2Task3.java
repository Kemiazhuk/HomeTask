package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task3 {
    public void task() {
        StringBuilder str = new StringBuilder(Input.inputStr());
        StringBuilder newStr = new StringBuilder(str);
        str.reverse();
        if (str.toString().equals(newStr.toString())) {
            System.out.println("Palindrome");

        } else {
            System.out.println("Not palindrome");
        }
    }
}
