package com.e_commerce.store.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShoppingCartDTO {

    private Long id;
    private Long userId; // The user who owns this shopping cart
    private List<Long> productIds; // List of product IDs in the cart
    private double totalPrice; // Total price of all products in the cart
}