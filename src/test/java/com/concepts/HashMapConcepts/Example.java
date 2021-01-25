package com.concepts.HashMapConcepts;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Example {
    public static void main(String args[]) {
        List<String> initialArray = Arrays.asList("Elena", "Bojan", "Vladimir", "Bojan", "Bojan", "Jovana", "Mice", "Filip");
//        Bojan, Elena, Filip, Vladimir, Jovana, Mice

        //  List<String> listWithoutDuplicates = initialArray.stream().distinct().collect(Collectors.toList());
        //   System.out.println(listWithoutDuplicates);


        //LinkedList

        LinkedHashSet<String> noDuplicatesNames = new LinkedHashSet<>(initialArray);
        System.out.println(noDuplicatesNames);

        Phonebook phonebook = new PhonebookImpl();
        phonebook.addNumber("Elena", "1324");
        phonebook.addNumber("Bojan", "55555");
        phonebook.addNumber("Vace", "9999");

        System.out.println(phonebook.getNumber("Bojan")); // 555555

    }
}
