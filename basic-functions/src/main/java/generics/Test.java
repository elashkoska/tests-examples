package generics;

public class Test<T> {
    T obj;

    public Test(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }


    public static void main(String[] args) {
        Test<Integer> object = new Test<>(15);
        System.out.println(object.getObj());


        Test<String> name = new Test<>("Elena");
        System.out.println(name.getObj());
    }
}
