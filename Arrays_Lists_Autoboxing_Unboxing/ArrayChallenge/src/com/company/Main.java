package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] integers = getIntegers();
        printArray(integers);
        System.out.println("+----------+\nSorted array:");

        int[] sortedArray = sortArray(integers);
        printArray(sortedArray);

        System.out.println("+----------+");
    }

    public static int[] sortArray(int[] array) {
//        int[] sortedArray = new int[array.length];
//
//        for(int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;

        while(flag) {
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]) {
                    swap(sortedArray, i, i + 1);
                    flag = true;
                }
            }
        }
//
//        for(int i = 0; i < sortedArray.length; i++) {
//            int min = sortedArray[i];
//            for(int j = i; j < sortedArray.length; j++) {
//                if(array[j] > min) {
//                    swap(sortedArray, i, j);
//                }
//            }
//        }

        return sortedArray;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] getIntegers() {
        System.out.print("Number of items: ");
        int amount = scanner.nextInt();

        int[] integers = new int[amount];

        System.out.println("Enter numbers: \r");

        for(int i = 0; i < integers.length; i++) {
            integers[i] = scanner.nextInt();
        }

        return integers;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " has value of " + array[i]);
        }
    }
}
