package generics;

public class MultipleParameter<T, U> {
    T obj1;
    U obj2;

    public MultipleParameter(T obj1, U obj) {
        this.obj1 = obj1;
        this.obj2 = obj;
    }

    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }

    public static void main(String args[]){
        MultipleParameter<String,Integer> nameAge=new MultipleParameter<>("Elena",25);
        nameAge.print();
    }
}
