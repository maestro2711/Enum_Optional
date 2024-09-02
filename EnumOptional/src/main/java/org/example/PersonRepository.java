package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonRepository {

    private Map<String, Person> persons = new HashMap<>();

    public Person findById(String id ){
        for(Person person:persons.values()){
            if(persons.get(id).equals(id)){
                return person;
            }

        }
        return null;

    }

    public Person savePerson(Person person) {
        persons.put(person.id(), person);
        return person;
    }
}
