package com.company;

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Car starting engine!";
    }

    public String accelerate() {
        return "Car accelerating!";
    }

    public String brake() {
        return "Car brake.";
    }


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Porsche extends Car {
    public Porsche(int cylinders) {
        super(cylinders, "Porsche");
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " starting engine!";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerating!";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " brake.";
    }
}

class Chevy extends Car {
    public Chevy(int cylinders) {
        super(cylinders, "Chevy");
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " starting engine!";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerating!";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " brake.";
    }
}

class Audi extends Car {
    public Audi(int cylinders) {
        super(cylinders, "Audi");
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " starting engine!";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerating!";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " brake.";
    }
}

public class Main {

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Car car = randomCar();
            System.out.println("Car generated: " + car.getName());
            System.out.println(car.startEngine());
            System.out.println(car.accelerate());
            System.out.println(car.brake());
            System.out.println("---------------");
        }
    }

    public static Car randomCar() {
        int random = (int) (Math.random() * 3) + 1;
        System.out.println("Random : " + random);
        switch(random) {
            case 1:
                return new Porsche(8);
            case 2:
                return new Chevy(4);
            case 3:
                return new Audi(6);
            default:
                return null;
        }
    }
}
