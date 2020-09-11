package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//	    int[] array1 = new int[10];     // Can store 10 different integers.
//        double[] array2 = new double[10];
//
//        int[] array1  = { 1, 2 ,3 ,4 ,5 ,6 ,8 ,9 ,10 };
//
//	    printArray(array1);
//
//        System.out.println("+--------------+");
//
//	    int[] newArray = new int[10];
//
//	    printArray(newArray);

        int[] myIntegers = getIntegers(5);

        printArray(myIntegers);

        System.out.println("Average: " + getAverage(myIntegers));
    }

    public static double getAverage(int[] array) {
        double sum = 0;

        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    public static int[] getIntegers(int amount) {
        // \r makes it go to the next line, thus we start entering the values
        // in the next line, and not after the "."
        System.out.println("Enter " + amount + " integer values.\r");
        int[] values = new int[amount];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
//            array[i] = i * 10;
            System.out.println(array[i]);
        }
    }
}
