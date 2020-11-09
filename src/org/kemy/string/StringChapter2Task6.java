package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task6 {
    public void task() {
        String str = Input.inputStr();
        char[] ch = str.toCharArray();
        String rez = new String();
        for (int i = 0; i < ch.length; i++) {
            rez += Character.toString(ch[i]) +Character.toString(ch[i]) ;
        }
        System.out.println(rez);

    }
}
