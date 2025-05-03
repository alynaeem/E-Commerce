package com.e_commerce.store.service;

import com.e_commerce.store.dto.OrderItemDTO;

public interface OrderItemService {
    OrderItemDTO getOrderItemById(Long id); // optional
    Iterable<OrderItemDTO> getAllOrderItems(); // optional
}
