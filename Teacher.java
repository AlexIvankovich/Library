package com.itstep.library;

public class Teacher extends Person {
    public Teacher(String firstName, String lastName, String id) {
        super(firstName, lastName, id);
    }

    @Override
    public String getRole() {
        return "Преподаватель";
    }

    @Override
    public String toString() {
        return getRole() + " - " + super.toString();
    }

}

