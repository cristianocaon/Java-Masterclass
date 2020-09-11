package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {5, 4, 2, 1, 3, 6};

//        printArray(array);
        System.out.println("Array: " + Arrays.toString(array));

        System.out.println("+------------------------------+");

        reverseArray(array);

        System.out.println("Reverse Array: " + Arrays.toString(array));

//        printArray(array);
    }

//    public static void printArray(int[] array) {
//        for(int i = 0; i < array.length; i++) {
//            System.out.println("Element " + i + " is equal to " + array[i]);
//        }
//
//        System.out.println("+------------------------------+");
//    }

    public static void reverseArray(int[] array) {
        for(int i = 0; i < array.length / 2; i++) {
            swap(array, i, array.length - 1 - i);
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
