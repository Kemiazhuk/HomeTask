package org.kemy.string;

import org.kemy.Input;


public class StringHomeTask1 {
    public void task() {
        System.out.println("enter quantity variables");
        int n = Input.inputInt();
        System.out.println("enter variables in camelCase");
        String[] string = new String[n];
        for (int i = 0; i < n; i++) {
            string[i] = Input.inputStr();
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            char[] ch = string[i].toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if ((ch[j] >= 'A') && (ch[j] <= 'Z')) {
                    string[i] = string[i].substring(0, j) + "_" + string[i].substring(j);
                }
            }
            string[i] = string[i].toLowerCase();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(string[i]);
        }


    }
}
