package com.company;

public class Main {

    public static void main(String[] args) {

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;

        System.out.println("Float minimum: " + minFloat);
        System.out.println("Float maximum: " + maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;

        System.out.println("Double minimum: " + minDouble);
        System.out.println("Double maximum: " + maxDouble);


        int myInt = 5 / 3;
        float myFloat = 5f / 3f;
        double myDouble = 5d / 3d;

        System.out.println("Int: " + myInt);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);

        double pounds = 155d;
        double kilogram = pounds * 0.45359237d;

        System.out.println("Pounds: " + pounds + "\n" +
                "Kilograms: " + kilogram);

    }
}
