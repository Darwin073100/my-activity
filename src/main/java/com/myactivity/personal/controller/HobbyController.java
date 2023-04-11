package com.myactivity.personal.controller;

import com.myactivity.personal.entity.Hobby;
import com.myactivity.personal.service.HobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hobby")
public class HobbyController {
    @Autowired
    private HobbyService service;

    @GetMapping
    public ResponseEntity<List<Hobby>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Hobby>> findById(@PathVariable int id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Hobby> save(@RequestBody Hobby hobby){
        return  new ResponseEntity<>(service.save(hobby), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Hobby> update(@PathVariable int id, @RequestBody Hobby hobby){
        return new ResponseEntity<>(service.update(id, hobby), HttpStatus.OK);
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
