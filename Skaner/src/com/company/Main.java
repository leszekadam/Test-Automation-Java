package com.company;

public class Main {

    public static void main(String[] args) {

        Kartka kartka = new Kartka();
        kartka.setTekst("Telefon");

        Skaner skaner = new Skaner();
        skaner.drukuj(kartka);
    }
}
