package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasEqualSum(1,1,3));
    }

    public static boolean hasEqualSum(int param1, int param2, int param3) {

        return (param1 + param2) == param3;

    }
}
