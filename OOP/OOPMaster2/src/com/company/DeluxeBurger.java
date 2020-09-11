package com.company;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Angus", "White", 10.00);
        super.addHamburgerAddition1("Chips", 2.5);
        super.addHamburgerAddition2("Drink",1.0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add more items!");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add more items!");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add more items!");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add more items!");
    }
}
