package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Bird parrot = new Parrot("Australian Ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Bird penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
