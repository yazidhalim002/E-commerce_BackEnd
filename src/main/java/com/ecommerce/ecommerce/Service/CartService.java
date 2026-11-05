package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.DTO.CartDto;

import java.util.List;

public interface CartService {
    List<CartDto> getAllProducts();

    CartDto getProductById(Long id);

    CartDto addProduct(CartDto CartDTO);

    CartDto updateProduct(Long id, CartDto CartDTO);

    void deleteProduct(Long id);
}
