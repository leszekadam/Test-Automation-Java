package com.company;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private List<Book> books = new ArrayList<>(); // tworzymy nową rozszerzalną listę książek

    public void addBook(Book book) {
        books.add(book);
    }

    public void getBooks(){
        for (Book book : books) {

            System.out.println(
                    "Tytuł książki to: " + book.getTitle() +
                    "\nAutorem książki jest: " + book.getAuthor()+"\n");
        }
    }
}
