package org.kemy.string;

import org.kemy.Input;

public class StringHomeTask2 {
    public void task() {
        System.out.println("enter string");
        String string, string1;
        string1 = string = Input.inputStr();
        String result = string.replace("word", "letter");
        System.out.println(result);
//        second solution
        string = string1;
        char[] ch = string.toCharArray();
        int i = 0;
        int strLen = string.length();
        while (i < strLen - 3) {
            if ((ch[i] == 'w') && (ch[i + 1] == 'o') && (ch[i + 2] == 'r') && (ch[i + 3] == 'd')) {
                string = string.substring(0, i) + "letter" + string.substring(i + 4);
                i += 6;
                strLen = string.length();
                ch = string.toCharArray();
            }
            i++;
        }
        System.out.println(string);
    }
}
