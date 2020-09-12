package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");

        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");

        printList(placesToVisit);

        visit(placesToVisit);


//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");

//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Alice Springs");
//
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//
//        printList(placesToVisit);

    }

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in the itinerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
//            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Vacation over.");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list.");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:");
        System.out.println("1- Go to next city.");
        System.out.println("2- Go to previous city.");
        System.out.println("3- Print menu options.");
        System.out.println("0- Quit");
        System.out.print("Enter: ");
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }

        System.out.println("+------------------+");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        // Iterators generally just go through the lists.
        // ListIterator provide the functionality to go back the list. (.previous()).
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            // We first need to use the stringListIterator.next() to really points
            // to the first item in the list. Before that, it doesn't point.
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0) {
                // equal, do not add.
                System.out.println(newCity + " is already included in the list!");
                return false;
            } else if(comparison > 0) {
                // new city should appear before this one.
                // Brisbane -> Adelaide as parameter, should come before.
                // Since we used .next(), we already passed the location where Adelaide
                // should be added. Thus, we need to go back.
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
        }

        // If we reach this point, we are at the end of the list.
        // Thus, we just need to add the city as the last item in the list.
        stringListIterator.add(newCity);
        return true;
    }
}
