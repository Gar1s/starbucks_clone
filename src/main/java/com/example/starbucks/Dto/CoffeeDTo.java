package com.example.starbucks.Dto;

import com.example.starbucks.entity.RoastingLevel;
import com.example.starbucks.entity.TypeOfCoffee;
import lombok.Data;

@Data
public class CoffeeDTo {
    private String name;
    private String date;
    private TypeOfCoffee typeOfCoffee;
    private RoastingLevel roastingLevel;
    private Double price;
}
