package com.e_commerce.store.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTO {

    private Long id;
    private Long userId;
    private String orderDate;
    private double totalPrice;
    private String status;
    private String shippingAddress;
    private String paymentStatus;
    private List<OrderItemDTO> orderItems;
}