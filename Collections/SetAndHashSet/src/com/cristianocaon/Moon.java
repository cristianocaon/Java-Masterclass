package com.cristianocaon;

public class Moon extends HeavenlyBody {

    public Moon(String name, double orbitalPeriod) {
        super(name, BodyTypes.MOON, orbitalPeriod);
    }
}
