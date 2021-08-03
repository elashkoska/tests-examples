package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

    public static void main(String args[]) {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }


        List<Integer> evenNumbers = list.parallelStream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);


        List<String> animals = new ArrayList<>();
        animals.add("Monkey");
        animals.add("Lion");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Pig");


        List<String> startsWithM = animals.stream().filter(p -> p.startsWith("M")).map(String::toLowerCase).sorted().collect(Collectors.toList());
        System.out.println(startsWithM);


        List<String> elements = new ArrayList<>();
        elements.add("A");
        elements.add("B");
        elements.add("C");

        List<String> orderedElements = elements.stream().sorted().collect(Collectors.toList());
        System.out.println(orderedElements);
    }
}
