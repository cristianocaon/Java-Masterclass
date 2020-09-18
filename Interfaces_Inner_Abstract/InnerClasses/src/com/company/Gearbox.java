package com.company;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
//    private int gearNumber = 0;
    private int currentGear = 0;
    private boolean clutch;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for(int i = 0; i < maxGears; i++) {
            addGear(i, i * 5.3);
        }
    }

    public void operateClutch(boolean in) {
        this.clutch = in;
    }

    private void addGear(int number, double ratio) {
        if(number > 0 && number <= maxGears) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if(newGear >= 0 && newGear < this.gears.size() && this.clutch) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected!");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if(clutch) {
            System.out.println("Scream!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    // Inner Class
    private class Gear {
        // gearNumber is 'shadowing' the gearNumber from Gearbox.
        // Not recommended
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * ratio;
        }

        public double getRatio() {
            return ratio;
        }
    }
}
