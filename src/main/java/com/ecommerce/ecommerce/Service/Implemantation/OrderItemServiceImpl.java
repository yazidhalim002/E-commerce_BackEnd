package com.ecommerce.ecommerce.Service.Implemantation;

import com.ecommerce.ecommerce.DTO.OrderItemDto;
import com.ecommerce.ecommerce.Service.OrderItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Override
    public List<OrderItemDto> getAllOrderItems() {
        return List.of();
    }

    @Override
    public OrderItemDto getOrderItemById(Long id) {
        return null;
    }

    @Override
    public OrderItemDto addOrderItem(OrderItemDto OrderItemDTO) {
        return null;
    }

    @Override
    public OrderItemDto updateOrderItem(Long id, OrderItemDto OrderItemDTO) {
        return null;
    }

    @Override
    public void deleteOrderItem(Long id) {

    }
}
