package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static int sumOdd(int start, int end) {
        if((start > end) || start < 0 || end < 0) {
            return -1;
        }

        int total = 0;
        int count = 0;

        for(int i = start; i <= end; i++) {
            if(isOdd(i)) {
                total += i;
                count++;
            }
        }

        return total;
    }

    public static boolean isOdd(int number) {
        if(number < 0) {
            return false;
        }
        return number % 2 != 0;
    }
}
