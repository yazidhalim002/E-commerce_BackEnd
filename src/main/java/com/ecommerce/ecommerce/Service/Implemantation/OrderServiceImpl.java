package com.ecommerce.ecommerce.Service.Implemantation;

import com.ecommerce.ecommerce.DTO.OrderDto;
import com.ecommerce.ecommerce.DTO.OrderDto;
import com.ecommerce.ecommerce.DTO.OrderItemDto;
import com.ecommerce.ecommerce.Model.*;
import com.ecommerce.ecommerce.Repository.OrderRepository;
import com.ecommerce.ecommerce.Repository.ProductRepository;
import com.ecommerce.ecommerce.Repository.UserRepository;
import com.ecommerce.ecommerce.Service.OrderService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public OrderServiceImpl(OrderRepository orderRepository, UserRepository userRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }




    // convert Order Item to Dto to map into the list in convert to dto function
    private OrderItemDto convertOrderItemToDto(OrderItem item) {

        OrderItemDto dto = new OrderItemDto();

        dto.setId(item.getId());

        if (item.getProduct() != null) {
            dto.setProductId(item.getProduct().getId());
            dto.setProductName(item.getProduct().getName());
        }

        dto.setQuantity(item.getQuantity());
        dto.setPriceAtPurchase(item.getPriceAtPurchase());

        dto.setSubtotal(
                item.getPriceAtPurchase()
                        .multiply(BigDecimal.valueOf(item.getQuantity()))
        );

        return dto;
    }

    private OrderItem convertOrderItemToEntity(OrderItemDto dto) {

        OrderItem item = new OrderItem();

        item.setQuantity(dto.getQuantity());
        item.setPriceAtPurchase(dto.getPriceAtPurchase());

        Product product = productRepository.findById(dto.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        item.setProduct(product);

        return item;
    }

    // convert order to orderdto
    private OrderDto convertToDto(Order order) {
        OrderDto dto = new OrderDto();

        dto.setId(order.getId());
       if(order.getUser() != null){
           dto.setUser(order.getUser());
       }
       dto.setOrderDate(order.getOrderDate());
       dto.setStatus(order.getStatus());
       dto.setTotalPrice(order.getTotalPrice());
       dto.setOrderItems(order.getOrderItems().stream().map(this::convertOrderItemToDto).collect(Collectors.toList()));


        return dto;

    }
    private Order convertToEntity(OrderDto orderDto) {

        Order order = new Order();

        order.setId(orderDto.getId());

        User user = userRepository.findById(orderDto.getUser().getId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        order.setUser(user);
        order.setOrderDate(orderDto.getOrderDate());
        order.setStatus(orderDto.getStatus());
        order.setTotalPrice(orderDto.getTotalPrice());

        List<OrderItem> items = orderDto.getOrderItems()
                .stream()
                .map(this::convertOrderItemToEntity)
                .collect(Collectors.toList());

        // Associate every item with its order
        items.forEach(item -> item.setOrder(order));

        order.setOrderItems(items);

        return order;
    }

        @Override
    public List<OrderDto> getAllOrders() {
        return orderRepository.findAll().stream().map(this::convertToDto).collect(Collectors.toList());
    }



    @Override
    public OrderDto getOrderById(Long id) {
        return orderRepository.findById(id)
                .map(this::convertToDto)
                .orElseThrow(()-> new RuntimeException("Order not found"));
    }

    @Override
    public OrderDto addOrder(OrderDto orderDto) {
        return convertToDto(orderRepository.save(convertToEntity(orderDto)));
    }

    @Override
    public OrderDto updateOrder(Long id, OrderDto orderDto) {
        Order order = orderRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Order not found"));

        order.setOrderDate(orderDto.getOrderDate());
        if(orderDto.getUser() != null){
            order.setUser(orderDto.getUser());
        }
        order.setStatus(orderDto.getStatus());
        order.setId(orderDto.getId());
        order.setTotalPrice(orderDto.getTotalPrice());
        order.setOrderItems(orderDto.getOrderItems().stream().map(this::convertOrderItemToEntity).collect(Collectors.toList()));

        return convertToDto(orderRepository.save(order));
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
