package com.company;

public class Main {

    public static void main(String[] args) {
        sumOdd(100);
    }

    public static void sumOdd(long num) {
        long total = 0;
        int count = 0;
        for(int i = 1; i <= num; i++) {
            if((i % 3 ==0) && (i % 5 == 0)) {
                System.out.println(i + " will be added!");
                total += i;
                count++;
            }

            if(count == 5) {
                break;
            }
        }
        System.out.println("Total = " + total);
    }
}
