package com.example.demo.controller;

import com.example.demo.model.Animal;
import com.example.demo.model.Bird;
import com.example.demo.model.Chicken;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AnimalResource {

    @GetMapping("/animal")
    @ResponseBody
    public ResponseEntity<String> getAnimal(){
        return new ResponseEntity<>(new Animal().toString(), HttpStatus.OK);
    }

    @GetMapping("/animal/bird")
    @ResponseBody
    public ResponseEntity<String> getBird(){
        return new ResponseEntity<>(new Bird().toString(), HttpStatus.OK);
    }

    @GetMapping("/animal/bird/chicken")
    @ResponseBody
    public ResponseEntity<String> getChicken(){
        return new ResponseEntity<>(new Chicken().toString(), HttpStatus.OK);
    }
}
