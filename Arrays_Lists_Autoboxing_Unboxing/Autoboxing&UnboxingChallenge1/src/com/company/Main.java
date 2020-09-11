package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initialize();
    }

    private static void initialize() {
        Bank bank;

        boolean quit = false;
        while(!quit) {
            promptBank();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    bank = new Bank("Itau");
                    promptOptions(bank);
                    break;
                case 2:
                    bank = new Bank("Discover");
                    promptOptions(bank);
                    break;
                case 3:
                    bank = new Bank("Bradesco");
                    promptOptions(bank);
                    break;
                case 4:
                    bank = new Bank("Santander");
                    promptOptions(bank);
                    break;
                case 5:
                    bank = new Bank("BofA");
                    promptOptions(bank);
                    break;
                case 0:
                    quit = true;
                    System.out.println("Exiting...");
                    break;
            }
        }
    }

    private static void promptBank() {
        System.out.printf("1- Itau\n");
        System.out.printf("2- Discover\n");
        System.out.printf("3- Bradesco\n");
        System.out.printf("4- Santander\n");
        System.out.printf("5- BofA\n");
        System.out.printf("0- Exit\n");
        System.out.printf("Enter: ");
    }

    private static void options() {
        System.out.println("Available options: ");
        System.out.println("1- Add branch");
        System.out.println("2- Add initial customer");
        System.out.println("3- Add customer transaction");
        System.out.println("4- Show branch customers");
        System.out.println("0- Exit");
        System.out.print("Enter: ");
    }

    private static void promptOptions(Bank bank) {
        boolean quit = false;
        while(!quit) {
            options();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter branch name: ");
                    String branchName = scanner.nextLine();
//                    scanner.nextLine();
                    bank.addBranch(branchName);
                    System.out.println("Branch added: " + branchName);
                    break;
                case 2:
                    System.out.print("\nEnter branch name: ");
                    branchName = scanner.nextLine();
//                    scanner.nextLine();
                    System.out.print("\nEnter initial customer name: ");
                    String customerName = scanner.nextLine();
//                    scanner.nextLine();
                    System.out.print("\nEnter initial customer transaction: ");
                    double customerTransaction = scanner.nextDouble();
                    bank.addInitialCustomerToBranch(branchName, customerName, customerTransaction);
                    break;
                case 3:
                    System.out.print("\nEnter branch name: ");
                    branchName = scanner.nextLine();
//                    scanner.nextLine();
                    System.out.print("\nEnter  customer name: ");
                    customerName = scanner.nextLine();
//                    scanner.nextLine();
                    System.out.print("\nEnter initial customer transaction: ");
                    customerTransaction = scanner.nextDouble();
                    bank.addCustomerTransaction(branchName, customerName, customerTransaction);
                    break;
                case 4:
                    System.out.print("\nEnter branch name: ");
                    branchName = scanner.nextLine();
//                    scanner.nextLine();
                    System.out.print("\nDo you want to see transactions? (y/n) ");
                    String isTransactions = scanner.nextLine();
//                    scanner.nextLine();
                    if(isTransactions.toLowerCase().equals("y")) {
                        bank.showBranchCustomers(branchName, true);
                    } else if (isTransactions.toLowerCase().equals("n")){
                        bank.showBranchCustomers(branchName, false);
                    }
                    break;
                case 0:
                    quit = true;
                    System.out.println("Exiting...");
                    break;
            }
        }
    }
}
