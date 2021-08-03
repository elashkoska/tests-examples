package models;

public class Teacher {
    String designation="teacher";
    String college="UKIM";
    void does(){
        System.out.println("Teaching");
    }

    public void teaching()
    {
        System.out.println("Teaching subject");
    }

    protected void askingQuestions(){
        System.out.println("Asking questions");
    }

    public void add(int num1, int num2){
        System.out.println(num1+num2);
    }

    public void add(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }
}
