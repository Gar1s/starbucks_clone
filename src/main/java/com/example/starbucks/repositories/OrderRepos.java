package com.example.starbucks.repositories;

import com.example.starbucks.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepos extends JpaRepository<Order, Long> {
}
