package com.ecommerce.ecommerce.Repository;

import com.ecommerce.ecommerce.DTO.OrderItemDto;
import com.ecommerce.ecommerce.Model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
