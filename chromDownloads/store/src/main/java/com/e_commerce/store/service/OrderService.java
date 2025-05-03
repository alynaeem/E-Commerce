package com.e_commerce.store.service;

import com.e_commerce.store.dto.OrderDTO;
import com.e_commerce.store.model.OrderStatus;

import java.util.List;

public interface OrderService {

    /**
     * Creates a new order
     * @param orderDTO Order data transfer object
     * @return Created order DTO
     */
    OrderDTO createOrder(OrderDTO orderDTO);

    /**
     * Retrieves an order by ID
     * @param id Order ID
     * @return Order DTO
     * @throws IllegalArgumentException if order not found
     */
    OrderDTO getOrderById(Long id);

    /**
     * Updates order status
     * @param id Order ID
     * @param status New status
     * @throws IllegalArgumentException if order not found
     * @throws IllegalStateException if status transition is invalid
     */
    void updateOrderStatus(Long id, OrderStatus status);

    /**
     * Deletes an order
     * @param id Order ID
     * @throws IllegalArgumentException if order not found
     * @throws IllegalStateException if order cannot be deleted (e.g., already shipped)
     */
    void deleteOrder(Long id);

    /**
     * Retrieves all orders
     * @return List of order DTOs
     */
    List<OrderDTO> getAllOrders();

    /**
     * Retrieves orders by status
     * @param status Order status to filter by
     * @return List of filtered order DTOs
     */
    List<OrderDTO> getOrdersByStatus(OrderStatus status);
}