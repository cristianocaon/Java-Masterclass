package com.company;

public class Main {

    public static void main(String[] args) {

        // OOP --> Inheritance, Composition, Encapsulation and Polumorphism

        // Inheritance --> A class IS another class.
        // Composition --> A class HAS another class.

        // Generally go for composition first, instead of inheritance.

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);


        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC pc = new PC(theCase, monitor, motherboard);

        pc.powerUp();
    }
}
