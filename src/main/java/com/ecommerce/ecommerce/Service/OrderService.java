package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.DTO.OrderDto;

import java.util.List;

public interface OrderService {
    List<OrderDto> getAllOrders();

    OrderDto getOrderById(Long id);

    OrderDto addOrder(OrderDto OrderDTO);

    OrderDto updateOrder(Long id, OrderDto OrderDTO);

    void deleteOrder(Long id);
}
