package com.myactivity.personal.controller;

import com.myactivity.personal.entity.Picture;
import com.myactivity.personal.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/picture")
public class PictureController {
    @Autowired
    private PictureService service;

    @GetMapping
    public ResponseEntity<List<Picture>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Picture>> findById(@PathVariable int id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Picture> save(@RequestBody Picture picture){
        return  new ResponseEntity<>(service.save(picture), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Picture> update(@PathVariable int id, @RequestBody Picture picture){
        return new ResponseEntity<>(service.update(id, picture), HttpStatus.OK);
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
