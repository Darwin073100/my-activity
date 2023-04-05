package com.myactivity.personal.controller;

import com.myactivity.personal.entity.Person;
import com.myactivity.personal.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService service;

    @GetMapping
    public ResponseEntity<List<Person>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }
}
