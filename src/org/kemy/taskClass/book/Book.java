package org.kemy.taskClass.book;

import java.math.BigDecimal;
import java.util.List;

public class Book {
    private String name;
    private List<String> authors;
    private String publishingHouse;
    private int year;
    private int pages;
    private BigDecimal price;
    private String binding;

    public Book(String name, List<String> authors, String publishingHouse, int year, int pages, BigDecimal price, String binding) {
        this.name = name;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.binding = binding;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + authors + '\'' +
                ", price=" + price +
                ", binding='" + binding + '\'' +
                '}';
    }
}
