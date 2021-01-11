package org.kemy.basicsOfOop.fistTask;

import org.kemy.Input;

import java.io.IOException;


public class Starter {
    public static void main(String[] args) throws IOException {
        TextFile textFile1 = new TextFile("d:/!file");
        if (TextFile.createNewTextFile("qwerty1.txt", textFile1.getAbsolutePath()) != null) {
            textFile1 = TextFile.createNewTextFile("qwerty1.txt", textFile1.getAbsolutePath());
        }

        textFile1 = TextFile.renameTextFile(textFile1, "qqq.txt");

        System.out.println(TextFile.readFromFile("d:/!file/text.txt"));

        System.out.println("Text to add in file");
        String text = Input.inputStr();

        TextFile.writeInFile("d:/!file/text.txt",text);
        System.out.println(TextFile.readFromFile("d:/!file/text.txt"));

        TextFile.delAllFromFile("d:/!file/text.txt");
    }
}
