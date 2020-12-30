package org.kemy.taskClass.book;

import java.util.ArrayList;
import java.util.Arrays;

public class AllMethodsForBooks {
    private ArrayList<Book> book;

    public AllMethodsForBooks(ArrayList<Book> book) {
        this.book = book;
    }

    public void addNewBook(Book newBook) {
        book.add(newBook);
    }

    public void searchByAuthor(String author) {
        boolean flag = false;
        for (Book b : book) {
            if (b.getAuthors().contains(author)) {
                System.out.println(b.toString());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No such book found");
        }
    }

    public void searchByYear(int year) {
        boolean flag = false;

        for (Book b : book) {
            if (b.getYear() > year) {
                System.out.println(b.toString());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No such book found");
        }
    }

    public void searchByPublishingHouse(String publishingHouse) {
        boolean flag = false;

        for (Book b : book) {
            if (b.getPublishingHouse().compareTo(publishingHouse) == 0) {
                System.out.println(b.toString());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No such book found");
        }
    }
}
