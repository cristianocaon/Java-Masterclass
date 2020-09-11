package com.company;

public class Room {

    private int width;
    private int length;
    private int height;
    private int numberOfWindows;

    public Room(int width, int length, int height, int numberOfWindows) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.numberOfWindows = numberOfWindows;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
