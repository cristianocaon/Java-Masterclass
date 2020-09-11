package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        Primitive types:
            byte,
            short,
            int,
            long,
            float,
            double,
            char,
            boolean
        */

        // String is not a primitive type, it is a class

        String myString = "This is a String";
        System.out.println(myString);

        myString = myString + ", and this is more";
        System.out.println(myString);

        myString = myString + " \u00A9 2019";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
    }
}