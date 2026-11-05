package com.ecommerce.ecommerce.Repository;

import com.ecommerce.ecommerce.DTO.OrderDto;
import com.ecommerce.ecommerce.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderDto,Long> {
}
