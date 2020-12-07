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
        int j = 0;
        while (i < str.length()) {
            if ((j != wordToChange.length()) && (str.charAt(i) == wordToChange.charAt(j))) {
                j++;
            } else {
                if ((j != 0) && (j != wordToChange.length())) {
                    i--;
                    for (int k = 0; k < j; k++) {
                        newStr.append(wordToChange.charAt(k));
                    }
                    j = 0;
                } else {
                    newStr.append(str.charAt(i));
                }

            }
            if (j == wordToChange.length()) {
                newStr.append(wordToAdd);
                j = 0;
            }
            i++;
        }
        System.out.println(newStr);
    }
}
