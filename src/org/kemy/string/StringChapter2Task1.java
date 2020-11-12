package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task1 {
    public void task() {
        StringBuilder newStr = new StringBuilder(Input.inputStr());
        int maxCount = -1;
        for (int i = 0; i < newStr.length(); i++) {
            int count = 0;
            while ((i < newStr.length()) && (newStr.charAt(i) == ' ')) {
                count++;
                i++;
            }
            if (maxCount < count) {
                maxCount = count;
            }
        }
        System.out.println("count = " + maxCount);
    }

}
