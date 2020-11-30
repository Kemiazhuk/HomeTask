package org.kemy.aggregationAndComposition.text;

import java.util.Arrays;


public class MainText {
    public static void main(String[] args) {
        Word word1 = new Word("Hello");
        Word word2 = new Word("Java");
        Word word3 =  new Word("world");

        Sentence sentence1 = new Sentence(Arrays.asList(word1,word2,word3));
        Sentence sentence2 = new Sentence(Arrays.asList(word1,word3));

        Text text= new Text(Arrays.asList(sentence1,sentence2));

        System.out.println(text.toString());
    }
}
