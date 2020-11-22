package org.kemy.string;

import org.kemy.Input;

public class StringHomeTask2 {
    public void task() {

        System.out.println("enter string");
        String str = new String(Input.inputStr());
        String wordToChange = "word";
        String wordToAdd = "letter";
        StringBuffer newStr = new StringBuffer();
        int i = 0;
        int index = str.indexOf(wordToChange, i);

        if (index != -1) {
            while (index != -1) {

                newStr.append(str, i, index);
                newStr.append(wordToAdd);
                i = index + wordToChange.length();
                index = str.indexOf(wordToChange, i);
            }
            newStr.append(str, i, str.length());
            System.out.println(newStr);
        } else System.out.println(str);
    }
}
