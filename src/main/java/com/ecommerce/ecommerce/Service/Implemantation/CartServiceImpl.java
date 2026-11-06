package com.ecommerce.ecommerce.Service.Implemantation;

import com.ecommerce.ecommerce.DTO.CartDto;
import com.ecommerce.ecommerce.Service.CartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Override
    public List<CartDto> getAllCarts() {
        return List.of();
    }

    @Override
    public CartDto getCartById(Long id) {
        return null;
    }

    @Override
    public CartDto addCart(CartDto CartDTO) {
        return null;
    }

    @Override
    public CartDto updateCart(Long id, CartDto CartDTO) {
        return null;
    }

    @Override
    public void deleteCart(Long id) {

    }
}
