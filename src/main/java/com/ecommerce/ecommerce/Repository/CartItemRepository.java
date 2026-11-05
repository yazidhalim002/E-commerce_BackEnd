package com.ecommerce.ecommerce.Repository;

import com.ecommerce.ecommerce.DTO.CartItemDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItemDto,Long> {
}
