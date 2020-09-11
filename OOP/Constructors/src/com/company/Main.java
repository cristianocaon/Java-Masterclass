package com.company;

public class Main {

    public static void main(String[] args) {

//        BankAccount account = new BankAccount("12345", 0.00, "Bob Brown",
//                "email@bob.com", "(087) 123-4567");
//        BankAccount account2 = new BankAccount();
//
//        System.out.println(account.getAccountNumber());
//        System.out.println(account.getBalance());
//        account.setBalance(100);
//        account.withdraw(20);
//        account.deposit(100);
//        account.withdraw(190);
//        System.out.println(account.getBalance());

        VipCustomer vip = new VipCustomer("Chris", 100);
        System.out.println(vip.getEmail());

    }
}
