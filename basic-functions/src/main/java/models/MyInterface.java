package models;

public interface MyInterface {

     void method1();

     void method2();


    default void display2() {

        int x = 5;
        System.out.println("Successfully sent!");
    }
}
