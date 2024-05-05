package com.example.demo.controller;


import com.example.demo.model.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstController {

    @RequestMapping(value = "/first")
    public ResponseEntity<Test> method(@ModelAttribute Test test){
        return new ResponseEntity<>(test, HttpStatus.OK);
    }

    @RequestMapping(value = "/first2")
    public ResponseEntity<String> method2(){
        return new ResponseEntity<>("test api", HttpStatus.OK);
    }
}
