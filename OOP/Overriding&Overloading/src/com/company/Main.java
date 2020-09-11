package com.company;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog();
	    dog.bark();
		System.out.println("-------");
	    dog.bark(3);
		System.out.println("-------");

	    GermanShepherd german = new GermanShepherd();
	    german.bark();
    }
}
