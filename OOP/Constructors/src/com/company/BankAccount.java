package com.company;

public class BankAccount {

    private String number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("56789", 2.50, "Default name",
                "Default email", "Default phone");
        System.out.println("Empty constructor called!");
    }

    public BankAccount(String name, String email, String phoneNumber) {
        this("99999", 100.55, name, email, phoneNumber);
    }

    public BankAccount(String number, double balance, String name,
                       String email, String phoneNumber) {
        System.out.println("Account constructors with parameters called!");
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(amount + " dollars added to the balance!");
        System.out.println("Updated balance = " + this.balance);
    }

    public void withdraw(double amount) {
        if(this.balance < amount) {
            System.out.println("Insufficient funds. " + this.balance + " available");
            return;
        }

        this.balance -= amount;
        System.out.println(amount + " withdrawn from the balance!");
        System.out.println("Updated balance = " + this.balance);
    }

    public String getAccountNumber() {
        return this.number;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
