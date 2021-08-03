package genericExercises;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

    public static void main(String args[]) {
        Container<Integer, String> container = new Container<>(12, "Hello");
        int val1 = container.getItem1();
        String val2 = container.getItem2();

        Set<String> mySet = new HashSet<>();
        mySet.add("first");
        mySet.add("second");
        mySet.add("third");


        Set<String> mySet2 = new HashSet<>();
        mySet2.add("first");
        mySet2.add("second");
        mySet2.add("computer");

        Set<String> resultSet = union(mySet, mySet2);


        Iterator<String> iterator = resultSet.iterator();
        while (iterator.hasNext()) {
            String var = iterator.next();
            System.out.println(var);
        }
    }


    public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
}
