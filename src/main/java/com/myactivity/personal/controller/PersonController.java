package com.myactivity.personal.controller;

import com.myactivity.personal.entity.Person;
import com.myactivity.personal.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService service;

    @GetMapping
    public ResponseEntity<List<Person>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Person>> findById(@PathVariable int id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Person> save(@RequestBody Person person){
        return  new ResponseEntity<>(service.save(person), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Person> update(@PathVariable int id, @RequestBody Person person){
        return new ResponseEntity<>(service.update(id, person), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id){
        if(service.delete(id)){
            return new ResponseEntity<>("Registro Eliminado",HttpStatus.OK);
        }else {
            return new ResponseEntity<>("Registro No encontrado",HttpStatus.NOT_FOUND);
        }
    }
}
