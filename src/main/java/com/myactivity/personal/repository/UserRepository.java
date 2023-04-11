package com.myactivity.personal.repository;

import com.myactivity.personal.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> findAll();
    Optional<User> findById(int id);
    User save(User user);
    User update(int id, User user);
    Boolean delete(int id);
}
