package com.e_commerce.store.mapper;

import com.e_commerce.store.model.Order;
import com.e_commerce.store.dto.OrderDTO;
import org.mapstruct.Mapper;

@Mapper
public interface OrderMapper {

    OrderDTO orderToOrderDTO(Order order);

    Order orderDTOToOrder(OrderDTO orderDTO);
}