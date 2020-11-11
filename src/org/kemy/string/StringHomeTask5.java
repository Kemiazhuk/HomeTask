package org.kemy.string;

import org.kemy.Input;

public class StringHomeTask5 {
    public static String task(String str) {

        // use this task from StringChapter2Task8

        StringBuilder newStr = new StringBuilder(str);
        int i = newStr.length() - 1;
        while ((i >= 1)) {
            if((newStr.charAt(i) == ' ')&&(newStr.charAt(i-1) == ' ')){
                newStr.delete(i-1,i);
            }
            i--;
        }
        if(newStr.charAt(newStr.length() - 1) == ' ')  {
            newStr.delete(newStr.length() - 1,newStr.length());
        }
        if(newStr.charAt(0) == ' ')  {
            newStr.delete(0,1);
        }
        System.out.println(newStr);
        return newStr.toString();

    }
}
