package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", "White", 3.56);

        hamburger.addHamburgerAddition1("Tomato", 0.25);
        hamburger.addHamburgerAddition2("Lettuce", 0.3);
        hamburger.addHamburgerAddition3("Cheese", 1.0);
        double price = hamburger.itemizeHamburger();
        System.out.println("Total price of burger: $" + price);

        HealthyBurger healthyBurger = new HealthyBurger("Angus", 5.00);

        healthyBurger.addHamburgerAddition1("Egg", 5.00);
        healthyBurger.addHealthyAddition1("Lentils", 3.00);
        price = healthyBurger.itemizeHamburger();
        System.out.println("Total price of burger: $" + price);

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        price = deluxeBurger.itemizeHamburger();
        System.out.println("Total price of burger: $" + price);

    }
}
