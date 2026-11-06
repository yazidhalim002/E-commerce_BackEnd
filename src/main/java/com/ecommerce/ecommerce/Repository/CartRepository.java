package com.ecommerce.ecommerce.Repository;

import com.ecommerce.ecommerce.DTO.CartDto;
import com.ecommerce.ecommerce.Model.Cart;
import com.ecommerce.ecommerce.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {
}
