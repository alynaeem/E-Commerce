package com.e_commerce.store.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentDTO {

    private Long id;
    private Long orderId;
    private double amount;
    private String paymentMethod;
    private String paymentStatus;
    private String transactionId;
}