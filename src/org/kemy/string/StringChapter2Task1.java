package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task1 {
    public void task() {
        String str = Input.inputStr();
        char[] ch = str.toCharArray();
        int index = 0;
        int maxCount = 0;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            while ((i + 1 < ch.length) && (ch[i] == ' ')) {
                count++;
                i++;
            }
            if (maxCount < count) {
                maxCount = count;
                index = i - count;
            }
        }
        System.out.println("index = " + index + "  count = " + maxCount);
    }

}
