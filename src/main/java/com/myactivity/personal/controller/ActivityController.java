package com.myactivity.personal.controller;

import com.myactivity.personal.entity.Activity;
import com.myactivity.personal.entity.Person;
import com.myactivity.personal.service.ActivityService;
import com.myactivity.personal.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/activity")
public class ActivityController {
    @Autowired
    private ActivityService service;

    @GetMapping
    public ResponseEntity<List<Activity>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Activity>> findById(@PathVariable int id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Activity> save(@RequestBody Activity activity){
        return  new ResponseEntity<>(service.save(activity), HttpStatus.CREATED);
    }
}
