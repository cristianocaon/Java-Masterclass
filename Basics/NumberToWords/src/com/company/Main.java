package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
//
//        System.out.println("------------");
////
//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));
//        System.out.println(reverse(0));
//
//        System.out.println("------------");

        numberToWords(123);
        System.out.println("------------");
        numberToWords(1010);
        System.out.println("------------");
        numberToWords(1000);
        System.out.println("------------");
        numberToWords(-12);
        System.out.println("------------");
        numberToWords(0);
    }

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int count = getDigitCount(number);

        number = reverse(number);

        int countConfirmed = getDigitCount(number);
        count -= countConfirmed;

        if(number == 0) {
            System.out.println("Zero");
            return;
        }

        while(number > 0) {
            int digit = number % 10;
            switch(digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
            number /= 10;
        }

        while(count != 0) {
            System.out.println("Zero");
            count--;
        }
    }

    public static int reverse(int number) {
//        if(number < 0) {
//            number *= -1;
//        }

        int reverse = 0;
        while(number != 0) {
            int lastDigit = (number % 10);
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }



        return reverse;
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }

        if(number == 0) {
            return 1;
        }

        int count = 0;

        while(number != 0) {
            count++;
            number /= 10;
        }

        return count;
    }
}
