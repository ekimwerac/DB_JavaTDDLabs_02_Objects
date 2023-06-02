//Book.java
package com.qa;
import java.util.Arrays;

public class Book {
    private String name;
    private String[] authors;
    private double price;

    // Ex2-1 Task2-2

    public Book(String name, String[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    // Ex2-1 Task2-3
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Ex2-1 Task2-4

    @Override
    public String toString() {
        return "Book [name=" + name + ", authors=" +
                Arrays.toString(authors) + ", price=" + price + "]";
    }
}

