package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
        System.out.println(getGreatestCommonDivisor(1010, 10));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if(!isValid(first) || !isValid(second)) {
            return -1;
        }

        int gcd = 0;
        int min = Math.min(first, second);

        for(int i = 1; i <= min; i++) {
            if((first % i == 0) && (second % i == 0)) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static boolean isValid(int number) {
        return number >= 10;
    }
}
