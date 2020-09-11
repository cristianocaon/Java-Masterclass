package com.company;

import java.util.Scanner;

public class HealthyBurger extends Hamburger {

    private boolean carrot;
    private boolean jalapeno;


    public HealthyBurger(String meat) {
        super("Brown rye bread roll", meat);
        this.carrot = false;
        this.jalapeno = false;
        super.cost = 10.0;
    }

    @Override
    public void additional() {
//        super.additional();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n+-----------------------------------+");
        System.out.println("| Do you want to add the following? |");
        System.out.println("|   1- Carrot                       |");
        System.out.println("|   2- Jalapeno                     |");
        System.out.println("|   0- Exit                         |");
        System.out.println("+-----------------------------------+");

        boolean flag = true;

        while (flag) {

            int choice = scanner.nextInt();
            System.out.println(choice);
            switch (choice) {
                case 1:
                    System.out.println("Carrot added!");
                    this.carrot = true;
                    super.cost += 1;
                    break;
                case 2:
                    System.out.println("Jalapeno added!");
                    this.jalapeno = true;
                    super.cost += 1;
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }

        scanner.close();
    }

    @Override
    public void showOrder() {
        super.showOrder();

        if(this.carrot) {
            System.out.println("|     Carrot        |");
        }

        if(this.jalapeno) {
            System.out.println("|     Jalapeno       |");
        }
    }
}