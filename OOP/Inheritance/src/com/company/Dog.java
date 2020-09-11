package com.company;

public class Dog extends Animal {

    // Unique characteristics of a dog, but not necessarily
    // of every animal (the base class).
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // Prior to inheriting a class, you must include a constructor
    // that calls the superclass' constructor.
    public Dog(int size, int weight, String name, int eyes,
                int legs, int tail, int teeth, String coat) {

        // We removed the brain and body parameter because we
        // know that Dogs have brain and body. Thus, we simplified
        // the job of having to enter this parameters.
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    // Better to use move() instead of super.move().
    // Because if we add extra functionality, we will first search in this class.
    // Then, if we don't find anything, we will jump to the base class (Animal).
    // By using super.move(), we straight jump to the base class without checking
    // the current class (Dog).
    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
