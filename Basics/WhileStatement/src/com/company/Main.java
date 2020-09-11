package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        while(count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("----------------------");
//
//        for(int i = 0; i < 5; i++) {
//            System.out.println("Count value is " + i);
//        }

        count = 0;
        while(true) {
            if(count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("----------------------");

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;

            if(count > 100) {
                break;
            }
        } while(count != 6);

        System.out.println("----------------------");

        int number = 4;
        int finishNumber = 20;
        count = 0;

        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);

            count++;
            if(count == 5) {
                System.out.println(count + " even numbers found!");
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
