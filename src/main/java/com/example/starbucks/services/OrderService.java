package com.example.starbucks.services;

import com.example.starbucks.dto.OrderDTO;
import com.example.starbucks.entity.Order;
import com.example.starbucks.repositories.OrderRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepos orderRepos;

    @Autowired
    public OrderService(OrderRepos orderRepos) {
        this.orderRepos = orderRepos;
    }

    public Order create(OrderDTO orderDTO) {
        Order order = Order.builder()
                .price(orderDTO.getPrice())
                .date(orderDTO.getDate())
                .build();
        return orderRepos.save(order);
    }

    public List<Order> getAll() {
        return orderRepos.findAll();
    }

    public Order update(Order order) {
        return orderRepos.save(order);
    }

    public void delete(Long id) {
        orderRepos.deleteById(id);
    }


}
