package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));   // false
        System.out.println(canPack(1, 0, 5));   // true
        System.out.println(canPack(0, 5, 4));   // true
        System.out.println(canPack(2, 2, 11));  // true
        System.out.println(canPack(-3, 2, 12)); // false

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0) {
            return false;
        }

        int result = 0;

        while(bigCount > 0) {
            if(bigCount * 5 > goal) {
                bigCount--;
            } else {
                result += bigCount * 5;
                break;
            }
        }

        while(smallCount > 0) {
            if(result + smallCount > goal) {
                smallCount--;
            } else {
                result += smallCount;
                break;
            }
        }

        return result == goal;
    }
}
