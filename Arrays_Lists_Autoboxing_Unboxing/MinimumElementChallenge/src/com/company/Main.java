package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("How many integers? ");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);

        System.out.println("The minimum value is " + findMinimum(array));
    }

    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " integers: \r");

        int[] array = new int[count];

        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int findMinimum(int[] array) {
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < minimum) {
                minimum = array[i];
            }
        }

        return minimum;
    }
}
