package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.DTO.CartItemDto;

import java.util.List;

public interface CartItemService {
    List<CartItemDto> getAllCartItems();

    CartItemDto getCartItemById(Long id);

    CartItemDto addCartItem(CartItemDto CartItemDTO);

    CartItemDto updateCartItem(Long id, CartItemDto CartItemDTO);

    void deleteCartItem(Long id);
}
