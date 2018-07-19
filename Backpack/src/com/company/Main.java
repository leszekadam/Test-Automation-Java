package com.company;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book(); // obiekt book1
        Book book2 = new Book(); // obiekt book2
        Book book3 = new Book(); // obiekt book3

        book1.setAuthor("Dennis Ritchie"); // ustawienie autora dla book1
        book1.setTitle("The C Programming language "); // ustawienie tytułu dla book2

        book2.setAuthor("Stephen Prata");
        book2.setTitle("C Primer Plus ");

        book3.setAuthor("Cay S. Horstmann");
        book3.setTitle("Java. Podstawy. Wydanie X ");

        Backpack backpack = new Backpack(); // utworzenie obiektu backpack
        backpack.addBook(book1); // dodanie book1 do uruchomienia
        backpack.addBook(book2);
        backpack.addBook(book3);
        backpack.getBooks(); // weź książki i zaprezentuj
    }

}

