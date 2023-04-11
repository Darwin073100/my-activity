package com.myactivity.personal.util;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class Middleware {

    @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
    public ResponseEntity notFountError(){
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
