package com.company;

public class Main {

    public static void main(String[] args) {

        Lamp lamp = new Lamp("Normal" , 2, true);
        Bed bed = new Bed("King", 2, 10, 1, 1);

        Bedroom bedroom = new Bedroom(100, 100, 20, 3, lamp, bed);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
