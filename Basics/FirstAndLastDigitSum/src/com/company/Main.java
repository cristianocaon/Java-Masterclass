package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1234));
        System.out.println(sumFirstAndLastDigit(12345));
        System.out.println(sumFirstAndLastDigit(1236));
        System.out.println(sumFirstAndLastDigit(123489797));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }

        int total = 0;
        total += (number % 10);

        while(number >= 10) {
            number /= 10;
        }

        total += (number % 10);

        return total;
    }
}
