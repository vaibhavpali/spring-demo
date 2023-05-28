package com.vaibhav.demo.model;

import java.util.UUID;

public class Student {
    private final UUID id;
    private final int age;
    private final String firstName;
    private final String lastName;
    private final String course;

    public Student(UUID id, int age, String firstName, String lastName, String course) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    public UUID getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCourse() {
        return course;
    }
}
