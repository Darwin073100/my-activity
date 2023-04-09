package com.myactivity.personal.repository;

import com.myactivity.personal.entity.Activity;

import java.util.List;
import java.util.Optional;

public interface ActivityRepository {
    List<Activity> findAll();
    Optional<Activity> findById(int id);
    Activity save(Activity activity);
    Activity update(int id, Activity activity);
    Boolean delete(int id);
}
