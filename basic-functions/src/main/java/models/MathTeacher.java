package models;

public class MathTeacher extends Teacher {
    String subject="math";

    void does(){
        super.does();
    }

    @Override
    public void teaching() {
        System.out.println("Math teaching");
    }


    public static void main(String args[]) {


        MathTeacher mathTeacher = new MathTeacher();
        System.out.println(mathTeacher.subject);
        System.out.println(mathTeacher.college);
        mathTeacher.does();
        mathTeacher.teaching();
    }
}
