package org.kemy.aggregationAndComposition.text;

import java.util.List;

public class Text {

private List<Sentence> text;

    public Text(List<Sentence> text) {
        this.text = text;
    }

    public List<Sentence> getText() {
        return text;
    }

    public List<Sentence> addText(List<Sentence> text, String someWords){
        return text;
    }

//    public void outputText(List<Sentence>){
//
//    }
    @Override
    public String toString() {
        return text + ". ";
    }
}
