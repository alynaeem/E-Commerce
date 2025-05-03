package com.e_commerce.store.repository;

import com.e_commerce.store.model.Order;
import com.e_commerce.store.model.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByStatus(OrderStatus status);  // Add this method
}