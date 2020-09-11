package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(true, 20);

        printer.print(20);
        printer.getTonerLevel();
        printer.fillUpToner(50);
        printer.print(50);
        printer.getTonerLevel();
    }
}
