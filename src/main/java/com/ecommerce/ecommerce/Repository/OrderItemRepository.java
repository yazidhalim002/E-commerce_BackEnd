package com.ecommerce.ecommerce.Repository;

import com.ecommerce.ecommerce.DTO.OrderItemDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItemDto,Long> {
}
