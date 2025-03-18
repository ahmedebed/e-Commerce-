package com.example.demo.Mapper;

import com.example.demo.Entity.Cart;
import com.example.demo.Entity.CartItem;
import com.example.demo.dto.CartDTO;
import com.example.demo.dto.CartItemDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
    @Mapping(target = "userId" ,source = "user.id")
    CartDTO toDTO(Cart cart);
    @Mapping(target = "user.id",source = "userId")
    Cart ToEntity(CartDTO cartDTO);

    @Mapping(target = "productId",source = "product.id")
    CartItemDTO toDTO(CartItem cartItem);
    @Mapping(target = "product.id",source = "productId")
    CartItem ToEntity(CartItemDTO cartItemDTO);
}
