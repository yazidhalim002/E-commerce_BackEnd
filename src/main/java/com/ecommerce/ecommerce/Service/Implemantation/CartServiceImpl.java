package com.ecommerce.ecommerce.Service.Implemantation;

import com.ecommerce.ecommerce.DTO.CartDto;
import com.ecommerce.ecommerce.Service.CartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Override
    public List<CartDto> getAllProducts() {
        return List.of();
    }

    @Override
    public CartDto getProductById(Long id) {
        return null;
    }

    @Override
    public CartDto addProduct(CartDto CartDTO) {
        return null;
    }

    @Override
    public CartDto updateProduct(Long id, CartDto CartDTO) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }
}
