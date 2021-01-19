package org.kemy.basicsOfOop.firstTask;

import java.io.*;

public class TextFile extends File {

    public TextFile(String pathname) {
        super(pathname);
    }



    public void renameTextFile(String name) throws IOException {
        String fullName = this.getParent() + "\\" + name;
        this.renameTo(new File(fullName));
    }

    public TextFile createNewTextFile(String name, String dir) throws IOException {
        TextFile newFile = new TextFile(dir + "\\" + name);
        if (!newFile.exists()) {
            newFile.createNewFile();
        } else {
            System.out.println("File already exist");
        }
        return newFile;
    }

    public String readFromFile() throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader(this.getAbsoluteFile()));
        StringBuilder builder = new StringBuilder();
        String str = buffer.readLine();
        while (str != null) {
            builder.append(str);
            builder.append('\n');
            str = buffer.readLine();

        }
        buffer.close();
        return builder.toString();
    }

    public void writeInFile( String text) throws IOException {
        StringBuilder str = new StringBuilder();
        str.append(text);
        try {
            FileOutputStream newOut = new FileOutputStream(this.getAbsoluteFile());
            byte[] buffer = str.toString().getBytes();
            newOut.write(buffer, 0, buffer.length);
            newOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void delAllFromFile() throws IOException {
        try {
            FileOutputStream newOut = new FileOutputStream(this.getAbsoluteFile());
            byte[] buffer = {};
            newOut.write(buffer, 0, buffer.length);
            newOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}