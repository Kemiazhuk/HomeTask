package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task1 {
    public void task() {
        StringBuilder newStr = new StringBuilder(Input.inputStr());
        int maxCount = 0;
        int count = 1;
        int j = 0;
        int i = newStr.indexOf(" ");
        while (i != -1) {
            j = i;
            i = newStr.indexOf(" ", i + 1);
            if (j + 1 == i) {
                count++;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                }
                count = 1;
            }

        }
        System.out.println("count = " + maxCount);
    }

}
