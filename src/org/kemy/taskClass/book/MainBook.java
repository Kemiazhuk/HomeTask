package org.kemy.taskClass.book;

import org.kemy.Input;

import java.util.ArrayList;
import java.util.Arrays;

public class MainBook {
    public static void main(String[] args) {
        MainBook mainBook = new MainBook();
        ArrayList<Book> book = new ArrayList<Book>();
        book.add(new Book(1, "Azbuka", Arrays.asList("Petrov", "Petrov2"), "PetrovHouse", 1999, 50, 3.99, "hardcover"));
        book.add(new Book(2, "Recipe", Arrays.asList("Ivanov", "Ivanov2"), "IvanovHouse", 2000, 150, 19.99, "paperback"));
        book.add(new Book(3, "Stores", Arrays.asList("Petrov"), "PetrovHouse", 2010, 123, 4.99, "hardcover"));
        book.add(new Book(4, "Sport", Arrays.asList("Petrov"), "PetrovHouse", 2009, 344, 12.99, "paperback"));
        book.add(new Book(5, "War", Arrays.asList("Ivanov"), "IvanovHouse", 2003, 324, 55.99, "hardcover"));
        System.out.println("What author you need?");
        String author = Input.inputStr();
        mainBook.searchByAuthor(book, author);
        System.out.println("What publishing house you need?");
        String publishingHouse = Input.inputStr();
        mainBook.searchByPublishingHouse(book, publishingHouse);
        System.out.println("What year you need?");
        int year = Input.inputInt();
        mainBook.searchByYear(book, year);

    }

    public void searchByAuthor(ArrayList<Book> list, String author) {
        for (Book b : list) {
            if (b.getAuthors().contains(author)) {
                System.out.println(b.toString());
            }
        }
    }

    public void searchByPublishingHouse(ArrayList<Book> list, String publishingHouse) {
        for (Book b : list) {
            if (b.getPublishingHouse().compareTo(publishingHouse) == 0) {
                System.out.println(b.toString());
            }
        }
    }

    public void searchByYear(ArrayList<Book> list, int year) {
        for (Book b : list) {
            if (b.getYear() > year) {
                System.out.println(b.toString());
            }
        }
    }
}
