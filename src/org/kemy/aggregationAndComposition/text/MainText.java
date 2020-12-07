package org.kemy.aggregationAndComposition.text;

import org.kemy.Input;

import java.util.*;


public class MainText {
    public static void main(String[] args) {
        Word word1 = new Word("Hello");
        Word word2 = new Word("Java");
        Word word3 = new Word("world.");

        Sentence sentence1 = new Sentence(Arrays.asList(word1, word2, word3));
        Sentence sentence2 = new Sentence(Arrays.asList(word1, word3));
        List<Sentence> constSent = new ArrayList<>();
        constSent.add(sentence1);
        constSent.add(sentence2);
        Text text = new Text(constSent);

        System.out.println("Enter new text to add");

        List<String> newStr = new ArrayList<>(Arrays.asList(Input.inputStr().split(" ")));
        text.addText(newStr);



    }
}
