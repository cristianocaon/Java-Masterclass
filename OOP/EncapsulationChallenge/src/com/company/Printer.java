package com.company;

public class Printer {

    private boolean isDuplex;
    private int pagesPrinted;
    private int tonerLevel;

    public Printer(boolean isDuplex, int tonerLevel) {
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
        if(tonerLevel > -1 & tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
    }

    public int fillUpToner(int amount) {
        if(amount > 0 && amount <= 100) {
            if(this.tonerLevel + amount > 100) {
                return -1;
            }
            this.tonerLevel += amount;
            System.out.println("Toner filled to " + this.tonerLevel + "%");
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public void print(int pages) {
        if(isDuplex) {
            System.out.println("Printing in Duplex mode!");
            this.pagesPrinted += (pages / 2) + (pages % 2);
        } else {
            this.pagesPrinted += pages;
        }

        updateTonerLevel();
    }

    public int getPagesPrinted() {
        System.out.println("Number of pages printed: " + this.pagesPrinted);
        return pagesPrinted;
    }

    private void updateTonerLevel() {
        System.out.println("Original toner level: " + this.tonerLevel + "%" +
                "\nNew toner level: " + (this.tonerLevel - 2) + "%");
        this.tonerLevel -= 2;
    }

    public int getTonerLevel() {
        System.out.println("Toner level at: " + this.tonerLevel + "%");
        return tonerLevel;
    }
}
