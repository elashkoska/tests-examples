package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberExample {

    public static void main(String args[]) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(7);
        numbers.add(11);
        numbers.add(22);
        numbers.add(8);


        List<Integer> oddNumber = numbers.stream().filter(p -> p % 2 != 0).collect(Collectors.toList());
        System.out.println(oddNumber);


    }
}
