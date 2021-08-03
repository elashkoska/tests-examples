package generics;

public class GenericFunctions {

    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + element);
    }

    static <T> void genericText(T obj) {
        System.out.println(obj.toString());
    }

    static <T> void genericInteger(T obj2) {
        System.out.println(obj2.getClass().getName());
    }


    public static void main(String args[]) {
        genericDisplay(1);
        genericDisplay("Elena");
        genericText(1);
        genericInteger(1111);
    }
}
