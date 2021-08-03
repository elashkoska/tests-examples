package models;

public class JavaExample {
    private static String str = "Factfullness";
    private static String name="Elena";
    private static String name2="Elena";

    static class MyNestedClass {
        public void display() {
            System.out.println("Display");
        }
    }

    public static void main(String args[]) {
        JavaExample.MyNestedClass obj = new JavaExample.MyNestedClass();
        JavaExample.MyNestedClass obj2 = new JavaExample.MyNestedClass();
        System.out.println(obj.toString());
        System.out.println(name==name2);
        obj.display();
    }
}
