package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

    public static void main(String args[]) {


        IntStream.range(1, 10)
                .skip(5)
                .forEach((x) -> System.out.println(x));
        System.out.println();


        int val = IntStream.range(1, 5)
                .sum();
        System.out.println(val);

        Stream.of("Hello", "Name", "Tag")
                .sorted()
                .findFirst()
                .ifPresent((x) -> System.out.println(x));


        String[] items = {"car", "computer", "tea", "tone", "task", "ana"};
        Stream.of(items)
                .filter((x) -> x.startsWith("t"))
                .sorted()
                .forEach(x -> System.out.println(x + ""));
        System.out.println();

        Arrays.stream(new int[]{1,2,4,6,8,10})
                .map((x)->x*x)
                .average()
                .ifPresent(n-> System.out.println(n));
        System.out.println();

        List<String> listOFItems=Arrays.asList("Elena","Bojan","Filip");
        listOFItems.stream()
                .map(x->x.toLowerCase())
                .filter(x->x.startsWith("e"))
                .sorted()
                .forEach(x-> System.out.println(x +""));



    }
}
