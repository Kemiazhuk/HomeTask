package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task7 {
    public void task() {

        String str = Input.inputStr();
        StringBuilder newStr = new StringBuilder();
        newStr.append(str);
        char[] ch = str.toCharArray();
        for (int i = 0; i < newStr.length(); i++) {
            char c = newStr.charAt(i);
            if (c != ' ') {
                for (int j = i+1; j < newStr.length(); j++) {
                    char d = newStr.charAt(j);
                    if (c == d) {
                        newStr.deleteCharAt(j);
                        j--;
                    }
                }
            } else {
                newStr.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(newStr);
    }
}
