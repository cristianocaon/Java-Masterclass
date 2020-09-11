package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        minAndMax();
    }

    public static void minAndMax() {
        Scanner scanner = new Scanner(System.in);

        int min = 0;    // int max = Integer.MIN_VALUE;
        int max = 0;    // int min = Integer.MAX_VALUE;

        boolean first = true;

        while(true) {
            System.out.print("Enter number: ");
            boolean isInt = scanner.hasNextInt();

            if(isInt) {
                int number = scanner.nextInt();

                if(first) {
                    min = number;
                    max = number;
                    first = false;
                }

                if(number < min) {
                    min = number;
                }

                if(number > max) {
                    max = number;
                }

            } else {
                break;
            }

            scanner.nextLine();     // handle input
        }

        System.out.println("Max = " + max + "\nMin = " + min);
        scanner.close();
    }
}
