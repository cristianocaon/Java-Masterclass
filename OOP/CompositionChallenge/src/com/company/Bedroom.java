package com.company;

// Bedroom IS a Room.
public class Bedroom extends Room {
    // Bedroom HAS a Light.
    private Lamp lamp;
    // Bedroom HAS a Bed.
    private Bed bed;

    public Bedroom(int width, int length, int height,
                   int numberOfWindows, Lamp lamp, Bed bed) {
        super(width, length, height, numberOfWindows);
        this.lamp = lamp;
        this.bed = bed;
    }

    public void makeBed() {
        bed.make();
    }

    public Lamp getLamp() {
        return lamp;
    }
}
