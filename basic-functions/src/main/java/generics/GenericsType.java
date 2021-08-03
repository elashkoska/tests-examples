package generics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GenericsType<T> {

    private T t;


    public static void main(String args[]) {

        GenericsType<String> genericsType = new GenericsType<>();
        genericsType.setT("Elena");

        GenericsType genericsType1 = new GenericsType();
        genericsType1.setT("Elena");
        genericsType1.setT(5);

        //example this will cause Runtime Exception
//        ArrayList arrayList=new ArrayList();
//
//        arrayList.add("Elena");
//        arrayList.add(10);
//
//        String s1=(String)arrayList.get(0);
//        String s2=(String)arrayList.get(1);

    }


}
