package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int count = 0;

//        while(count <= 10) {
//            System.out.print("Enter number #" + count + ": ");
//            boolean hasNextInt = scanner.hasNextInt();
//
//            if(hasNextInt) {
//                int number = scanner.nextInt();
//                total += number;
//                count++;
//            } else {
//                System.out.println("Invalid Number");
//            }
//        }
//
//        System.out.println("Total = " + total);
//
//        scanner.close();

        while(true) {
            int order = count + 1;
            System.out.println("Enter number #" + order + ": ");

            boolean isInt = scanner.hasNextInt();

            if(isInt) {
                int number = scanner.nextInt();
                count++;
                total += number;
                if(count == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine();     // handle end of line (enter key)
        }

        System.out.println("Total = " + total);

        scanner.close();
    }
}
