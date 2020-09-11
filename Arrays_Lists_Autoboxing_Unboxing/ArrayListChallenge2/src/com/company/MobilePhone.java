package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contacts = new ArrayList<>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exists!");
            return false;
        }

        contacts.add(contact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if(position < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.contacts.remove(position);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }

    public boolean updateContact(Contact old, Contact new1) {
        int position = findContact(old);
        if(position < 0) {
            System.out.println(old.getName() + " was not found.");
            return false;
        } else if(findContact(new1.getName()) != -1) {
            System.out.println("Contact with name " + new1.getName() + " already exists.");
            return false;
        }
        this.contacts.set(position, new1);
        System.out.println(old.getName() + " was replaced with " + new1.getName());
        return true;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >= 0) {
            return this.contacts.get(position);
        }
        return null;
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }

        return null;
    }

    private int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    private int findContact(String name) {
        for(int i = 0; i < contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            if(contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void printContacts() {
        System.out.println("Contacts list: ");
        for(int i = 0; i < this.contacts.size(); i++) {
            System.out.println((i + 1) + "." +
                    this.contacts.get(i).getName() + " -> " +
                    this.contacts.get(i).getPhoneNumber());
        }
    }
}
