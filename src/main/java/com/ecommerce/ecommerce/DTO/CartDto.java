package com.ecommerce.ecommerce.DTO;

import lombok.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {

    private Long id;
    private Long userId;
    private List<CartItemDto> cartItems;
    private BigDecimal totalPrice;
}