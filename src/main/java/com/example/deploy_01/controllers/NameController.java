package com.example.deploy_01.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @GetMapping
    public ResponseEntity<String> name(){
        return ResponseEntity.ok().body("CIAO DENISE");
    }
}
