package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task9 {
    public void task() {
        String str = Input.inputStr();
        char[] ch = str.toCharArray();
        int countUppercase = 0;
        int countLowercase = 0;
        for (int i = 0; i < ch.length; i++) {
            if ((ch[i]>='a')&&(ch[i]<='z')) {
                countLowercase++;
            }
            if ((ch[i]>='A')&&(ch[i]<='Z')) {
                countUppercase++;
            }
        }
        System.out.println("Lowercase = "+ countLowercase + " Uppercase = "+ countUppercase);
    }
}
