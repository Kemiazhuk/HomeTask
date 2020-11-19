package org.kemy.string;

import org.kemy.Input;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAnalizator {
    public static void task() throws IOException {
        String strXML = new String(Input.inputStrFile());

        String regexOpenTeg = "<[^\\/].*?[^\\/]>";
        searchByRegex(regexOpenTeg, strXML);

        String regexCloseTeg = "<\\/.*?>";
        searchByRegex(regexCloseTeg, strXML);

        String regexBody= "(<[^\\/].*?>)(.+?)(<\\/.*?>)";
        searchBody(regexBody, strXML);

    }

    public static  void searchBody(String regex, String str){
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group(2));
        }
        System.out.println(list.toString());
    }

    public static void searchByRegex(String regex, String str) {
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(str.substring(matcher.start(), matcher.end()));
        }
        System.out.println(list.toString());
    }
}

