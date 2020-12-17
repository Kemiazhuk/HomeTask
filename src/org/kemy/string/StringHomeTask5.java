package org.kemy.string;

import org.kemy.Input;

public class StringHomeTask5 {
    public static String task(String string) {

        // use this task from StringChapter2Task8

        StringBuilder newStr = new StringBuilder();
        int i = 0;
        boolean flag = false;

        while (i < string.length()) {
            if ((string.charAt(i) == ' ')) {
                flag = true;
            } else {
                if ((flag == true) && (newStr.length() > 0)) {
                    newStr.append(" ");
                }
                newStr.append(string.charAt(i));
                flag = false;
            }
            i++;

        }

        System.out.println(newStr);
        return newStr.toString();

    }
}
