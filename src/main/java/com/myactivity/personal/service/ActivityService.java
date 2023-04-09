package com.myactivity.personal.service;

import com.myactivity.personal.crud.ActivityCrud;
import com.myactivity.personal.entity.Activity;
import com.myactivity.personal.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ActivityService implements ActivityRepository {
    @Autowired
    private ActivityCrud crud;

    /**
     * @return
     */
    @Override
    public List<Activity> findAll() {
        return (List<Activity>) crud.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Activity> findById(int id) {
        return (Optional<Activity>) crud.findById(id);
    }

    /**
     * @param activity
     * @return
     */
    @Override
    public Activity save(Activity activity) {
        LocalDateTime localDT = LocalDateTime.now();
        activity.setDate(localDT);
        return crud.save(activity);
    }

    /**
     * @param id
     * @param activity
     * @return
     */
    @Override
    public Activity update(int id, Activity activity) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Boolean delete(int id) {
        return null;
    }
}
