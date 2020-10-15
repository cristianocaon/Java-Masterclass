package com.cristianocaon;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide() {
        int x = getInt();
        int y = getInt();
        System.out.println("X is " + x + ". Y is " + y);
        return x / y;
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter an integer: ");
        return scanner.nextInt();
    }
}
