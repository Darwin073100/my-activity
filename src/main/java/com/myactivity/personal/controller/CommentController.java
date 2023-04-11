package com.myactivity.personal.controller;
import com.myactivity.personal.entity.Comment;
import com.myactivity.personal.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService service;

    @GetMapping
    public ResponseEntity<List<Comment>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Comment>> findById(@PathVariable int id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Comment> save(@RequestBody Comment comment){
        return  new ResponseEntity<>(service.save(comment), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Comment> update(@PathVariable int id, @RequestBody Comment comment){
        return new ResponseEntity<>(service.update(id, comment), HttpStatus.OK);
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
