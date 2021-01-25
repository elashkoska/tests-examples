package com.concepts.HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {

    public static void main(String args[]) {
        HashMap<String, Integer> compMap = new HashMap<>();
        compMap.put("Google", 10000);
        compMap.put("Walmart", 20000);
        compMap.put("Amazon", 30000);
        compMap.put("Facebook", 5000);
        compMap.put("Cisco", 15000);

        System.out.println("size is: " + compMap.size());


       // compMap.forEach((k, v) -> System.out.println("key" + k + "value" + v);

        Iterator it = compMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry) it.next();
            System.out.println(pairs.getKey() + "=" + pairs.getValue());
        }


        List<String> compNameList = new ArrayList<>();
        for (String t : compNameList) {
            System.out.println(t);
        }

        List<Integer> employeValuesList = new ArrayList<>(compMap.values());
        System.out.println(employeValuesList.size());
        for (Integer e : employeValuesList) {
            System.out.println(e);
        }


    }

}
