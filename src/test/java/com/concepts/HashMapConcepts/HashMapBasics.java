package com.concepts.HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBasics {

    public static void main(String[] args) {

        //no indexing, order
        //null values, only 1 null key
        //not thread-safe

        HashMap<String, String> capitalMap = new HashMap<>();
        capitalMap.put("Macedonia", "Skopje");
        capitalMap.put("Deutschland", "Berlin");
        capitalMap.put("null", "Zurich");
        capitalMap.put("null", "LA");
        capitalMap.put("Russia", null);
        capitalMap.put("France", null);

        System.out.println(capitalMap.get("Deutschland"));
        System.out.println(capitalMap.get(null));
        System.out.println(capitalMap.get("France"));

        //iterator

        Iterator<String> it = capitalMap.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = capitalMap.get(key);
            System.out.println("key=" + key + " value=" + value);
        }


        //iterator : entrySet

        Iterator<Map.Entry<String, String>> it1 = capitalMap.entrySet().iterator();
        while (it1.hasNext()) {
            Map.Entry<String, String> entry = it1.next();
            //System.out.println("key= ", + entry.getKey()+ " and value=" +entry.getValue());
        }

        //lambda

        capitalMap.forEach((k, v) -> System.out.println("key=" + k + "and value= " + v));

    }
}
