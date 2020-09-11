package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Which do you want: ");
//        System.out.println("1- Hamburger");
//        System.out.println("2- Healthy Burger");
//        System.out.println("3- Deluxe Burger");

//
        System.out.println("Which bread? ");
        String bread = scanner.nextLine();
        System.out.println("Which meat? ");
        String meat = scanner.nextLine();

        Hamburger hamburger = new Hamburger(bread, meat);

        System.out.println("Total cost: " + hamburger.getCost());
        System.out.println(hamburger.getBread());
        System.out.println(hamburger.getMeat());

        hamburger.additional();

        System.out.println("Total cost: " + hamburger.getCost());

        hamburger.showOrder();
//
//        System.out.println("------------------------------------");


//        HealthyBurger healthyBurger = new HealthyBurger(meat);
//
//        System.out.println("Total cost: " + healthyBurger.getCost());
//        System.out.println(healthyBurger.getBread());
//        System.out.println(healthyBurger.getMeat());
//
//        healthyBurger.additional();
//
//        System.out.println("Total cost: " + healthyBurger.getCost());

        scanner.close();
    }
}
