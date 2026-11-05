package com.ecommerce.ecommerce.DTO;

import com.ecommerce.ecommerce.Enum.OrderStatus;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

    private Long id;
    private Long userId;
    private List<OrderItemDto> orderItems;
    private BigDecimal totalPrice;
    private LocalDateTime orderDate;
    private OrderStatus status;
}