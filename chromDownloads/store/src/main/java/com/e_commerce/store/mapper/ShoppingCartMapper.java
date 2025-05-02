package com.e_commerce.store.mapper;

import com.e_commerce.store.model.ShoppingCart;
import com.e_commerce.store.dto.ShoppingCartDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ShoppingCartMapper {

    ShoppingCartDTO shoppingCartToShoppingCartDTO(ShoppingCart shoppingCart);

    ShoppingCart shoppingCartDTOToShoppingCart(ShoppingCartDTO shoppingCartDTO);
}