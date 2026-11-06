package com.ecommerce.ecommerce.Service.Implemantation;

import com.ecommerce.ecommerce.DTO.CartItemDto;
import com.ecommerce.ecommerce.Service.CartItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemServiceImpl implements CartItemService {

    @Override
    public List<CartItemDto> getAllCartItems() {
        return List.of();
    }

    @Override
    public CartItemDto getCartItemById(Long id) {
        return null;
    }

    @Override
    public CartItemDto addCartItem(CartItemDto CartItemDTO) {
        return null;
    }

    @Override
    public CartItemDto updateCartItem(Long id, CartItemDto CartItemDTO) {
        return null;
    }

    @Override
    public void deleteCartItem(Long id) {

    }
}
