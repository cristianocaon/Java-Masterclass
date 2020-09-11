package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
        System.out.println(areEqualByThreeDecimalPlaces(-3.175, -3.1756));

    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
//        System.out.println(Math.floor(number1 * 1000) / 1000);
//        System.out.println(Math.floor(number2 * 1000) / 1000);

        System.out.printf("%.3f%n", number1);
        System.out.printf("%.3f%n", number2);


        return String.format("%.3f", number1).equals(String.format("%.3f", number2));

    }
}
