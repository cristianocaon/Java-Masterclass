package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));    // 7
        System.out.println(getLargestPrime(217));   // 31
        System.out.println(getLargestPrime(0));     // -1
        System.out.println(getLargestPrime(45));    // 5
        System.out.println(getLargestPrime(-1));    // -1
        System.out.println(getLargestPrime(7));     // 7
        System.out.println(getLargestPrime(2));     // 2
    }

    public static int getLargestPrime(int number) {
        if(number <= 1) {
            return -1;
        }

        int prime = 0;
        int primeLargest = 0;

        for(int i = number; i > 1; i--) {
//            System.out.println("Test: " + i);
            boolean isPrime = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
//                    System.out.println(i + " is not prime");
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
//                System.out.println(i + " is prime!");
                for(int k = 1; k < number; k++) {
                    if(i * k == number) {
                        return i;
                    } else if (i * k > number){
                        break;
                    } else {
//                        System.out.println((i * k) + " is not a match to " + number);
                    }
                }
            }
        }

        return -1;
    }
}
