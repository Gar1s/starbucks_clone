package com.example.starbucks.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Coffee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(updatable = false)
    private Long id;
    @Column
    private String name;
    @Column
    private String date;
    @Column
    private TypeOfCoffee typeOfCoffee;
    @Column
    private RoastingLevel roastingLevel;
    @Column
    private Double price;
    
    @ManyToMany
    @JoinTable(name = "coffee_orders", 
               joinColumns = @JoinColumn(name = "coffee_id"),
               inverseJoinColumns = @JoinColumn(name = "order_id"))
    private Set<Coffee> coffees;
}
