package com.concepts.HashMapConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

    public static void main(String[] args) {


        //synchronizedMap
        Map<String, String> map1 = new HashMap<>();
        map1.put("1", "Naveen");
        map1.put("2", "Tom");
        map1.put("3", "Lisa");

//synchronizedMap
        Map<String, String> syncMap = Collections.synchronizedMap(map1);
        System.out.println(syncMap);

//concurrentHashMap
        ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();

        concurrentMap.put("A", "Java");
        concurrentMap.put("B", "Python");
        concurrentMap.put("C", "Ruby");

        System.out.println(concurrentMap.get("A"));

    }
}
