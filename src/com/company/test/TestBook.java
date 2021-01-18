package com.company.test;

import com.company.Author;
import com.company.Book;

public class TestBook {

    public static void main(String[] args) {

        Author author = new Author("Name", "name@mail.ru", 'm');
        Book book = new Book("My Java", author, 14.40, 50);
        System.out.println(book);
        book.setPrice(22.00);
        book.setQty(80);
        System.out.println("name is: " + book.getName());
        System.out.println("price is: " + book.getPrice());
        System.out.println("qty is: " + book.getQty());
        System.out.println("Author is: " + book.getAuthor());
        System.out.println("Author's name is: " + book.getAuthor().getName());
        System.out.println("Author's email is: " + book.getAuthor().getEmail());
        Book anotherBook = new Book("second Java", new Author("Iam Author",
                "author@gmail.com", 'm'), 25.60);
        System.out.println(anotherBook);
    }

}
