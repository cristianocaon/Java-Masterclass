package com.company;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    // Even though we may not use the method. we still need to implement it.
    // Thus, we can easily override it and make it do nothing.
    @Override
    public void powerOn() {
        this.isOn = true;
        System.out.println("Mobile Phone powered up.");
    }

    @Override
    public void dial(int phoneNumber) {
        if(this.isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone.");
        } else {
            System.out.println("Phone is switched off.");
        }
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the mobile phone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody ring");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on or number different.");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
