package com.e_commerce.store.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderItemDTO {

    private Long id;
    private Long productId;
    private int quantity;
    private double price;
}