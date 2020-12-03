package org.kemy.aggregationAndComposition.text;

import java.util.ArrayList;
import java.util.List;

public class Text {

    private List<Sentence> text;

    public Text(List<Sentence> text) {
        this.text = text;
    }

    public List<Sentence> getText() {
        return text;
    }

    public void setText(List<Sentence> text) {
        this.text = text;
    }


    public void addText(List<String> newStr) {
        List<Word> newWordList = new ArrayList<>();
        for (String s : newStr) {
            newWordList.add(new Word(s));
        }
        Sentence newSentence = new Sentence();
        newSentence.setSentences(newWordList);

        List list = new ArrayList(getText());
        list.add(newSentence);
        for (Object ob : list) {
            System.out.print(ob);
        }
    }

}
