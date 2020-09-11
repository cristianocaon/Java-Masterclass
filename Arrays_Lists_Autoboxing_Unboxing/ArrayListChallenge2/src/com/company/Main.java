package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("806-412-8101");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();

        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }
    }

    private static void addNewContact() {
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        Contact contact = Contact.createContact(name, phoneNumber);

        if(mobilePhone.addNewContact(contact)) {
            System.out.println("New contact added: " + name + " | phone: " + phoneNumber);
        } else {
            System.out.println("Contact already exists.");
        }
    }

    private static void updateContact() {
        System.out.print("Enter existing name: ");
        String name = scanner.nextLine();

        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new phone number: ");
        String phoneNumber = scanner.nextLine();

        Contact contact = Contact.createContact(newName, phoneNumber);
        if(mobilePhone.updateContact(existingContactRecord, contact)) {
            System.out.println("Successfully updated record.");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted!");
        } else {
            System.out.println("Error deleting record.");
        }
    }

    private static void queryContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\nPress\n" +
                            "\t0- Shutdown\n" +
                            "\t1- Print contacts\n" +
                            "\t2- Add contact\n" +
                            "\t3- Update contact\n" +
                            "\t4- Remove contact\n" +
                            "\t5- Query contact\n" +
                            "\t6- Print available actions\n");
        System.out.print("Choose action: ");
    }
}
