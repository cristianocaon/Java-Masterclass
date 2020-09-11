package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        boolean flag = true;

        while(flag) {
            menu();
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    flag = false;
                    break;
            }
        }
    }

    private static void searchContact() {
    }

    private static void removeContact() {
    }

    private static void updateContact() {
        System.out.print("Current contact name: ");
        scanner.nextLine();
        String currentName = scanner.nextLine();

        System.out.print("New contact name: ");
        String newName = scanner.nextLine();

        mobilePhone.modifyContact(currentName, newName);
    }

    private static void addContact() {
        System.out.print("Enter name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        mobilePhone.storeContact(name, phoneNumber);
    }

    private static void printContacts() {
        mobilePhone.queryContacts();
    }

    public static void menu() {
        System.out.println("\n+------------------------------+");
        System.out.println("|Select an option:             |");
        System.out.println("|\t1- Print contacts          |");
        System.out.println("|\t2- Add new contact         |");
        System.out.println("|\t3- Update existing contact |");
        System.out.println("|\t4- Remove contact          |");
        System.out.println("|\t5- Search for contact      |");
        System.out.println("|\t6- Exit                    |");
        System.out.println("+------------------------------+\r");
        System.out.print("Enter: ");
    }
}
