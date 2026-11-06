package com.ecommerce.ecommerce.Repository;

import com.ecommerce.ecommerce.DTO.CartItemDto;
import com.ecommerce.ecommerce.Model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem,Long> {
}
