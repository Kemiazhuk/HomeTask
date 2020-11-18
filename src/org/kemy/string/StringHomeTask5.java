package org.kemy.string;

import org.kemy.Input;

public class StringHomeTask5 {
    public static String task(String str) {

        // use this task from StringChapter2Task8

        StringBuilder string = new StringBuilder(str.trim());
        StringBuilder newStr = new StringBuilder();
        int i = 0;

        while (i < string.length()) {
            if ((string.charAt(i) != ' ')) {
                newStr.append(string.charAt(i));

            } else if (string.charAt(i - 1) != ' ') {
                newStr.append(string.charAt(i));
            }
            i++;
        }
        System.out.println(newStr);
        return newStr.toString();

    }

    //solution 2

    public static String task2(String str) {

        // use this task from StringChapter2Task8

        StringBuilder string = new StringBuilder(str.trim());
        StringBuilder newStr = new StringBuilder();
        int j = 0;
        int i = string.indexOf(" ");
        while (i != -1) {
            if (j + 1 < i) {
                newStr.append(string.substring(j, i));
            }
            j = i;
            i = string.indexOf(" ", i + 1);
        }
        newStr.append(string.substring(j, string.length()));
        System.out.println(newStr);
        return newStr.toString();

    }
}
