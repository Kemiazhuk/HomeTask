package org.kemy.taskClass.book;

import org.kemy.Input;

import java.util.ArrayList;
import java.util.Arrays;

public class MainBook {
    public static void main(String[] args) {

        System.out.println("What author you need?");
        String author = Input.inputStr();
        CreateBook newBook = new CreateBook();
        newBook.createNewBook();

        newBook.searchByAuthor(author);
        System.out.println("What publishing house you need?");
        String publishingHouse = Input.inputStr();
        newBook.searchByPublishingHouse(publishingHouse);
        System.out.println("What year you need?");
        int year = Input.inputInt();
        newBook.searchByYear(year);

    }


}
