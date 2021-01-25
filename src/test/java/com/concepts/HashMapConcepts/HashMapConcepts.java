package com.concepts.HashMapConcepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcepts {

    public static void main(String args[]) {

        Map<String, Integer> marks = new HashMap<>();
        marks.put("Nav", 100);
        marks.put("Tom", 200);
        marks.put("Lisa", 300);
        marks.put("Bojan", 400);
        marks.put("Ana", 600);
        marks.put("Ana", 1000);

        marks.put(null, 500);
        //marks.put(null, 700);
        //marks.put("Nav", 900);
        marks.get("Ana");
        //hashing hashCode()-->hashing


    }
}
