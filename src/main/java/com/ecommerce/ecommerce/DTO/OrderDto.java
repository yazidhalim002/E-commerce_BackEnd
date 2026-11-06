package com.ecommerce.ecommerce.DTO;

import com.ecommerce.ecommerce.Enum.OrderStatus;
import com.ecommerce.ecommerce.Model.OrderItem;
import com.ecommerce.ecommerce.Model.User;
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
    private User user;
    private List<OrderItemDto> orderItems;
    private BigDecimal totalPrice;
    private LocalDateTime orderDate;
    private OrderStatus status;

}