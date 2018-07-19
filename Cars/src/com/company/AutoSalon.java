package com.company;

public class AutoSalon {

    public static void main(String[] args) {

        CarsClass car1 = new CarsClass();

        car1.setMark("Audi");
        car1.setModel("RS6");
        car1.setColor("Black");
        car1.setPassengersNumber(5);
        car1.setEnginePS(750);

        System.out.println(
                "\nmark: " + car1.getMark() +
                "\nmodel: " + car1.getModel() +
                "\ncolor: " + car1.getColor() +
                "\nnumber of passengers: " + car1.getPassengersNumber() +
                "\nPS/KM: " + car1.getEnginePS()
        );
    }
}
