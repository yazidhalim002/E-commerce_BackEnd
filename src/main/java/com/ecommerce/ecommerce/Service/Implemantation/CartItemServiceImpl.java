package com.ecommerce.ecommerce.Service.Implemantation;

import com.ecommerce.ecommerce.DTO.CartItemDto;
import com.ecommerce.ecommerce.Service.CartItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemServiceImpl implements CartItemService {
    @Override
    public List<CartItemDto> getAllProducts() {
        return List.of();
    }

    @Override
    public CartItemDto getProductById(Long id) {
        return null;
    }

    @Override
    public CartItemDto addProduct(CartItemDto CartItemDTO) {
        return null;
    }

    @Override
    public CartItemDto updateProduct(Long id, CartItemDto CartItemDTO) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }
}
