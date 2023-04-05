package com.myactivity.personal.crud;

import com.myactivity.personal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCrud extends JpaRepository<User, Integer> {
}
