package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBuilders {
    public static void main(String args[]) {
        Stream<Integer> stream = Stream.of(4, 2, 5, 1, 3, 6, 7);
//        stream.forEach(p -> System.out.println(p));

//        List<Integer> evenNumbers = stream
//                .filter(p -> p % 2 == 0)
//                .sorted((a, b) -> b - a)
//                .map(a -> a * 1000)
//                .collect(Collectors.toList());

        boolean isAnyNumber5 = stream
                .parallel()
                .filter(p -> p % 2 == 0)
                .sorted((a, b) -> b - a)
                .map(a -> a * 1000)
                .noneMatch(p -> p.equals(10));

        System.out.println(isAnyNumber5);
    }

}
