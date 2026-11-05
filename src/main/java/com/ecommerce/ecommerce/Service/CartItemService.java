package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.DTO.CartItemDto;

import java.util.List;

public interface CartItemService {
    List<CartItemDto> getAllProducts();

    CartItemDto getProductById(Long id);

    CartItemDto addProduct(CartItemDto CartItemDTO);

    CartItemDto updateProduct(Long id, CartItemDto CartItemDTO);

    void deleteProduct(Long id);
}
