package com.myactivity.personal.repository;

import com.myactivity.personal.entity.Hobby;

import java.util.List;
import java.util.Optional;

public interface HobbyRepository {
    List<Hobby> findAll();
    Optional<Hobby> findById(int id);
    Hobby save (Hobby hobby);
    Hobby update(int id, Hobby hobby);
    Boolean delete(int id);
}
