package com.concepts;

import java.util.ArrayList;

public class VirtualCapacity {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>(20);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.add("E");
        System.out.println(arrayList.size());

    }
}
