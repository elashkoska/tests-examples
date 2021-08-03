package interview;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String args[]) {

        Object myObject = new Object();
        String myVar = "hello";
        myObject = myVar;
        Employee emp = new Employee();
        Accountant acc = new Accountant();
        emp = acc;

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee());
        ArrayList<Accountant> accountants = new ArrayList<>();
        accountants.add(new Accountant());

        ArrayList<?> empl = new ArrayList<>();
        ArrayList<Accountant> accountants2 = new ArrayList<>();
        empl = accountants2;

        //upper bound
        ArrayList<? extends Employee> employees1 = new ArrayList<>();
        ArrayList<Accountant> accountants3 = new ArrayList<>();
        employees1 = accountants3;


        //lower bound
        ArrayList<? super Employee> employees4 = new ArrayList<>();
        ArrayList<Object> accountants1 = new ArrayList<>();
        employees4 = accountants1;

        makeEmployeeWork(employees);
        makeEmployeeWork(accountants);
    }


    public static void makeEmployeeWork(List<? extends  Employee> employees) {
        for (Accountant emp : (ArrayList<Accountant>)employees) {
            emp.work();
        }
    }
}
