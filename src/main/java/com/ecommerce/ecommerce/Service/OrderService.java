package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.DTO.OrderDto;

import java.util.List;

public interface OrderService {
    List<OrderDto> getAllProducts();

    OrderDto getProductById(Long id);

    OrderDto addProduct(OrderDto OrderDTO);

    OrderDto updateProduct(Long id, OrderDto OrderDTO);

    void deleteProduct(Long id);
}
