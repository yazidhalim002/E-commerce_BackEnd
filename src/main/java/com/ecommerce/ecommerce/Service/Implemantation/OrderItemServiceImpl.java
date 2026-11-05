package com.ecommerce.ecommerce.Service.Implemantation;

import com.ecommerce.ecommerce.DTO.OrderItemDto;
import com.ecommerce.ecommerce.Service.OrderItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Override
    public List<OrderItemDto> getAllProducts() {
        return List.of();
    }

    @Override
    public OrderItemDto getProductById(Long id) {
        return null;
    }

    @Override
    public OrderItemDto addProduct(OrderItemDto OrderItemDTO) {
        return null;
    }

    @Override
    public OrderItemDto updateProduct(Long id, OrderItemDto OrderItemDTO) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }
}
