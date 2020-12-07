package org.kemy.taskClass.book;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateBook {
    private ArrayList<Book> book;

    public void createNewBook() {
        book = new ArrayList<Book>();
        book.add(new Book(1, "Azbuka", Arrays.asList("Petrov", "Petrov2"), "PetrovHouse", 1999, 50, 3.99, "hardcover"));
        book.add(new Book(2, "Recipe", Arrays.asList("Ivanov", "Ivanov2"), "IvanovHouse", 2000, 150, 19.99, "paperback"));
        book.add(new Book(3, "Stores", Arrays.asList("Petrov"), "PetrovHouse", 2010, 123, 4.99, "hardcover"));
        book.add(new Book(4, "Sport", Arrays.asList("Petrov"), "PetrovHouse", 2009, 344, 12.99, "paperback"));
        book.add(new Book(5, "War", Arrays.asList("Ivanov"), "IvanovHouse", 2003, 324, 55.99, "hardcover"));
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
