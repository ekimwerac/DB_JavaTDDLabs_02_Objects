//TestBooks.java
package com.qa;

public class TestBooks {
    public static void main(String[] args) {
        String[] arr = {"Author1", "Author2", "Author3"};
        // Ex4-1 Task2-5
        Book b1 = new Book("title", arr, 10.99);
        Book b2 = new Book("title2", arr, 5.99);
        Book b3 = new Book("title3", arr, 1.00);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        // Ex4-1 Task2-6
        Book[] bookArray = new Book[3];
        // Ex4-1 Task2-7
        bookArray[0] = b1;
        bookArray[1] = b2;
        bookArray[2] = b3;

        //this could have been done with
        //          "Book[] bookArray = {b, b2, b3};"
        // Ex4-1 Task2-8

        for (int x = 0; x < bookArray.length; x++){
            System.out.println(bookArray[x]);
        }
    }
}