package org.kemy.string;

import org.kemy.Input;

public class StringHomeTask5 {
    public static String task(String string) {

        // use this task from StringChapter2Task8

        StringBuilder newStr = new StringBuilder();
        int i = 0;
        while (i < string.length()) {
            while ((i < string.length() - 1) && (string.charAt(i) == ' ') && (string.charAt(i + 1) == ' ')) {
                i++;
            }
            if ((string.charAt(i) != ' ') ||
                    ((i < string.length()-1) && (newStr.length() > 0) && (newStr.charAt(newStr.length() - 1) != ' '))) {
                newStr.append(string.charAt(i));

            }
            i++;

        }
        System.out.println(newStr);
        return newStr.toString();

    }
}
