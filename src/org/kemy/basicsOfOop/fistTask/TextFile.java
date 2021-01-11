package org.kemy.basicsOfOop.fistTask;

import org.kemy.aggregationAndComposition.text.Text;
import org.kemy.decomposition.Decomposition1;

import java.io.*;

public class TextFile extends File {


    public TextFile(String pathname) {
        super(pathname);
    }


    public static TextFile renameTextFile(TextFile oldFile, String name) throws IOException {
        name = oldFile.getParent() + "\\" + name;
        TextFile file = new TextFile(name);
        if (!file.exists()) {
            file.createNewFile();
            oldFile.delete();
            return file;
        } else {
            System.out.println("File already exist");
            return oldFile;
        }
    }

    public static TextFile createNewTextFile(String name, String dir) throws IOException {
        TextFile newFile = new TextFile(dir + "\\" + name);
        if (!newFile.exists()) {
            newFile.createNewFile();
            return newFile;
        } else {
            System.out.println("File already exist");
            return null;
        }
    }

    public static StringBuilder readFromFile(String dir) throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader(dir));
        StringBuilder builder = new StringBuilder();
        String str = buffer.readLine();
        while (str != null) {
            builder.append(str);
            builder.append('\n');
            str = buffer.readLine();

        }
        buffer.close();
        return builder;
    }

    public static void writeInFile(String dir, String text) throws IOException {
        StringBuilder str = readFromFile(dir);
        str.append(text);
        try {
            FileOutputStream newOut = new FileOutputStream(dir);
            byte[] buffer = str.toString().getBytes();
            newOut.write(buffer, 0, buffer.length);
            newOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void delAllFromFile(String dir) throws IOException {
        try {
            String str = new String();
            FileOutputStream newOut = new FileOutputStream(dir);
            byte[] buffer = str.getBytes();
            newOut.write(buffer, 0, buffer.length);
            newOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
