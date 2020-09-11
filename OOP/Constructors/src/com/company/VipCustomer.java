package com.company;

public class VipCustomer {

    private String name;
    private double credit;
    private String email;

    public VipCustomer(String name, double credit, String email) {
        this.name = name;
        this.credit = credit;
        this.email = email;
        System.out.println("Hello " + name + "! Welcome to the VIP!! You have "
                + credit + " credits!");
    }

    public VipCustomer() {
        this("John Doe", 0.00, "john.doe@email.com");
        System.out.println("Default customer created!");
    }

    public VipCustomer(String name, double credit) {
        this(name, credit, "default@email.com");
    }

    public String getName() {
        return name;
    }

    public double getCredit() {
        return credit;
    }

    public String getEmail() {
        return email;
    }
}
