package ru.geekbrains.persist;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class PersonRepository {

    public PersonRepository(){
        persons.add(new Person("Ivan", "Ivanov"));
        persons.add(new Person("Petr", "Petrov"));
        persons.add(new Person("Sergey", "Sergeev"));
    }

    private final List<Person> persons = new ArrayList<>();

    public void insert(Person person){
        persons.add(person);
    }

    public List<Person> getAllPersons() {
        return Collections.unmodifiableList(persons);
    }

}
