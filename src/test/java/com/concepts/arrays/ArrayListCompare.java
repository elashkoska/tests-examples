package com.concepts.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {
    public static void main(String[] args) {

        //sort
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));

        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        ArrayList<String> l3 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        Collections.sort(l1);
        Collections.sort(l2);

        System.out.println(l1.equals(l2));
        System.out.println(l2.equals(l3));


        //compare 2 lists-find additional elements

        ArrayList<String> l4 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));

        ArrayList<String> l5 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        l4.removeAll(l5);
        System.out.println(l4);

        //find out missing element

        l5.removeAll(l4);
        System.out.println(l5);

        //common elements
        ArrayList<String> lang1 = new ArrayList<>(Arrays.asList("Java", "Python", "Ruby", "C#", "JS"));

        ArrayList<String> lang2 = new ArrayList<>(Arrays.asList("Java", "Python", "Ruby", "C#", "PHP"));
        lang1.retainAll(lang2);
        System.out.println(lang2);


    }
}
