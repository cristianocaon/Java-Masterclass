package com.company;

public class Main {

    public static void main(String[] args) {

        // int val1 = 10000;
        int minimum = Integer.MIN_VALUE;
        int maximum = Integer.MAX_VALUE;

        // Occupies 32 bits
        System.out.println("Integer Minimum Value: " + minimum);
        System.out.println("Integer Maximum Value: " + maximum);
        System.out.println("Busted Max Value: " + (maximum + 1));
        System.out.println("Busted Min Value: " + (minimum - 1));

        // Occupies 8 bits
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;

        System.out.println("Byte Maximum Value: " + maxByte);
        System.out.println("Byte Minimum Value: " + minByte);

        // Occupies 16 bits
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;

        System.out.println("Short Maximum Value: " + maxShort);
        System.out.println("Short Minimum Value: " + minShort);

        // Occupies 64 bits
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        // long myLong = 2147483648; // can't fit this integer
        long myLong = 2147483647L; // converts literally to long

        System.out.println("Long Maximum Value: " + maxLong);
        System.out.println("Long Minimum Value: " + minLong);
        System.out.println(myLong);

        int myTotal = (minimum / 2);

        byte newByte = (byte)(minByte / 2);

        short newShort = (short)(minShort / 2);

        byte byte1 = 64;
        short short1 = 3000;
        int int1 = 10000;
        long res = 50000 + 10 * (byte1 + short1 + int1);

        System.out.println(res);
    }
}
