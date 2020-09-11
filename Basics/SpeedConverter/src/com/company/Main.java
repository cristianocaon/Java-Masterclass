package com.company;

public class Main {

    public static void main(String[] args) {

        printConversion(100);

    }

    public static long toMilesPerHour(double kilometersPerHour) {

        long miles;

        if (kilometersPerHour < 0) {
            miles = -1;
        } else {
            miles = Math.round((kilometersPerHour / 1.609));
        }

        return miles;
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long miles = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }
    }
}
