package com.cristianocaon;

import java.util.*;

public class Theatre {
    private final String name;
    private List<Seat> seats = new ArrayList<>();

    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if(seat1.getPrice() < seat2.getPrice()) {
                return -1;
            } else if(seat1.getPrice() > seat2.getPrice()) {
                return 1;
            } else {
                return 0;
            }
        }
    };

    public Theatre(String name, int numRows, int seatsPerRow) {
        this.name = name;
        int lastRow = 'A' + (numRows - 1);
        for(char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum < seatsPerRow; seatNum++) {
                double price = 12.00;
                if((row < 'D') && (seatNum >= 4 && seatNum <= 9)) {
                    price = 14.00;
                } else if((row > 'F') || (seatNum < 4 || seatNum > 9)) {
                    price = 7.00;
                }

                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getName() {
        return name;
    }

    public boolean reservedSeat(String seatNum) {
        Seat requestedSeat = new Seat(seatNum, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNum);
            return false;
        }
//        for(Seat seat: seats) {
//            System.out.print(".");
//            if(seat.getSeatNumber().equals(seatNum)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if(requestedSeat == null) {
//            System.out.println("There is no seat " + seatNum);
//            return false;
//        }
//        return requestedSeat.reserve();
    }

    public Collection<Seat> getSeats() {
        return seats;
    }

    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private double price;
        private boolean isReserved = false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public boolean reserve() {
            if(!this.isReserved) {
                this.isReserved = true;
                System.out.println("Seat " + seatNumber + " reserved!");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if(this.isReserved) {
                this.isReserved = false;
                System.out.println("Seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public double getPrice() {
            return price;
        }
    }
}
