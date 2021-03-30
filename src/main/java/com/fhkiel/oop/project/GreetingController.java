package com.fhkiel.oop.project;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private final PersonContainer container = PersonContainer.getInstance();

    @PostMapping(path = "/person", consumes = "application/json", produces = "application/json")
    public Person addPerson(@RequestBody Person requestPerson){
        Person newPerson = new Person(requestPerson);
        return container.addPerson(newPerson);
    }

    @GetMapping("/person")
    public List<Person> getPersons(){
        return container.getContainer();
    }
}
