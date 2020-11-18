package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task9 {
    public void task() {
        String str = Input.inputStr();
        StringBuilder newStr = new StringBuilder();
        int countUppercase = 0;
        int countLowercase = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z')) {
                countLowercase++;
            }
            if ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')) {
                countUppercase++;
            }
        }
        System.out.println("Lowercase = " + countLowercase + " Uppercase = " + countUppercase);
    }
}
