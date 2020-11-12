package org.kemy.string;

import org.kemy.Compare;
import org.kemy.Input;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringApp {

    public void task() throws IOException {
        char letter = 'a';
        String str = new String(Input.inputStrFile());
        String[] strParagraphs = str.split("\\n");
        int[] index = new int[strParagraphs.length];
        for (int i = 0; i < strParagraphs.length; i++) {
            index[i] = makeSentenceLength(strParagraphs[i]);
            String[] sent = makeSentence(strParagraphs[i]);

            for (int j = 0; j < sent.length; j++) {
                sortList(makeWords(sent[j]));
            }
            for (int j = 0; j < sent.length; j++) {
                searchLexeme(makeWords(sent[j]), letter);
            }
        }
        for (int i = 1; i < index.length; i++) {
            int j = i - 1;
            int num = index[i];
            String s = strParagraphs[i];
            while ((j >= 0) && (index[j] > num)) {
                index[j + 1] = index[j];
                strParagraphs[j + 1] = strParagraphs[j];
                j--;
            }
            index[j + 1] = num;
            strParagraphs[j + 1] = s;

        }
    }

    public int makeSentenceLength(String str) {
        String[] str1 = str.split("[\\?\\!\\.]");
        return str1.length;
    }

    public String[] makeSentence(String str) {
        String[] str1 = str.split("[\\?\\!\\.]");
        return str1;

    }

    public ArrayList<String> makeWords(String str) {
        ArrayList<String> strList = new ArrayList();
        Pattern pattern = Pattern.compile("[A-z-']+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            strList.add(matcher.group());
        }
        return strList;
    }

    public void sortList(ArrayList strList) {

        Collections.sort(strList, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else return 0;

            }
        });
        System.out.println("POINT 2  " + strList);
    }

    public ArrayList<String> searchLexeme(ArrayList strList, final char letter) {

        Collections.sort(strList, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                int count1 = counterLetter(o1, letter);
                int count2 = counterLetter(o2, letter);
                if (count1 < count2) {
                    return 1;
                } else if (count1 > count2) {
                    return -1;
                } else return o1.compareToIgnoreCase(o2);

            }
        });
        System.out.println("POINT 3  " + strList);
        return strList;
    }

    public int counterLetter(String s, char ch) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                counter++;
            }
        }
        return counter;
    }
}
