package com.myactivity.personal.crud;

import com.myactivity.personal.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonCrud extends JpaRepository<Person, Integer> {
}
