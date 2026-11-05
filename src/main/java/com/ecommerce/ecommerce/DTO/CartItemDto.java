package com.ecommerce.ecommerce.DTO;

import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDto {
        private Long id;
        private Long productId;
        private String productName;
        private BigDecimal price;
        private Integer quantity;
        private BigDecimal subtotal;
}