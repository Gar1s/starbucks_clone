package com.example.starbucks.controller;

import com.example.starbucks.dto.CoffeeDTO;
import com.example.starbucks.entity.Coffee;
import com.example.starbucks.services.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {
    private final CoffeeService coffeeService;

    @Autowired
    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @PostMapping(path = "/save")
    public ResponseEntity<Coffee> create(@RequestBody CoffeeDTO coffeeDTO) {
        return new ResponseEntity<>(coffeeService.create(coffeeDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Coffee>> getAll() {
        return new ResponseEntity<>(coffeeService.getAll(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Coffee> update(@RequestBody Coffee coffee) {
        return new ResponseEntity<>(coffeeService.update(coffee), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public HttpStatus delete(@PathVariable Long id) {
        coffeeService.delete(id);
        return HttpStatus.OK;
    }
}
