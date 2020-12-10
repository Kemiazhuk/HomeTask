package org.kemy.aggregationAndComposition.text;

import java.util.ArrayList;
import java.util.List;

public class Text {

    private List<Sentence> text;
    private String title;

    public Text(List<Sentence> text, String title) {
        this.text = text;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<Sentence> getText() {
        return text;
    }

    public void setText(List<Sentence> text) {
        this.text = text;
    }


    public void splitByWord(String strings) {

        String[] strSplit = strings.split(" ");
        List<Word> newWordList = new ArrayList<>();
        for (String w : strSplit) {
            newWordList.add(new Word(w));
        }
        addWordsToSentenceToText(newWordList);
    }

    public void addWordsToSentenceToText(List<Word> listWords) {

        Sentence newSentence = new Sentence();
        newSentence.setSentences(listWords);
        text.add(newSentence);
    }

    @Override
    public String toString() {
        StringBuilder newStr = new StringBuilder();
        for (Sentence s : text) {
            newStr.append(s);
        }
        return newStr.toString();
    }
}
