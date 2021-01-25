package com.concepts.HashMapConcepts;

import java.util.HashMap;

public class PhonebookImpl implements Phonebook {
    HashMap<String, String> nameNumber = new HashMap<>();


    @Override
    public void addNumber(String name, String number) {
        nameNumber.put(name, number);
    }

    @Override
    public String getNumber(String name) {
        return nameNumber.get(name);
    }
}
