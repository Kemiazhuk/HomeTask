package org.kemy.aggregationAndComposition.text;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    private List<Word> sentences;

    public Sentence() {
    }

    public Sentence(List<Word> sentences) {
        this.sentences = sentences;
    }

    public List<Word> getSentences() {
        return sentences;
    }

    public void setSentences(List<Word> sentences) {
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        StringBuilder newStr = new StringBuilder();
        for (Word s :sentences){
            newStr.append(s.getWord()+ " ");
        }
        return newStr.toString();
    }
}

