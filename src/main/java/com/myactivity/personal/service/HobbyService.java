package com.myactivity.personal.service;

import com.myactivity.personal.crud.HobbyCrud;
import com.myactivity.personal.entity.Hobby;
import com.myactivity.personal.repository.HobbyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class HobbyService implements HobbyRepository {

    @Autowired
    private HobbyCrud crud;

    /**
     * @return
     */
    @Override
    public List<Hobby> findAll() {
        return (List<Hobby>) crud.findAll();
    }

    /**
     * @return
     */
    @Override
    public Optional<Hobby> findById(int id) {
        return (Optional<Hobby>) crud.findById(id);
    }

    /**
     * @param hobby
     * @return
     */
    @Override
    public Hobby save(Hobby hobby) {
        return (Hobby) crud.save(hobby);
    }

    /**
     * @param id
     * @param hobby
     * @return
     */
    @Override
    public Hobby update(int id, Hobby hobby) {
        return (Hobby) crud.saveAndFlush(hobby);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Boolean delete(int id) {
        return findById(id).map(item -> {
            crud.deleteById(id);
            return  true;
        }).orElse(false);
    }
}
