package com.myactivity.personal.repository;

import com.myactivity.personal.entity.Person;
import java.util.List;
import java.util.Optional;

public interface PersonRepository {
    List<Person> findAll();
    Optional<Person> findById(int id);
    Person save(Person person);
    Person update(int id, Person person);
    Boolean delete(int id);
}
