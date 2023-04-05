package com.myactivity.personal.service;

import com.myactivity.personal.crud.PersonCrud;
import com.myactivity.personal.entity.Person;
import com.myactivity.personal.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService implements PersonRepository {
    @Autowired
    private PersonCrud crud;


    /**
     * @return
     */
    @Override
    public List<Person> findAll() {
        return crud.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Person> findById(int id) {
        return Optional.empty();
    }

    /**
     * @param person
     * @return
     */
    @Override
    public Optional<Person> save(Person person) {
        return Optional.empty();
    }

    /**
     * @param id
     * @param person
     * @return
     */
    @Override
    public Optional<Person> update(int id, Person person) {
        return Optional.empty();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Boolean delete(int id) {
        return null;
    }
}
