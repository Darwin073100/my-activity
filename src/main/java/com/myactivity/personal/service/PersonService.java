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
        return (List<Person>) crud.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Person> findById(int id) {
        return (Optional<Person>) crud.findById(id);
    }

    /**
     * @param person
     * @return
     */
    @Override
    public Person save(Person person) {
        return  crud.save(person);
    }

    /**
     * @param id
     * @param person
     * @return
     */
    @Override
    public Person update(int id, Person person) {
        person.setId(id);
        return crud.saveAndFlush(person);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Boolean delete(int id) {
        return crud.findById(id).map(item ->{
            crud.deleteById(id);
            return true;
        }).orElse(false);
    }
}
