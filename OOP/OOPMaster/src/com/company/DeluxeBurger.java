package com.company;

public class DeluxeBurger extends Hamburger {
    private boolean chips;
    private boolean drink;

    public DeluxeBurger(String bread, String meat) {
        super(bread, meat);
        this.chips = true;
        this.drink = true;
        super.cost = 15.0;
    }


}
