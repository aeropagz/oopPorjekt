package com.fhkiel.oop.project;

import java.util.ArrayList;

public class PersonContainer {

    private static PersonContainer instance;
    private final ArrayList<Person> container;

    private PersonContainer() {
        super();
        this.container = new ArrayList<>();
    }

    public synchronized static PersonContainer getInstance() {
        if(instance == null) {
            instance = new PersonContainer();
        }
        return instance;
    }

    public Person addPerson(Person person) {
        this.getContainer().add(person);
        return person;
    }

    public ArrayList<Person> getContainer(){
        return this.container;
    }

}
