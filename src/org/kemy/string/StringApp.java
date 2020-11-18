package org.kemy.string;

import org.kemy.Input;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringApp {

    public static final String regexParagraphs = "\\n";
    public static final String regexSentences = "[\\?\\!\\.]";
    public static final String regexWords = "[A-z-']+";
    public static final String lexeme = "a";

    public void task() throws IOException {

        String str = new String(Input.inputStrFile());
        String[] strParagraphs = str.split(regexParagraphs);
        int[] index = new int[strParagraphs.length];

        for (int i = 0; i < strParagraphs.length; i++) {

            String[] sent = makeSentence(strParagraphs[i]);
            index[i] = sent.length;


            for (int j = 0; j < sent.length; j++) {
                ArrayList<String> arrWords = makeWords(sent[j]);
                System.out.println("Task point 2  " + sortList(arrWords));
                sortWordsByLexeme(arrWords);

            }
        }

        ArrayList<String> listParagraphs = new ArrayList<String>(Arrays.asList(strParagraphs));
        listParagraphs = sortParagraphsBySentences(listParagraphs);
        for (String s : listParagraphs) {
            System.out.println("Task point 1  " + s);

        }
    }

    public ArrayList<String> sortParagraphsBySentences(ArrayList<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int count1 = makeSentence(o1).length;
                int count2 = makeSentence(o2).length;
                if (count1 < count2) {
                    return 1;
                } else if (count1 > count2) {
                    return -1;
                } else return o1.compareToIgnoreCase(o2);

            }
        });
        return list;
    }

    public String[] makeSentence(String str) {
        String[] str1 = str.split(regexSentences);
        return str1;

    }


    public ArrayList<String> makeWords(String str) {
        ArrayList<String> strList = new ArrayList();
        Pattern pattern = Pattern.compile(regexWords);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            strList.add(matcher.group());
        }
        return strList;
    }

    public ArrayList sortList(ArrayList strList) {

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
        return strList;
    }

    public ArrayList<String> sortWordsByLexeme(ArrayList strList) {

        Collections.sort(strList, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                int count1 = counterLetter(o1);
                int count2 = counterLetter(o2);
                if (count1 < count2) {
                    return 1;
                } else if (count1 > count2) {
                    return -1;
                } else return o1.compareToIgnoreCase(o2);

            }
        });
        System.out.println("Task point 3  " + strList);
        return strList;
    }

    public int counterLetter(String s) {
        int counter = 0;
        Pattern pattern = Pattern.compile(lexeme);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }
}
