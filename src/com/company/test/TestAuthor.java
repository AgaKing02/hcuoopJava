package com.company.test;

import com.company.Author;

public class TestAuthor {

    public static void main(String[] args) {

        Author author = new Author("Name", "name@mail.ru", 'm');
        System.out.println(author);
        author.setEmail("itsname@gmail.com");
        System.out.println("name is: " + author.getName());
        System.out.println("email is: " + author.getEmail());
        System.out.println("gender is: " + author.getGender());
    }

}
