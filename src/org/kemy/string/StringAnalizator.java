package org.kemy.string;

import org.kemy.Input;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAnalizator {
    public static void task() throws IOException {
        String strXML = new String(Input.inputStrFile());

        String regexTeg = "<(.*?)>";
        searchByRegex(regexTeg, strXML);

//        String regexOpenTeg = "<([^\\/].*?[^\\/])>";
//        searchByRegex(regexOpenTeg, strXML);

//        String regexCloseTeg = "<\\/.*?>";
//        searchByRegex(regexCloseTeg, strXML);
//
//        String regexBody = "<([^\\/].*?[^\\/])>";
//        searchBody(regexBody, strXML);
//
//        String regexNoBody = "<.*?\\/>";
//        searchByRegex(regexNoBody, strXML);


    }

//    public static void searchBody(String regex, String str) {
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(str);
//        int i = 0;
//        int j = 0;
//        while (matcher.find()) {
//            String s = matcher.group(1);
//            i = str.indexOf(s, i);
//            j = str.indexOf(s, i + 1);
//
//            if (j == -1) {
//                Pattern newPattern = Pattern.compile("\\w+");
//                Matcher newMatcher = newPattern.matcher(s);
//                newMatcher.find();
//                String k = newMatcher.group();
//                j = str.indexOf(k, i + 1);
//            }
//            int len = s.length();
//            StringBuilder body = new StringBuilder(str.substring(i + len + 1, j - 2));
//            if (body.charAt(0) == '\n') {
//                body.deleteCharAt(0);
//                System.out.println(body);
//            } else {
//                System.out.println(body);
//            }
//
//        }
//    }

    public static void searchByRegex(String regex, String str) {
        ArrayList<Integer> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        int i= 0 ;
        while (matcher.find()) {
            int starIndex = matcher.start();
            int endIndex = matcher.end();
            if (str.charAt(starIndex+1) == '/') {

                System.out.println(str.substring(list.get(i-1)-1,starIndex));
                list.remove(i-1);
                i--;
            } else  if (str.charAt(endIndex-2) == '/'){
                System.out.println("teg without body " + str.substring(starIndex, endIndex));
            } else {
                list.add(matcher.end()+1);
                i++;
            }
            // list.add(str.substring(matcher.start(), matcher.end()));
        }

    }
}

