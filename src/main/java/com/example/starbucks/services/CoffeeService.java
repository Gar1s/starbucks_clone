package com.example.starbucks.services;

import com.example.starbucks.dto.CoffeeDTO;
import com.example.starbucks.entity.Coffee;
import com.example.starbucks.repositories.CoffeeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {
    private final CoffeeRepos coffeeRepos;
    @Autowired
    public CoffeeService(CoffeeRepos coffeeRepos) {
        this.coffeeRepos = coffeeRepos;
    }
    public Coffee create(CoffeeDTO coffeeDTO){
        Coffee coffee = Coffee.builder()
                .name(coffeeDTO.getName())
                .date(coffeeDTO.getDate())
                .typeOfCoffee(coffeeDTO.getTypeOfCoffee())
                .roastingLevel(coffeeDTO.getRoastingLevel())
                .price(coffeeDTO.getPrice())
                .build();
        return coffeeRepos.save(coffee);
    }
    public List<Coffee> getAll(){
        return coffeeRepos.findAll();
    }
    public Coffee update(Coffee coffee){
        return coffeeRepos.save(coffee);
    }
    public void delete(Long id){
        coffeeRepos.deleteById(id);
    }
}
