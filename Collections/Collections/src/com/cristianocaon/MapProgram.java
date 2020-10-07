package com.cristianocaon;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
//      java.util.Map<String, String> languages = new HashMap<>();
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "A compiled high level, object-oriented, platform independent language");
        languages.put("Python", "An interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "An algorithmic language");
        System.out.println(languages.put("Basic", "Beginners all purposes symbolic instruction code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the Map");
        } else {
            System.out.println(languages.put("Java", "This course is about Java"));
        }

        System.out.println("============================================================================");

//        languages.remove("Lisp");
        if(languages.remove("Algol", "An algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if(languages.replace("Lisp", "Therein lies madness", "A functional programming language with imperative features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }

        System.out.println(languages.replace("Scala", "This will not be added"));

        System.out.println("============================================================================");

        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
