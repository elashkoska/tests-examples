package models;

public class Employee extends Person {
    private String name = "Elena";
    private int salary;
    private String address;
    private static String embg = "abc123";

    public Employee() {
        this("Name");
    }

    public Employee(String name) {

        this(name, 12345);
    }

    public Employee(String name, int salary) {
        this(name, salary, "XYZABC");
    }


    public Employee(String name, int salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    void printName() {
        System.out.println(super.name);
    }

    public void display() {
        System.out.println("emp name" + name);
        System.out.println("emp salary" + salary);
        System.out.println("emp age" + address);
    }

    public static void callMessage() {
        System.out.println("Message received");
        System.out.println("The embgs are" + embg);
    }

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.printName();
        obj.display();
        callMessage();
    }
}
