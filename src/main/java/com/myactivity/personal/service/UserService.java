package com.myactivity.personal.service;

import com.myactivity.personal.crud.UserCrud;
import com.myactivity.personal.entity.User;
import com.myactivity.personal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserRepository {
    @Autowired
    private UserCrud crud;

    /**
     * @return
     */
    @Override
    public List<User> findAll() {
        return (List<User>) crud.findAll();
    }

    /**
     * @return
     */
    @Override
    public Optional<User> findById(int id) {
        return (Optional<User>) crud.findById(id);
    }

    /**
     * @param user
     * @return
     */
    @Override
    public User save(User user) {
        return (User) crud.save(user);
    }

    /**
     * @param id
     * @param user
     * @return
     */
    @Override
    public User update(int id, User user) {

        return (User) crud.saveAndFlush(user);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Boolean delete(int id) {
        return findById(id).map(item ->{
            crud.deleteById(id);
            return true;
        }).orElse(false);
    }
}
