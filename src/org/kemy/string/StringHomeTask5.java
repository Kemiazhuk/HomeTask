package org.kemy.string;

import org.kemy.Input;

public class StringHomeTask5 {
    public static String task(String string) {

        // use this task from StringChapter2Task8

        StringBuilder newStr = new StringBuilder();
        int i = 0;
        while (i < string.length()) {
            if ((string.charAt(i) != ' ')||((newStr.length() !=0)&&newStr.charAt(newStr.length()-1) != ' ')) {
                newStr.append(string.charAt(i));
            }
            i++;
        }
        if (newStr.charAt(newStr.length()-1) == ' '){
            newStr.deleteCharAt(newStr.length()-1);
        }
        System.out.println(newStr);
        return newStr.toString();

    }
}
