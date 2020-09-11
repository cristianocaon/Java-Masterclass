package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

    }

    public static boolean isLeapYear(int year) {

        boolean leapYear;

        if (year < 1 || year > 9999) {
            leapYear = false;
        } else if (!(year % 4 == 0)) {
            leapYear = false;
        } else if (!(year % 100 == 0)) {
            leapYear = true;
        } else leapYear = year % 400 == 0;

        return leapYear;
    }
}
