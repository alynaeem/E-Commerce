package com.e_commerce.store.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SKUDTO {

    private Long id;
    private String skuCode;
    private String size;
    private String color;
    private double price;
    private int stockQuantity;
}