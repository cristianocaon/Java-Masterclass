package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int count = 0;


        while(true) {
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();
                total += number;
                count++;
            } else {
                break;
            }

            scanner.nextLine();     // handle end of line
        }

        System.out.println("SUM = " + total + " AVG = " + Math.round(((double) total / (double) count)));

        scanner.close();
    }
}
