package org.kemy.string;

import org.kemy.Input;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHomeTask1 {
    public void task() {
        System.out.println("enter quantity variables");
        int n = Input.inputInt();
        System.out.println("enter variables in camelCase");
        String[] string = new String[n];
        for (int i=0; i<n; i++) {
            string[i] = Input.inputStr();
        }

        for (int i= 0; i<n ; i++ ){
            char[] ch = string[i].toCharArray();
        }


    }
}
