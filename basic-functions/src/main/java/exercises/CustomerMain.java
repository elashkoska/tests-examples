package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerMain {
    public static void main(String args[]) {
        Customer john = new Customer("John", 15);
        Customer sara = new Customer("Sara", 200);
        Customer charles = new Customer("Charles", 150);
        Customer mary = new Customer("Mary", 1);

        List<Customer> customerList = Arrays.asList(john, sara, charles, mary);

        List<Customer> customersWithMoreThan100Points = customerList
                .stream()
                .filter(p -> p.getPoints() > 100)
                .collect(Collectors.toList());
        System.out.println(customersWithMoreThan100Points);

        List<Customer> charlesWithMoreThan100Points = customerList
                .stream()
                .filter(p -> p.getPoints()>100 && p.getName().contains("Ch"))
                .collect(Collectors.toList());
        System.out.println(charlesWithMoreThan100Points);



    }
}
