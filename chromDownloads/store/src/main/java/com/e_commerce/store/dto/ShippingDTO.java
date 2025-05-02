package com.e_commerce.store.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShippingDTO {

    private Long id;
    private Long orderId;
    private String shippingAddress;
    private String shippingMethod;
    private String trackingNumber;
    private String shippingStatus;
}