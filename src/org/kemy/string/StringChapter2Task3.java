package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task3 {
    public void task() {
        String str = Input.inputStr();
        char[] ch = str.toCharArray();
        int i = 0;
        boolean flag = true;
        while (i<ch.length-i-1) {
            if (ch[i] != ch[ch.length - i - 1]) {
                flag = false;
                break;
            }
            i++;
        }
        if (flag){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
