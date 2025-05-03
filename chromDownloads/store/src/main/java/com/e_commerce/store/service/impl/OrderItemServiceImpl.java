package com.e_commerce.store.service.impl;

import com.e_commerce.store.dto.OrderItemDTO;
import com.e_commerce.store.mapper.OrderItemMapper;
import com.e_commerce.store.model.OrderItem;
import com.e_commerce.store.repository.OrderItemRepository;
import com.e_commerce.store.service.OrderItemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    private final OrderItemRepository orderItemRepository;
    private final OrderItemMapper orderItemMapper;

    public OrderItemServiceImpl(OrderItemRepository orderItemRepository, OrderItemMapper orderItemMapper) {
        this.orderItemRepository = orderItemRepository;
        this.orderItemMapper = orderItemMapper;
    }

    @Override
    public OrderItemDTO getOrderItemById(Long id) {
        OrderItem item = orderItemRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Order item not found"));
        return orderItemMapper.orderItemToOrderItemDTO(item);
    }

    @Override
    public Iterable<OrderItemDTO> getAllOrderItems() {
        List<OrderItem> items = orderItemRepository.findAll();
        return items.stream()
                .map(orderItemMapper::orderItemToOrderItemDTO)
                .collect(Collectors.toList());
    }
}
