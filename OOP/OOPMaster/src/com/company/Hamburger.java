package com.company;

import java.util.Scanner;

public class Hamburger {
    private String bread;
    private String meat;
    private boolean cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean pickles;
    protected double cost;

    public Hamburger(String bread, String meat) {
        this.bread = bread;
        this.meat = meat;
        this.cost = 8.00;

        this.cheese = false;
        this.lettuce = false;
        this.tomato = false;
        this.pickles = false;
    }

    public void additional() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n+-----------------------------------+");
        System.out.println("| Do you want to add the following? |");
        System.out.println("|   1- Cheese                       |");
        System.out.println("|   2- Lettuce                      |");
        System.out.println("|   3- Tomato                       |");
        System.out.println("|   4- Pickles                      |");
        System.out.println("|   0- Exit                         |");
        System.out.println("+-----------------------------------+");

        boolean flag = true;

        while(flag) {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Cheese added!");
                    this.cheese = true;
                    this.cost += 1;
                    break;
                case 2:
                    System.out.println("Lettuce added!");
                    this.lettuce = true;
                    this.cost += 1;
                    break;
                case 3:
                    System.out.println("Tomato added!");
                    this.tomato = true;
                    this.cost += 1;
                    break;
                case 4:
                    System.out.println("Pickles added!");
                    this.pickles = true;
                    this.cost += 1;
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }

        scanner.close();
    }

    public void showOrder() {
        System.out.println("Total price for " + getClass().getSimpleName() + ": " + getCost());
        System.out.println("+--------------------+");
        System.out.println("|  Description:      |");
        System.out.println("|     " + getBread());
        System.out.println("|     " + getMeat());

        if(this.pickles) {
            System.out.println("|     Pickles        |");
        }

        if(this.tomato) {
            System.out.println("|     Tomato         |");
        }

        if(this.cheese) {
            System.out.println("|     Cheese         |");
        }

        if(this.lettuce) {
            System.out.println("|     Lettuce        |");
        }

        System.out.println("+--------------------+");
    }

    public double getCost() {
        return cost;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }
}
