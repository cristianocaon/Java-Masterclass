package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addInitialCustomerToBranch(String branchName, String customerName, double transactionAmount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println(customerName + " added to branch " + branchName + " with a transaction of $" +
                    transactionAmount + "!");
            return branch.addNewCustomer(customerName, transactionAmount);
        }
        System.out.println("Invalid branch.");
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    public boolean showBranchCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            ArrayList<Customer> customers = branch.getCustomers();
            System.out.println("Branch: " + branch.getName());
            for(int i = 0; i < customers.size(); i++) {
                Customer branchCustomer = customers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + " [" + i + "]");
                if(showTransactions) {
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j = 0; j < transactions.size(); j++) {
                        System.out.println("#" + (j+1) + ": $" + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

    private Branch findBranch(String name) {
        for(int i = 0; i < branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(name)) {
                return checkedBranch;
            }
        }
        return null;
    }
}
