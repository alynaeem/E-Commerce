package com.e_commerce.store.mapper;

import com.e_commerce.store.model.Payment;
import com.e_commerce.store.dto.PaymentDTO;
import org.mapstruct.Mapper;

@Mapper
public interface PaymentMapper {

    PaymentDTO paymentToPaymentDTO(Payment payment);

    Payment paymentDTOToPayment(PaymentDTO paymentDTO);
}