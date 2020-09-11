package com.company;

public class Main {

    public static void main(String[] args) {

        // Encapsulation is the mechanism that allows you to
        // restrict the access to certain components in the objects
        // that are created.

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//

        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
