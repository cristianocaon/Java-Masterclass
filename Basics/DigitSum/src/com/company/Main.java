package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum is equal to " + sumDigits(1));
        System.out.println("The sum is equal to " + sumDigits(20));
        System.out.println("The sum is equal to " + sumDigits(15));
        System.out.println("The sum is equal to " + sumDigits(1234));
    }

    private static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }

        int total = 0;
        while(number > 0) {
            total += (number % 10);     // Extract the least significant digit
            number /= 10;               // Drop the least significant digit
        }

        return total;
    }
}
