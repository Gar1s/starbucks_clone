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
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(updatable = false)
    private Long id;
    @Column
    private Double price;
    @Column
    private String date;
    
    @ManyToMany(mappedBy = "orders")
    private Set<Coffee> coffees;
}
