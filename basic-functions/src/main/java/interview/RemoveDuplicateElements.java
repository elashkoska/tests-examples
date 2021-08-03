package interview;

import com.google.common.collect.Lists;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElements {

    public static void main(String args[]) {


        List<Integer> listWithDuplicates = Lists.newArrayList(0, 1, 1, 2, 3, 4, 0);
        //List<Integer> lisWithoutDuplicates=new ArrayList<>(new HashSet<>(listWithDuplicates));

        Set<Integer> listWithoutD = new HashSet<>(listWithDuplicates);
        System.out.println(listWithoutD);

    }
}
