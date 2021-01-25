package com.endava;

public class StudentId {
    private String name;
    private String idNumber;


    private static StudentId INSTANCE;


    private StudentId(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public static StudentId getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new StudentId("Elena", "123");
        }
        return INSTANCE;
    }
}
