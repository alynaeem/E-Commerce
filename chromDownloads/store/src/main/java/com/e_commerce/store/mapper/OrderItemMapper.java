package com.e_commerce.store.mapper;

import com.e_commerce.store.model.OrderItem;
import com.e_commerce.store.dto.OrderItemDTO;
import org.mapstruct.Mapper;

@Mapper
public interface OrderItemMapper {

    OrderItemDTO orderItemToOrderItemDTO(OrderItem orderItem);

    OrderItem orderItemDTOToOrderItem(OrderItemDTO orderItemDTO);
}