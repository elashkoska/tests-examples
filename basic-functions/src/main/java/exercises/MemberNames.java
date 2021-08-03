package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class MemberNames {

    public static void main(String args[]) {


        List<String> memberNames = new ArrayList<>();
        memberNames.add("Elena");
        memberNames.add("Bojan");
        memberNames.add("Mice");
        memberNames.add("Vace");
        memberNames.add("Filip");
        memberNames.add("Jovana");
        memberNames.add("Viktor");
        memberNames.add("Mice");
        memberNames.add("Viktorija");


        List<String> filteredNamesWithout = memberNames
                .stream()
                .filter(p -> p.startsWith("E"))
                .collect(Collectors.toList());
        System.out.println(filteredNamesWithout);

        Set<String> noneDuplicateNames = memberNames
                .stream()
                .collect(Collectors.toSet());

        System.out.println(noneDuplicateNames);


        memberNames.stream()
                .filter(p -> p.startsWith("E"))
                .map(s -> s.toLowerCase())
                .forEach(p -> System.out.println(p));
        // .forEach(System.out::println);


        memberNames.stream()
                .filter(p -> p.endsWith("a"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        memberNames.stream().sorted().map(String::toLowerCase)
                .forEach(System.out::println);

        Set<String> noDuplicateNames = memberNames
                .stream().collect(Collectors.toSet());
        System.out.println(noDuplicateNames);

        List<String> memberNamesUpperCase = memberNames.stream()
                .sorted()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(memberNamesUpperCase);


        List<String> memberNamesWithLowerCase = memberNames.stream()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(memberNamesWithLowerCase);

        boolean matchResult = memberNames.stream().anyMatch(p -> p.startsWith("E"));
        System.out.println(matchResult);

        boolean secondMatchResult = memberNames.stream().noneMatch(p -> p.equals("Bojan"));
        System.out.println(secondMatchResult);

        boolean filterMatchResult = memberNames.stream().allMatch(p -> p.endsWith("E"));
        System.out.println(filterMatchResult);

        long totalMatch = memberNames.stream().filter(p -> p.startsWith("M")).count();
        System.out.println(totalMatch);

        long match4 = memberNames.stream().filter(p -> p.startsWith("E")).count();
        System.out.println(match4);

        Optional<String> reduced = memberNames.stream()
                .reduce((s1, s2) -> s1 + "!!!" + s2);
        reduced.ifPresent(System.out::println);

     boolean recordEndsWithE=memberNames.stream()
             .anyMatch(p->p.endsWith("E"));
        System.out.println(recordEndsWithE);

        String firstMatchedName=memberNames.stream().filter(p->p.startsWith("E"))
                .findFirst().get();
        System.out.println(firstMatchedName);

        String secondMatchedName=memberNames.stream().filter(p->p.startsWith("B")).findFirst().get();
        System.out.println(secondMatchedName);
    }
}
