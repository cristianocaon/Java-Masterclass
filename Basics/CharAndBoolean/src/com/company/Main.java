package com.company;

public class Main {

    public static void main(String[] args) {

        char char1 = 'D';
        char unicodeChar1 = '\u0044';

        System.out.println(char1 + "\n" + unicodeChar1);

        // Copyright character
        char unicodeChar2 = '\u00A9';

        System.out.println(unicodeChar2);

        boolean trueBool = true;
        boolean falseBool = false;

        // Best practice for naming boolean variables
        boolean isCustomerOverTwentyOne = true;
    }
}
