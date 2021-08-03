package models;

public class Person implements MyInterface2, MyInterface {


    public String name = "Bojan";
    int age;


    public Person() {
        //this is no-arg constructor
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }



    public static void main(String args[]) {
        Person person = new Person("Elena", 27);
        System.out.println(person.name);
        person.display();
    }

    @Override
    public void method1() {
        System.out.println("meth1");
    }

    @Override
    public void method2() {
        System.out.println("math2");
    }}
