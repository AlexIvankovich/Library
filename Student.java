package com.itstep.library;

public class Student extends Person {
    public Student(String firstName, String lastName, String id) {
        super(firstName, lastName, id);
    }

    @Override
    public String getRole() {
        return "Студент";
    }

    @Override
    public String toString() {
        return getRole() + " - " + super.toString();
    }
}

