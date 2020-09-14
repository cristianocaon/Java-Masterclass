package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        // Since we are using an interface, we can instantiate a DeskPhone
        // or a MobilePhone class (given that both implement the interface).
        timsPhone = new MobilePhone(24565);
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();
    }
}
