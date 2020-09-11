package com.company;

// Base class
public class Animal {

    // General characteristics about animals
    private int brain;
    private int body;
    private int size;
    private int weight;
    private String name;

    public Animal(int brain, int body, int size,
                  int weight, String name) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    // General behaviour of animals
    public void eat() {
        System.out.println("Animal.eat() called");
    }

    // General behaviour of animals
    public void move(int speed) {
        System.out.println("Animal.move() called. Animal is moving at " + speed);
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
