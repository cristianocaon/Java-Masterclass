package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

// "Wrapper Class"
class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tim");

//        ArrayList<int> intArrayList = new ArrayList<int>();

        // Cannot use primitive types to create ArrayLists. (int)
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));

        // Wrapper classes for every primitive type.
        // Some data structures require classes/objects as types.
        Integer integer = new Integer(54);
        Double doubleValue = new Double((12.25));

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++) {
            // Autoboxing -> converting primitive int into Integer.
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i <= 10; i++) {
            // Unboxing -> taking from object wrapper and converting back into the primitive type.
            System.out.println(i + " -> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56;    // Integer.valueOf(56);
        int myInt = myIntValue;     // myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for(int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }
    }
}
