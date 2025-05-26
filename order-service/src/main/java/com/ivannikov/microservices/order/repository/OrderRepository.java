package com.ivannikov.microservices.order.repository;

import com.ivannikov.microservices.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
