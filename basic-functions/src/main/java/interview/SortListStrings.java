package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListStrings {


    public static void main(String args[]) {

        List<String> stringList = Arrays.asList("Elena", "Bojan", "Ana", "Filip", "Marko");

        List<String> sortedString = stringList.stream().sorted().collect(Collectors.toList()); //ask Bojan is this correct? Why I can't print it

        System.out.println(sortedString);
    }

}
