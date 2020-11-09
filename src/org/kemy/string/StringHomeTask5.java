package org.kemy.string;

import org.kemy.Input;

public class StringHomeTask5 {
    public static String task(String string) {

        // use this task from StringChapter2Task8

        String twoSpace = "  ";
        while (string.indexOf(twoSpace) >= 0) {
            string = string.replaceAll(twoSpace, " ");
        }
        string = string.trim();
//        System.out.println(string);
        return string;
//        second solution
//
//        string = string1;
//        string = string.trim();
//        char[] ch = string.toCharArray();
//        int count = 0;
//        String rez = new String();
//        for (int i = 0; i < ch.length; i++) {
//            rez = rez + ch[i];
//            if (i + 1 < ch.length) {
//                while ((ch[i + 1] == ' ') && (ch[i] == ' ')) {
//                    i++;
//                }
//            }
//        }
//        System.out.println(rez);


    }
}
