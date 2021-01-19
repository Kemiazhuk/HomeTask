package org.kemy.basicsOfOop.firstTask;

import org.kemy.Input;

import java.io.IOException;


public class Starter {
    public static void main(String[] args) throws IOException {
        TextFile textFile1 = new TextFile("d:/!file");

        textFile1 = textFile1.createNewTextFile("qwerty1.txt", textFile1.getAbsolutePath());

        textFile1.delAllFromFile();
        System.out.println("Text to add in file");
        String text = Input.inputStr();
        textFile1.writeInFile(text);

        System.out.println(textFile1.readFromFile());
        textFile1.renameTextFile("qqq.txt");

    }
}