package com.concepts.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
    public static void main(String[] args) {

        List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
        nameList.add("Java");
        nameList.add("Python");
        nameList.add("Ruby");

        //add or remove no need explicit synchronization, only to fetch a value

        synchronized (nameList) {
            Iterator<String> iterator = nameList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }

        //copyOnWriteArrayLis-class;Thread safe

        CopyOnWriteArrayList<String> employee = new CopyOnWriteArrayList<>();
        employee.add("Elena");
        employee.add("Bojan");
        employee.add("Filip");

        Iterator<String> it = employee.iterator();
        {
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }
}
