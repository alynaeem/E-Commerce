package com.e_commerce.store.mapper;

import com.e_commerce.store.model.SKU;
import com.e_commerce.store.dto.SKUDTO;
import org.mapstruct.Mapper;

@Mapper
public interface SKUMapper {

    SKUDTO skuToSKUDTO(SKU sku);

    SKU skuDTOToSKU(SKUDTO skuDTO);
}