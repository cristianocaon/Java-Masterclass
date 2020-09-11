package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        // operators: = and +
            // = is an assignment operator
        // operands: 1 and 2
        System.out.println(result);

        int previousResult = result;
        System.out.println("Previous result: " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {   // == is a 'comparison' operator
            System.out.println("It is not an alien!");
            System.out.println("And I am scared");
        }

        int topScore = 80;
        // Logical operators: ==, !=, >, <, >=, <=, !
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        // Logical AND operator &&, bitwise &
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // Logical OR operator ||, bitwise |
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either one or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        // Logical NOT operator !, also known as complement operator
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);

        int ageOfClient = 20;
        boolean isEighteenOrOver = ageOfClient >= 18 ? true : false;
        System.out.println(isEighteenOrOver);

        double var1 = 20.0;
        double var2 = 80.0;
        double total = (var1 + var2) * 100;
        double res = total % 40.0;

        System.out.println("The total is " + total);

        boolean isZero = (res == 0) ? true : false;
        System.out.println("The result is " + isZero);

        if (!isZero) {
            System.out.println("Got some remainder: " + res);
        }
    }
}




