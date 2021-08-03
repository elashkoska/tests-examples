package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TwoMaxValuesInArray {

    public static void main(String args[]) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(100);
        numbers.add(156);
        numbers.add(122);
        numbers.add(144);
        numbers.add(12);
        numbers.add(19);

        Optional<Integer> maxNumber = numbers.stream().max((o1, o2) -> o1.compareTo(o2));
        System.out.println(maxNumber);

    }
}
