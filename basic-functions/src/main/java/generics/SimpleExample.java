package generics;

import java.util.ArrayList;
import java.util.List;

public class SimpleExample {


    public static void main(String args[]) {

        List list = new ArrayList<>();
        list.add("abc");
        list.add(new Integer(5));

        for (Object object : list) {
            System.out.println(object);
            // String str = (String) object;//CASTING to STRING
        }

    }
}
