package org.kemy.string;

import org.kemy.Input;

public class StringHomeTask5 {
    public void task() {
        System.out.println("enter string");
        String string;
        String string1;
        string1 = string = Input.inputStr();
        String twoSpace = "  ";
        while (string.indexOf(twoSpace) >= 0) {
            string = string.replaceAll(twoSpace, " ");
        }
        string = string.trim();
        System.out.println(string);

//        second solution

        string = string1;
        string = string.trim();
        char[] ch = string.toCharArray();
        int count = 0;
        String rez = new String();
        for (int i = 0; i < ch.length; i++) {
            rez = rez + ch[i];
            if (i + 1 < ch.length) {
                while ((ch[i + 1] == ' ') && (ch[i] == ' ')) {
                    i++;
                }
            }
        }
        System.out.println(rez);


    }
}
