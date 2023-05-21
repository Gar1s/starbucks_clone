package com.example.starbucks.repositories;

import com.example.starbucks.entity.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepos extends JpaRepository<Coffee, Long> {
}
