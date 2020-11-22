package org.kemy.string;

import org.kemy.Input;


public class StringHomeTask1 {
    public void task() {
        System.out.println("enter quantity variables");
        int n = Input.inputInt();
        System.out.println("enter variables in camelCase");
        StringBuilder[] string = new StringBuilder[n];
        for (int i = 0; i < n; i++) {
            string[i] = Input.inputStrBuilder();
        }

        for (int i = 0; i < n; i++) {
            int k = 0;
            StringBuilder newStr = new StringBuilder();
            for (int j = 0; j < string[i].length(); j++) {
                if ((string[i].charAt(j) >= 'A') && (string[i].charAt(j) <= 'Z')) {
                    int index = string[i].charAt(j) + 32;
                    char ch = (char) index;
                    newStr.append(string[i], k, j);
                    newStr.append("_");
                    newStr.append(ch);
                    k = j + 1;
                }
            }
            newStr.append(string[i], k, string[i].length());
            string[i] = newStr;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(string[i]);
        }


    }
}
