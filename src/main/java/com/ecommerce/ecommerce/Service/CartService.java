package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.DTO.CartDto;

import java.util.List;

public interface CartService {
    List<CartDto> getAllCarts();

    CartDto getCartById(Long id);

    CartDto addCart(CartDto CartDTO);

    CartDto updateCart(Long id, CartDto CartDTO);

    void deleteCart(Long id);
}
