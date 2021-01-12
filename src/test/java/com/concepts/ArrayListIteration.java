package com.concepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> studentArrayList = new ArrayList<>();
        studentArrayList.add("Vlad");
        studentArrayList.add("Mil");
        studentArrayList.add("Fil");

        for (int i = 0; i < studentArrayList.size(); i++) {
            System.out.println(studentArrayList.get(i));
        }


        for (String s : studentArrayList) {
            System.out.println(s);
        }

        studentArrayList.stream().forEach(e -> System.out.println(e));

        Iterator<String> it = studentArrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
