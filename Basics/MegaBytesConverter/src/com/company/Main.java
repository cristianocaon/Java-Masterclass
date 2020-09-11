package com.company;

public class Main {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(-1024);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int remainingMegaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " +
                    remainingMegaBytes + " MB and " +
                    remainingKiloBytes + " KB");
        }
    }
}
