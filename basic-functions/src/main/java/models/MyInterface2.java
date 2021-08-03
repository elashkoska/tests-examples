package models;

public interface MyInterface2 {



    default void display() {

        int x = 5;
        System.out.println("Successfully sent!");
    }
}
