package com.myactivity.personal.controller;

import com.myactivity.personal.entity.User;
import com.myactivity.personal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> findById(@PathVariable int id){
        return service.findById(id).map(item ->{
            return new ResponseEntity<>(item, HttpStatus.OK);
        }).orElse(new ResponseEntity(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user){
        return  new ResponseEntity<>(service.save(user), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable int id, @RequestBody User user){
        return new ResponseEntity<>(service.update(id, user), HttpStatus.OK);
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
