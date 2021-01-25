package com.concepts.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 7));

        //linkedSet
        LinkedHashSet<Integer> linkedHasgSet = new LinkedHashSet<>(numbers);

        ArrayList<Integer> numberListWithoutDuplicates = new ArrayList<>(linkedHasgSet);
        System.out.println(numberListWithoutDuplicates);

        ArrayList<String> chars = new ArrayList<>(Arrays.asList("E", "E", "B", "C"));
        LinkedHashSet<String> linkedChars = new LinkedHashSet<>(chars);
        ArrayList<String> charsWithoutDuplicates = new ArrayList<>(linkedChars);
        System.out.println(charsWithoutDuplicates);


        //stream

        ArrayList<Integer> marksList = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 2, 3, 3, 4, 5, 6, 7, 7, 8, 9));
        List<Integer> uniqueList = marksList.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);

        ArrayList<String> charList = new ArrayList<>(Arrays.asList("E", "E", "B", "C"));
        List<String> uniqueChars = charList.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueChars);
    }
}
