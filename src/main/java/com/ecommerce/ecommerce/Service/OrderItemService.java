package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.DTO.OrderItemDto;

import java.util.List;

public interface OrderItemService {
    List<OrderItemDto> getAllOrderItems();

    OrderItemDto getOrderItemById(Long id);

    OrderItemDto addOrderItem(OrderItemDto OrderItemDTO);

    OrderItemDto updateOrderItem(Long id, OrderItemDto OrderItemDTO);

    void deleteOrderItem(Long id);
}
