package com.e_commerce.store.mapper;

import com.e_commerce.store.model.Shipping;
import com.e_commerce.store.dto.ShippingDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ShippingMapper {

    ShippingDTO shippingToShippingDTO(Shipping shipping);

    Shipping shippingDTOToShipping(ShippingDTO shippingDTO);
}