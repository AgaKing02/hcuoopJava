package com.company.test;

import com.company.Author;
import com.company.Book2;

public class TestBook2 {

    public static void main(String[] args) {

        Author[] authors = new Author[2];
        authors[0] = new Author("Second Author", "second@gmail.com", 'M');
        authors[1] = new Author("I am the Author", "author@gmail.com", 'M');
        Book2 javaDummy = new Book2("JAX-RS", authors, 30.00, 70);
        System.out.println(javaDummy);
    }

}
