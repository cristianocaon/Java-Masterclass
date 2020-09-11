package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myInt1 = 10;        // value type works directly with the "object".
        int myInt2 = myInt1;    // works distinctly, not referencing the int1 var.

        System.out.println("int1 = " + myInt1 + "\nint2 = " + myInt2);
        System.out.println("+-------------------------------------+");

        myInt2++;

        System.out.println("int1 = " + myInt1 + "\nint2 = " + myInt2);
        System.out.println("+-------------------------------------+");

        // "new" keyword also works to find out if it's a reference type variable.
        int[] array1 = new int[5];  // reference type, uses a reference, not the object itself.
        int[] array2 = array1;      // another reference to the same array object.

        System.out.println("array1 = " + Arrays.toString(array1));
        System.out.println("array2 = " + Arrays.toString(array2));

        System.out.println("+-------------------------------------+");

        // References variables represent the address, not the thing itself.
        array2[0] = 1;              // changes both array and array2, since they reference the same object.

        System.out.println("array1 = " + Arrays.toString(array1));
        System.out.println("array2 = " + Arrays.toString(array2));

        System.out.println("+-------------------------------------+");

        array2 = new int[] {4, 5, 6, 7 ,8};
        modifyArray(array1);

        System.out.println("array1 = " + Arrays.toString(array1));
        System.out.println("array2 = " + Arrays.toString(array2));

        System.out.println("+-------------------------------------+");

    }

    private static void modifyArray(int[] array) {

        array[0] = 2;
        array = new int[] {1, 2, 3, 4 ,5};
    }
}
