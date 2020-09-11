package com.company;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private String name;

    public Branch(String name) {
        this.name = name;
        this.customers  = new ArrayList<Customer>();
    }

    public boolean addNewCustomer(String name, double initialAmount) {
        if(initialAmount > 0 && findCustomer(name) == null) {
            this.customers.add(new Customer(name, initialAmount));
            System.out.println(name + " added with a transaction of $" +
                    initialAmount + "!");
            return true;
        }
        System.out.println("Invalid amount or Customer already exists.");
        return false;
    }

    public boolean addCustomerTransaction(String name, double transactionAmount) {
        Customer existingCustomer = findCustomer(name);
        if(findCustomer(name) != null) {
            existingCustomer.addTransaction(transactionAmount);
            System.out.println("Transaction amount of $" + transactionAmount +
                    " added to customer " + existingCustomer.getName() + "!");
            return true;
        }
        System.out.println("Error!!!");
        return false;
    }

    private Customer findCustomer(String name) {
        for(int i = 0; i < customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(name)) {
                return checkedCustomer;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
