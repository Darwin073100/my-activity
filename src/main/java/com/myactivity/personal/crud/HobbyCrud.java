package com.myactivity.personal.crud;

import com.myactivity.personal.entity.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbyCrud extends JpaRepository<Hobby, Integer> {
}
