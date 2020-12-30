package org.kemy.taskClass.book;

import org.kemy.Input;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class MainBook {
    public static void main(String[] args) {

        System.out.println("What author you need?");
        String author = Input.inputStr();
        ArrayList<Book> book = new ArrayList<>();
        book.add(new Book("Azbuka", Arrays.asList("Petrov", "Petrov2"), "PetrovHouse", 1999, 50, BigDecimal.valueOf(3.99), "hardcover"));
        book.add(new Book("Recipe", Arrays.asList("Ivanov", "Ivanov2"), "IvanovHouse", 2000, 150, BigDecimal.valueOf(19.99), "paperback"));
        book.add(new Book("Stores", Arrays.asList("Petrov"), "PetrovHouse", 2010, 123, BigDecimal.valueOf(4.99), "hardcover"));
        book.add(new Book("Sport", Arrays.asList("Petrov"), "PetrovHouse", 2009, 344, BigDecimal.valueOf(12.99), "paperback"));
        book.add(new Book("War", Arrays.asList("Ivanov"), "IvanovHouse", 2003, 324, BigDecimal.valueOf(55.99), "hardcover"));

        AllMethodsForBooks newBook = new AllMethodsForBooks(book);

        newBook.searchByAuthor(author);
        System.out.println("What publishing house you need?");
        String publishingHouse = Input.inputStr();
        newBook.searchByPublishingHouse(publishingHouse);
        System.out.println("What year you need?");
        int year = Input.inputInt();
        newBook.searchByYear(year);

    }


}
