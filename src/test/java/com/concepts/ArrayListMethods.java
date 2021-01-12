package com.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String args[]){

        ArrayList<String>ar1=new ArrayList<>();
        ar1.add("Java");
        ar1.add("Python");
        ar1.add("C#");

        ArrayList<String> ar2=new ArrayList<>();
        ar2.add("Testing");
        ar2.add("Development");

      //  ar1.addAll(ar2);
        System.out.println(ar1);
        ar1.addAll(2,ar2);
        System.out.println(ar1);

        ar1.clear();
        System.out.println(ar1);

        System.out.println(ar1.contains("Java"));

        ArrayList<String> names=new ArrayList<>(Arrays.asList("Elena","Bojan"));
        System.out.println(names);

        int i=names.lastIndexOf("Bojan");
        System.out.println(i);

        names.remove(1);
        System.out.println(names);

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        list.removeIf(num->num%2==0);
        System.out.println(list);

        ArrayList nameList=new ArrayList(Arrays.asList("Elena","Vace","Boki","Jovana","Boki","Vace"));
        System.out.println(nameList);
        nameList.retainAll(Collections.singleton("Boki"));
        System.out.println(nameList);

        ArrayList<String> newList=new ArrayList<>(Arrays.asList("Tom","Amnn","John","An","Sam","Son"));
        Object arr[]=newList.toArray();
        System.out.println(Arrays.toString(arr));

        for (Object o:arr)
        {
            System.out.println((String) o);
        }
    }
}
