package com.e_commerce.store.mapper;

import com.e_commerce.store.model.Product;
import com.e_commerce.store.dto.ProductDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {

    ProductDTO productToProductDTO(Product product);

    Product productDTOToProduct(ProductDTO productDTO);
}