package com.ecommerce.ecommerce.DTO;

import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDto {
    private Long id;
    private Long productId;
    private String productName;
    private Integer quantity;
    private BigDecimal priceAtPurchase;
    private BigDecimal subtotal;
}