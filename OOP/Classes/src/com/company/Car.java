package com.company;

public class Car {

    // 'State' of the class (fields)
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // Methods are the 'Behaviour' of the class
    public void setModel(String model) {
        // 'this' refers to the corresponding field of the class
        // the other variable is passed as argument

        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
