package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contacts = new ArrayList<>();

    public void storeContact(String name, String phoneNumber) {
        if(findContact(name)) {
            System.out.println("Contact already exists.");
            return;
        }
        contacts.add(new Contact(name, phoneNumber));
        System.out.println("Contact added!");
    }

    public void modifyContact(String currentName, String newName) {
        if(!findContact(currentName)) {
            System.out.println("Contact doesn't exists.");
            return;
        }
         int index = indexOfContact(currentName);
        contacts.get(index).setName(newName);

    }

    public void queryContacts() {
        System.out.println("Contacts: ");
        for(int i = 0; i < contacts.size(); i++) {
            System.out.println("Name: " + contacts.get(i).getName() +
                    " | Phone number: " + contacts.get(i).getNumber());
        }
    }

    private int indexOfContact(String name) {
        for(int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private boolean findContact(String name) {
        for(int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
