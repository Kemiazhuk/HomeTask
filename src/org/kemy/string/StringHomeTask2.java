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
        while (i < str.length()) {
            if (str.charAt(i) == wordToChange.charAt(0)) {
                int j = 0;
                while ((j < wordToChange.length()) && (str.charAt(i + j) == wordToChange.charAt(j))) {
                    j++;
                }
                if (j == wordToChange.length()) {
                    newStr.append(wordToAdd);
                    i += wordToChange.length()-1;
                }
            } else {
                newStr.append(str.charAt(i));
            }
            i++;
        }
        System.out.println(newStr);
//        int i = 0;
//        int index = str.indexOf(wordToChange, i);
//
//        if (index != -1) {
//            while (index != -1) {
//
//                newStr.append(str, i, index);
//                newStr.append(wordToAdd);
//                i = index + wordToChange.length();
//                index = str.indexOf(wordToChange, i);
//            }
//            newStr.append(str, i, str.length());
//            System.out.println(newStr);
//        } else System.out.println(str);
    }
}
