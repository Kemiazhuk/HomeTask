package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task3 {
    public void task() {
        StringBuilder str = new StringBuilder(Input.inputStr());
        int i = 0;
        boolean flag = true;
        while (i < str.length() - i - 1) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                flag = false;
                System.out.println("Not palindrome");
                break;
            }
            i++;
        }
        if (flag) {
            System.out.println("Palindrome");
        }
    }
}
