package com.myactivity.personal.crud;

import com.myactivity.personal.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityCrud extends JpaRepository<Activity, Integer> {
}
