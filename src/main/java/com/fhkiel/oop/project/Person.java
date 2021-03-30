package com.fhkiel.oop.project;

import java.util.UUID;

public class Person {
    private final UUID id;
    private String name;
    private String firstname;
    private int age;

    public Person(long id, String name, String firstname, int age) {
        this.id = UUID.randomUUID();
        this.setName(name).setFirstname(firstname).setAge(age);
    }

    public Person(Person person) {
        this.id = UUID.randomUUID();
        this.setName(person.getName());
        this.setFirstname(person.getFirstname());
        this.setAge(person.getAge());
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    public final Person setName(String name) {
        this.name = name;
        return this;
    }

    public final Person setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public final Person setAge(int age) {
        this.age = age;
        return this;
    }
}
