package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BaseController  {

    @GetMapping
    public ResponseEntity<?> getMee() {
        return new ResponseEntity<String>("Bhag jaaa", HttpStatus.CREATED);
    }

}
