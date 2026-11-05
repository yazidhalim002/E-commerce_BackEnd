package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.DTO.OrderItemDto;

import java.util.List;

public interface OrderItemService {
    List<OrderItemDto> getAllProducts();

    OrderItemDto getProductById(Long id);

    OrderItemDto addProduct(OrderItemDto OrderItemDTO);

    OrderItemDto updateProduct(Long id, OrderItemDto OrderItemDTO);

    void deleteProduct(Long id);
}
