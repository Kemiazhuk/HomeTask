package org.kemy.string;

import org.kemy.Input;

public class StringChapter2Task8 {
    public void task() {
        String str = Input.inputStr();
        str = StringHomeTask5.task(str); // delete extra " "
        int max = -1;
        int index = -1;
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            if (max < strArr[i].length()) {
                max = strArr[i].length();
                index = i;
            }
        }
        System.out.println(strArr[index]);
    }
}
