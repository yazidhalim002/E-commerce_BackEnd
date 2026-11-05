package com.ecommerce.ecommerce.Service.Implemantation;

import com.ecommerce.ecommerce.DTO.OrderDto;
import com.ecommerce.ecommerce.Service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public List<OrderDto> getAllProducts() {
        return List.of();
    }

    @Override
    public OrderDto getProductById(Long id) {
        return null;
    }

    @Override
    public OrderDto addProduct(OrderDto OrderDTO) {
        return null;
    }

    @Override
    public OrderDto updateProduct(Long id, OrderDto OrderDTO) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }
}
