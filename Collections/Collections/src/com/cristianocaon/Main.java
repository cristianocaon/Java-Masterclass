package com.cristianocaon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
//        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//        printList(seatCopy);

        if(theatre.reservedSeat("D11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Seat reserved already");
        }

        if(theatre.reservedSeat("B13")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Seat reserved already");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, theatre.PRICE_ORDER);
        printList(priceSeats);

//        Collections.shuffle(seatCopy);
//        System.out.println("Printing seatCopy");
//        printList(seatCopy);
//        System.out.println("Printing theatre.seats");
//        printList(theatre.seats);
//
//        Theatre.Seat minSeat = Collections.min(seatCopy);
//        Theatre.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println("Min seat number is " + minSeat.getSeatNumber());
//        System.out.println("Max seat number is " + maxSeat.getSeatNumber());
//
//        sortList(seatCopy);
//        System.out.println("Printing sorted seatCopy");
//        printList(seatCopy);
    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println("\n=================================");
    }

//    public static void sortList(List<? extends Theatre.Seat> list) {
//        for(int i=0; i<list.size()-1; i++) {
//            for(int j=i+1; j<list.size(); j++) {
//                if(list.get(i).compareTo(list.get(j)) > 0) {
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
//    }
}
