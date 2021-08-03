package exercises;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employees {

    public static void main(String args[]) {

        List<String> names = new ArrayList<>();

        names.add("Elena");
        names.add("Bojan");
        names.add("Filip");
        names.add("Ana");


        System.out.println(names.stream().collect(Collectors.toList()));



}



}
