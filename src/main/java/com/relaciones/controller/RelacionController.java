package com.relaciones.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RelacionController {

    @GetMapping
    private ResponseEntity<?> findAll(){
        return null;
    }

    @PostMapping
    private ResponseEntity<?> save(){
        return null;
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> findById(@PathVariable Long id){
        return null;
    }

    @DeleteMapping
    private ResponseEntity<?> deleteById(@PathVariable Long id){
        return null;
    }

    @PutMapping
    private ResponseEntity<?> update(){
        return null;
    }
}
