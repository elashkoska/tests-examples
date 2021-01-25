package com.concepts.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

    public static void main(String[] args) {


        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("e");
        arrayList.add(1);
        arrayList.add(2);

        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println("HI=" + (arrayList.size() - 1));


        //list with other collection

        ArrayList<Integer> listNumber = new ArrayList(Arrays.asList(10, 20, 30));
        System.out.println(listNumber);

        for (Integer i : listNumber) {
            System.out.println(i);
        }


        listNumber.stream().forEach(e -> System.out.println(listNumber));
    }
}
